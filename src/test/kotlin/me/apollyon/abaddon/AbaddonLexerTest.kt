package me.apollyon.abaddon

import me.apollyon.abaddon.AbaddonLexer
import org.antlr.v4.runtime.ANTLRInputStream
import java.io.*
import java.util.*
import org.junit.Test as test
import kotlin.test.*

class AbaddonLexerTest {

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

    @test fun parseVarDeclarationAssignedAnIntegerLiteral() {
        assertEquals(listOf("VAR", "ID", "ASSIGN", "INTLIT", "EOF"),
                tokens(lexerForCode("var a = 1")))
    }

    @test fun parseVarDeclarationAssignedADecimalLiteral() {
        assertEquals(listOf("VAR", "ID", "ASSIGN", "DECLIT", "EOF"),
                tokens(lexerForCode("var a = 1.23")))
    }

    @test fun parseVarDeclarationAssignedASum() {
        assertEquals(listOf("VAR", "ID", "ASSIGN", "INTLIT", "PLUS", "INTLIT", "EOF"),
                tokens(lexerForCode("var a = 1 + 2")))
    }

    @test fun parseMathematicalExpression() {
        assertEquals(listOf("INTLIT", "PLUS", "ID", "ASTERISK", "INTLIT", "DIVISION", "INTLIT", "MINUS", "INTLIT", "EOF"),
                tokens(lexerForCode("1 + a * 3 / 4 - 5")))
    }

    @test fun parseMathematicalExpressionWithParenthesis() {
        assertEquals(listOf("INTLIT", "PLUS", "LPAREN", "ID", "ASTERISK", "INTLIT", "RPAREN", "MINUS", "DECLIT", "EOF"),
                tokens(lexerForCode("1 + (a * 3) - 5.12")))
    }
}