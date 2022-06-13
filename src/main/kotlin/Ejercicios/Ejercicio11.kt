package Ejercicios

fun main() {
    println("CALCULADORA NUMEROS PERFECTOS")
    println("Ingrese un numero:")
    val numero = readLine()!!.toInt()
    val suma = sumaDivisores(divisoresDeUnNumero(numero), numero)
    println(esNumeroPerfecto(suma, numero))

    println("NUMEROS PERFECTOS")
    numerosPerfectos(numero).forEach { i -> println(i) }

}

fun esNumeroPerfecto(sumaDivisores: Int, numeroIngresado: Int): String {
    return if (sumaDivisores == numeroIngresado) "El numero ingresado es perfecto"
    else "El numero no es perfecto"

}

fun numerosPerfectos(numero: Int): MutableList<Int> {

    val perfectos = mutableListOf<Int>()
    for (i in 1..numero) {
        if (sumaDivisores(divisoresDeUnNumero(i), i) == i) {
            perfectos.add(i)
        }
    }
    return perfectos
}