
fun main(){
    println("Digite el numero entero positivo: ")
    val n= readLine()!!.toInt()
    var i=1
    println("LA TABLA DE MULTIPLICAR DE $n")
    repeat(times = 10){
        println("$n x $it = ${n*it}")
    }
}