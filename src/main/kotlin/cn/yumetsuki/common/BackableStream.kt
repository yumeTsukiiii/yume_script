package cn.yumetsuki.common

interface RollbackStream<T>: Iterator<T> {
    fun peek(): T
    fun rollback()
}