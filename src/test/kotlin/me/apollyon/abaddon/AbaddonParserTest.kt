package me.apollyon.abaddon

import me.apollyon.abaddon.AbaddonLexer
import me.apollyon.abaddon.AbaddonParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import java.io.*
import java.util.*
import org.junit.Test as test
import kotlin.test.*

class AbaddonParserTest {

    fun lexerForCode(code: String) = AbaddonLexer(ANTLRInputStream(StringReader(code)))

    fun lexerForResource(resourceName: String) = AbaddonLexer(ANTLRInputStream(this.javaClass.getResourceAsStream("/${resourceName}.abaddon")))

    fun tokens(lexer: AbaddonLexer): List<String> {
        val tokens = LinkedList<String>()
        do {
           val t = lexer.nextToken()
            when (t.type) {
                -1 -> tokens.add("EOF")
                else -> if (t.type != AbaddonLexer.WS) tokens.add(lexer.ruleNames[t.type - 1])
            }
        } while (t.type != -1)
        return tokens
    }

    fun parse(lexer: AbaddonLexer) : AbaddonParser.AbaddonFileContext = AbaddonParser(CommonTokenStream(lexer)).abaddonFile()

    fun parseResource(resourceName: String) : AbaddonParser.AbaddonFileContext = AbaddonParser(CommonTokenStream(lexerForResource(resourceName))).abaddonFile()

    @test fun parseAdditionAssignment() {
        assertEquals(
"""AbaddonFile
  Line
    AssignmentStatement
      Assignment
        T[a]
        T[=]
        BinaryOperation
          IntLiteral
            T[1]
          T[+]
          IntLiteral
            T[2]
    T[<EOF>]
""",
                toParseTree(parseResource("addition_assignment")).multiLineString())
    }

    @test fun parseSimplestVarDecl() {
        assertEquals(
"""AbaddonFile
  Line
    VarDeclarationStatement
      VarDeclaration
        T[var]
        Assignment
          T[a]
          T[=]
          IntLiteral
            T[1]
    T[<EOF>]
""",
                toParseTree(parseResource("simplest_var_decl")).multiLineString())
    }

    @test fun parsePrecedenceExpressions() {
        assertEquals(
"""AbaddonFile
  Line
    VarDeclarationStatement
      VarDeclaration
        T[var]
        Assignment
          T[a]
          T[=]
          BinaryOperation
            BinaryOperation
              IntLiteral
                T[1]
              T[+]
              BinaryOperation
                IntLiteral
                  T[2]
                T[*]
                IntLiteral
                  T[3]
            T[-]
            IntLiteral
              T[4]
    T[<EOF>]
""",
                toParseTree(parseResource("precedence_expression")).multiLineString())
    }


}
