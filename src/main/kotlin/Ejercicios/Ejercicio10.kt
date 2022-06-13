package Ejercicios


fun main() {
    println("CANTIDAD DE DIVISORES DE UN NUMERO")
    println("Ingrese un numero:")
    val numero = readLine()!!.toInt()
    println("la suma de los divisores es: ${sumaDivisores(divisoresDeUnNumero(numero), numero)}")

}

fun sumaDivisores(divisores: MutableList<Int>, numero: Int): Int {
    var suma = 0
    divisores.forEach { i ->
        if (i < numero)
            suma += i
    }
    return suma
}


fun divisoresDeUnNumero(numero: Int): MutableList<Int> {

    val divisores = mutableListOf<Int>()
    for (i in 1..numero) {
        if (numero % i == 0) {
            divisores.add(i)
        }
    }
    return divisores

}