package cn.segema.learn.kotlin.base

fun main(args: Array<String>) {
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }

    var v1: Int = 10
    var v2: Int = 20

    println(sumLambda(v1, v2))  // 输出 30
}