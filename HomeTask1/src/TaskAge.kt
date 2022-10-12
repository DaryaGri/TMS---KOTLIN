import java.lang.Integer.parseInt

fun main(){

    println("Введите возраст:")
    var age = readLine()
    var age1 = parseInt(age)
    println(ageDescription(age1))

}
fun ageDescription(age: Int): String =
    when{
        (age < 0) or (age >= 200) -> "Вы ввели некорректный возраст"
        age % 10 == 1 -> "$age год"
        age %100 in 11..14 -> "$age лет"
        age % 10 in 2..4 -> "$age года"
        age %100 == 15 -> "$age лет"
        else -> "$age лет"
    }
