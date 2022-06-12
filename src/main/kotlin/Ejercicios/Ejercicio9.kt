package Ejercicios

fun factorial(num:Int):Int{
    var facto:Int=1
    for (i in 1..num){
        facto*=1
    }
    return facto
}

fun main(){
    val num:Int
    println("Ingrese el número entero positivo: ")
    num= readLine()!!.toInt()
    for (i in 1..num){
        println("número $i su ${factorial(i)}")
    }
}