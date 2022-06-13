package Ejercicios


fun main() {
    println("CANTIDAD DE DIVISORES DE UN NUMERO")
    println("Ingrese un numero:")
    val numero = readLine()!!.toInt()
    println("La cantidad de divisores es: ${calculoDivisores(numero)}")

}

fun calculoDivisores(numero: Int): Int {

    val divisores = mutableListOf<Int>()
    for (i in 1..numero) {
        if (numero % i == 0) {
            divisores.add(i)
            println(" $i es divisor del numero $numero ")
        }
    }
    return divisores.size

}