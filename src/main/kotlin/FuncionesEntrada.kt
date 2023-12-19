import java.util.*

fun recogidaLong(mensaje: String, minimo:Long, maximo:Long):Long {
    val SCAN = Scanner(System.`in`)
    var valor = 0
    var dato = false
    do {
        println(mensaje)
        dato = SCAN.hasNextInt()
        if (!dato) {
            println("No es un carácter válido")
        } else {
            valor = SCAN.nextInt()
            if (valor < minimo || valor > maximo) {
                println("Fuera de rango")
                dato = false
            }
        }
        SCAN.nextLine()
    } while (!dato)
    return valor.toLong()
}
fun recogidaString(mensaje: String):String{
    val SCAN = Scanner(System.`in`)
    var valor = ""
    var dato = false
    do {
        println(mensaje)
        dato = SCAN.hasNextLine()
        if (!dato) {
            println("No es un carácter válido")
        } else {
            valor = SCAN.nextLine()
        }
    } while (!dato)
    return valor
}
