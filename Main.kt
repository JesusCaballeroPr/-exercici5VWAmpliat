import java.util.*

fun main(){
    val VOLKSWAGEN_CALIFORNIA = 73490
    val SCAN = Scanner(System.`in`)
    println("¿Es la versión Camper Full Equip? (s/n)")
    var respuesta = SCAN.nextLine()
    val esFullEquip = respuesta.toLowerCase() == "s"
    var precioBase=precioBase("El precio base de su coche es: ", esFullEquip)
    println(precioBase)
    var km = recogidaInt("Dígame cuántos km tiene su coche: ", 0, 1000000000)
    var perdidaXkm = perdidaPorKmCalifornia("Se le resta por km: ", km, esFullEquip)
    println(perdidaXkm)
    var perdidaXneumatico=perdidaPorNeumatico("Se le resta por desgaste neumatico: ",km,esFullEquip)
    println(perdidaXneumatico)
    var perdidaTotalSobreElValorOriginal= perdidaTotal("El valor actual del coche es: ", perdidaXkm, perdidaXneumatico, esFullEquip)
    println(perdidaTotalSobreElValorOriginal)
}


