package Ejercicios


fun main() {

    println("--CALCULO DE SALARIO SEGUN HORAS--")
    println("Ingrese la cantidad de horas trabajadas")
    val horasTrabajadas = readLine()!!.toInt()

    println("El salario del empleado es: ${calculoSalario(horasTrabajadas)}")
}


fun calculoSalario(horas: Int): Int {

    return if (horas < 35) horas * 15000
    else if (horas in 36..60) {
        val horasMasDe35 = horas - 35
        (35 * 15000) + (horasMasDe35 * 18000)
    } else if (horas > 60) {

        val cantidadHorasC1 = 35
        val cantidadHorasC2 = 25
        val cantidadHorasC3 = horas - 60

        return (cantidadHorasC1 * 15000) + (cantidadHorasC2 * 18000) + (cantidadHorasC3 * 25000)

    } else 0

}