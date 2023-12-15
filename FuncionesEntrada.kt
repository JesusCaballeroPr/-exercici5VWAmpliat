import java.util.*

fun recogidaInt(mensaje: String, minimo:Int, maximo:Int):Int {
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
    return valor
}