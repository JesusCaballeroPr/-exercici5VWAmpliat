fun precioBase (mensaje:String, esFullEquip: Boolean):Int{
    var VOLKSWAGEN_CALIFORNIA = 73490
    if (esFullEquip){
        VOLKSWAGEN_CALIFORNIA+=20000
    }

    println(mensaje)
    return VOLKSWAGEN_CALIFORNIA
}

fun perdidaPorKmCalifornia(mensaje:String,km:Int, esFullEquip: Boolean):Double{
    var VOLKSWAGEN_CALIFORNIA = 73490
    if (esFullEquip) {
        VOLKSWAGEN_CALIFORNIA += 20000
    }
    val DESGASTE:Float=0.00001f
    var resultado = (VOLKSWAGEN_CALIFORNIA* DESGASTE * km)
    println(mensaje)
    return resultado.toDouble()
}
fun perdidaPorNeumatico(mensaje: String, km: Int,esFullEquip: Boolean):Int{
    val NOBAJA=0
    val BAJA1=200
    val BAJA2=300
    var VOLKSWAGEN_CALIFORNIA = 73490
    var valor=0
    if (esFullEquip) {
        VOLKSWAGEN_CALIFORNIA += 20000
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
fun perdidaTotal(mensaje:String,perdiXkm:Double, perdiXneu:Int,esFullEquip: Boolean):Double{
    var VOLKSWAGEN_CALIFORNIA = 73490
    if (esFullEquip) {
        VOLKSWAGEN_CALIFORNIA += 20000
    }
    var valor=VOLKSWAGEN_CALIFORNIA-(perdiXkm+perdiXneu)
    println(mensaje)
    return valor
}
