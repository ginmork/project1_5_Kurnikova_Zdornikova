fun main(args: Array<String>) {

    println("Введите целое число N и основание степени X: ")

    var n = readln().toDouble()
    var x = readln().toDouble()
    var y = Math.log(n) / Math.log(x)
    var result = Math.pow(x, y)

    if (y % 1 == 0.0) {
        println("Целочисленный показатель = ${y.toInt()}")
    } else {
        println("Целочисленный показатель не существует")
        return
    }

    if (result.toString().endsWith(".0")) {
        println("Ответ: ${result.toInt()}")
    } else {
        println("Ответ: $result")
    }


}