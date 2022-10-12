
fun main(){
    println( brickPasses(5, 2, 4, 2, 4))

}
fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean =
            ((a <= r) and ((b <= s) or (c <= s))) or
            ((b <= r) and ((a <= s) or (c <= s)))  or
            ((c <= r) and ((a <= s) or (b <= s)))