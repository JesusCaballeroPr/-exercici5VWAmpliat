fun precioBase (mensaje: String, esFullEquip: Boolean, siPortaBicis: Boolean):Int{
    var VOLKSWAGEN_CALIFORNIA = 73490
    if (esFullEquip&&siPortaBicis){
        VOLKSWAGEN_CALIFORNIA+=20000+250
    }
    else if (esFullEquip){
        VOLKSWAGEN_CALIFORNIA+=20000
    }
    else if (siPortaBicis){
        VOLKSWAGEN_CALIFORNIA+=250
    }
    println(mensaje)
    return VOLKSWAGEN_CALIFORNIA
}

fun fullEquip (recogidaString:String):Boolean{
    val esFullEquip=recogidaString=="s"
        return esFullEquip
}
fun portaBicis(recogidaString: String, esFullEquip:Boolean):Boolean{
    var VOLKSWAGEN_CALIFORNIA = 73490
    val siPortaBicis=recogidaString=="s"
    if (siPortaBicis&&esFullEquip){
        VOLKSWAGEN_CALIFORNIA+=20000+250
    }
    else if (esFullEquip){
        VOLKSWAGEN_CALIFORNIA+=20000
    }
    else if (siPortaBicis){
         VOLKSWAGEN_CALIFORNIA = 73490+250
    }
    return siPortaBicis
}

fun perdidaPorKmCalifornia(mensaje:String,km:Int, esFullEquip: Boolean,siPortaBicis: Boolean):Double{
    var VOLKSWAGEN_CALIFORNIA = 73490
    if (siPortaBicis&&esFullEquip){
        VOLKSWAGEN_CALIFORNIA+=20000+250
    }
    else if (esFullEquip){
        VOLKSWAGEN_CALIFORNIA+=20000
    }
    else if (siPortaBicis){
        VOLKSWAGEN_CALIFORNIA = 73490+250
    }
    val DESGASTE: Double =0.00001
    var resultado = (VOLKSWAGEN_CALIFORNIA*DESGASTE * km)
    println(mensaje)
    return resultado.toDouble()
}
fun perdidaPorAno(años: Long, esFullEquip: Boolean, siPortaBicis: Boolean, mensaje: String):Double {
    var valor = 0.0
    var VOLKSWAGEN_CALIFORNIA = 73490
    if (esFullEquip && siPortaBicis) {
        VOLKSWAGEN_CALIFORNIA += 20000 + 250
    } else if (esFullEquip) {
        VOLKSWAGEN_CALIFORNIA += 20000
    } else if (siPortaBicis) {
        VOLKSWAGEN_CALIFORNIA += 250
    }
    if (años < 6) {
        println(mensaje)

        return valor
    }
    if (años >= 6 || años <= 10) {
        var desgaste: Float = 0.0002f
        var resultado = (VOLKSWAGEN_CALIFORNIA * años * desgaste)
        valor = resultado.toDouble()
        println(mensaje)

        return valor
    } else if (años > 10) {
        var desgaste = 0.0004f
        var resultado = (años * desgaste * VOLKSWAGEN_CALIFORNIA)
        valor = resultado.toDouble()
        println(mensaje)

        return valor
    }
    println(mensaje)
    return valor
}
fun perdidaPorNeumatico(mensaje: String, km: Long,esFullEquip: Boolean,siPortaBicis: Boolean):Int{
    val NOBAJA=0
    val BAJA1=200
    val BAJA2=300
    var VOLKSWAGEN_CALIFORNIA = 73490
    var valor=0
    if (esFullEquip && siPortaBicis) {
        VOLKSWAGEN_CALIFORNIA += 20000 + 250
    }
    else if (esFullEquip){
        VOLKSWAGEN_CALIFORNIA+=20000
    }
    else if (siPortaBicis) {
        VOLKSWAGEN_CALIFORNIA += 250
    }
    if (km<5000){
        valor=NOBAJA
    }else if (km<10000 && km>5000){
        valor=BAJA1
    }else if(km>=10000){
        valor=BAJA2
    }
    println(mensaje)
    return valor
}
fun perdidaTotal(mensaje:String,perdiXkm:Double,perdiXano:Double, perdiXneu:Int,esFullEquip: Boolean,siPortaBicis: Boolean):Double{
    var VOLKSWAGEN_CALIFORNIA = 73490
    if (esFullEquip && siPortaBicis) {
        VOLKSWAGEN_CALIFORNIA += 20000 + 250
    }
    else if (esFullEquip){
        VOLKSWAGEN_CALIFORNIA+=20000
    }
    else if (siPortaBicis) {
        VOLKSWAGEN_CALIFORNIA += 250
    }
    var valor=VOLKSWAGEN_CALIFORNIA-(perdiXkm+perdiXneu+perdiXano)
    println(mensaje)
    return valor
}
