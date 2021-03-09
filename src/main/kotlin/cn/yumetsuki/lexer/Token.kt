package cn.yumetsuki.lexer

sealed class Token(
    val type: String,
    val value: String
)

sealed class OperatorToken(
    value: String
) : Token("Operator", value)

object PlusOperatorToken: OperatorToken("+")
object SubOperatorToken: OperatorToken("-")