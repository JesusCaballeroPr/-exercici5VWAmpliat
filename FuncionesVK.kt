/**
 * @param mensaje, Mensaje inicial
 * @param esFullEquip, Si la furgo es un modelo u otro
 * @param siPortaBicis, Si la furgo tiene para llevar bici
 */
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

/**
 * @param recogidaString,Aquí recogemos el dato de si es FullEquip
 */
fun fullEquip (recogidaString:String):Boolean{
    val esFullEquip=recogidaString=="s"
    return esFullEquip
}

/**
 * @param recogidaString, Recogemos el dato de si tiene porta bicis
 * @param esFullEquip, tambien queremos saber si se cumple esta condicion anteriormente nombrada
 */
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

/**
 * @param mensaje, Mensaje inicial
 * @param esFullEquip, Si la furgo es un modelo u otro
 * @param siPortaBicis, Si la furgo tiene para llevar bici
 */
fun perdidaPorKmCalifornia(mensaje:String,km:Int, esFullEquip: Boolean,siPortaBicis: Boolean):Double{
    var VOLKSWAGEN_CALIFORNIA = 73490
    /**
     * Aqui evaluamos si cumple las dos condiciones, o solo una de ellas
     */
    if (siPortaBicis&&esFullEquip){
        VOLKSWAGEN_CALIFORNIA+=20000+250
    }
    else if (esFullEquip){
        VOLKSWAGEN_CALIFORNIA+=20000
    }
    else if (siPortaBicis){
        VOLKSWAGEN_CALIFORNIA = 73490+250
    }
    /**
     * Aqui retornaremos resultado como resultado de calcular el desgaste
     */
    val DESGASTE: Double =0.00001
    var resultado = (VOLKSWAGEN_CALIFORNIA*DESGASTE * km)
    println(mensaje)
    return resultado.toDouble()
}
/**
 * @param años, Donde guardaremos la antigüedad de la furgo
 * @param mensaje, Mensaje inicial
 * @param esFullEquip, Si la furgo es un modelo u otro
 * @param siPortaBicis, Si la furgo tiene para llevar bici
 */
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
    /**
     * comenzamos a evaluar e imprimir los valores de acuerdo a los años del coche
     */
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
/**
 * @param mensaje, Mensaje inicial
 * @param km, Aquí guardaremos la cantidad de km recorridos por el coche
 * @param esFullEquip, Si la furgo es un modelo u otro
 * @param siPortaBicis, Si la furgo tiene para llevar bici
 */
fun perdidaPorNeumatico(mensaje: String, km: Long,esFullEquip: Boolean,siPortaBicis: Boolean):Int{
    /**
     * Evaluamos con 3 constantes cuanto pierde de valor el coche en funcion a los km que tiene el coche
     */
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
    /**
     * Y aqui vemos el valor que se retornará según esos km recorridos
     */
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

/**
 * @param mensaje, Mensaje inicial
 * @param perdiXkm, usaremos este valor para sumar a la devaluación
 * @param perdiXano, usaremos este valor para sumar a la devaluación
 * @param perdiXneu, usaremos este valor apra sumar a al devaluación
 * @param esFullEquip, como anteriormente, para reajustar el precio base
 * @param siPortaBicis como anteriormente, para reajustar el precio base
 */
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