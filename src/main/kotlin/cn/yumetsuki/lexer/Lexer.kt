package cn.yumetsuki.lexer

interface Lexer {
    fun analyze(stream: Sequence<Char>): Sequence<Token>
}