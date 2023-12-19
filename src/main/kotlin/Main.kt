fun main(){
    var esFullEquip=fullEquip(recogidaString("Tienes el modelo Full Equip? (s/n)"))
    var siPortaBicis=portaBicis(recogidaString("Tiene portabicis su modelo? (s/n)"),esFullEquip)
    var precioBase=precioBase("El precio base de su coche es: ", esFullEquip,siPortaBicis)
    println(precioBase)
    var km = recogidaLong("Dígame cuántos km tiene su coche: ", 0, 1000000000)
    var perdidaXkm = perdidaPorKmCalifornia("Se le resta por km: ", km.toInt(), esFullEquip,siPortaBicis)
    println(perdidaXkm)
    var perdidaXneumatico=perdidaPorNeumatico("Se le resta por desgaste neumatico: ",km,esFullEquip,siPortaBicis)
    println(perdidaXneumatico)
    var perdidaXAno=perdidaPorAno(recogidaLong("Cuántos años tiene su coche?",0,1000000),esFullEquip,siPortaBicis,"Después de esos años," +
            "se ha devaluado: ")
    println(perdidaXAno)
    var perdidaTotalSobreElValorOriginal= perdidaTotal("El valor actual del coche es: ", perdidaXkm,perdidaXAno, perdidaXneumatico, esFullEquip,siPortaBicis)
    println(perdidaTotalSobreElValorOriginal)
}


