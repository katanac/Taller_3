package Ejercicios


fun main() {
    println("NUMEROS PRIMOS")
    println("Ingrese un numero:")
    val numero = readLine()!!.toInt()
    println(esNumeroPrimo(calculoDivisores(numero)))

    println("======================================")
    println("Numeros primos entre 2 y $numero son:")
    println(numerosPrimos(numero))

}


fun esNumeroPrimo(numeroDivisores: Int): String {
    return if (numeroDivisores == 2) {
        return "=====> Es numero primo"
    } else "=====>  No es numero primo"
}


fun numerosPrimos(numero: Int) {
    for (i in 2..numero) {
        val restoDivisibleEn1 = i / 1
        val restoDivisibleEnElMismo = i / i

        if (restoDivisibleEn1 == i && restoDivisibleEnElMismo == 1) {
            if (calculoDivisores(i) == 2)
                println(" numero primo : $i")
        }
    }
}