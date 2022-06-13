package Ejercicios


fun main() {
    var ventas: Int

    println("--CALCULADORA DE COMISIONES--")
    println("--Ingrese las ventas del empleado en miles--")
    ventas = readLine()!!.toInt()

    while (ventas >= 0) {
        println("La comision de las ventas son: ${calculoComision(ventas)}")
        println("--Ingrese las ventas del empleado en miles--")
        ventas = readLine()!!.toInt()
    }


}


fun calculoComision(ventas: Int): Double {
    if (ventas < 50000) return ventas * 0.07
    if (ventas in 50000..99999) return ventas * 0.09
    if (ventas in 100000..199999) return ventas * 0.11
    if (ventas in 200000..500000) return ventas * 0.13
    return if (ventas > 500000) ventas * 0.15
    else 0.0
}

