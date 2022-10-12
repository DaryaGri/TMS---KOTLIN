
fun main (){
    println("Введите целое число >1:")
    var num = readLine()
    var num1 = Integer.parseInt(num)
    println(minDivisor(num1))


}
fun minDivisor(n: Int): Int {
    for (divisor in 2..n ){
        if (n % divisor == 0){
            return divisor
        }
    }
return n
}

