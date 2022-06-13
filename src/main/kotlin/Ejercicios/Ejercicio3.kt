package Ejercicios

import java.util.*


fun main() {

    var ventas: Double
    var salario: Double
    var usuarioDeseaContinuar = "SI"

    println("--CALCULADORA DE COMISIONES--")
    println("Ingrese las ventas realizadas del empleado:")
    ventas = readLine()!!.toDouble()
    println("Ingrese el salario realizadas del empleado:")
    salario = readLine()!!.toDouble()

    while (usuarioDeseaContinuar == "SI") {
        val comision = calculoComision(ventas)

        println("La comision realizadas por el empleado es $comision")
        println(
            "El salario con comision del empleado es ${
                salaraioConComision(
                    salario,
                    comision
                )
            }"
        )

        println("¿Desea continuar? (SI/NO)")
        usuarioDeseaContinuar = readLine()!!.toString().uppercase(Locale.getDefault())

        if (usuarioDeseaContinuar == "SI") {
            println("Ingrese las ventas realizadas del empleado:")
            ventas = readLine()!!.toDouble()
            println("Ingrese el salario realizadas del empleado:")
            salario = readLine()!!.toDouble()
        }

    }
}

fun calculoComision(ventas: Double): Double {
    return if (ventas > 50000) {
        ventas * 0.015
    } else 0.0
}

fun salaraioConComision(salario: Double, comision: Double): Double = salario + comision

