package Ejercicios


fun main(){
    val n:Int

    println("Hasta que numero deseas la sumatoria")
    n= readLine()!!.toInt()
    var suma=0
    var i=1
    repeat(n){
        suma=suma+1
        println("intento $1 : $suma")
        i++
    }
}