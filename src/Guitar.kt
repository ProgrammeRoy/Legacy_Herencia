//CLASS FATHER ADD OPEN TO ACCESS
open class Guitar(marca:String) {

    var marca:String=""
    var madera: String="Palo Rosa"
    var precio: Int= 1000

    init {
        this.marca = marca
    }

    constructor(marca: String,madera:String):this(marca){
        this.madera = madera
    }
    constructor(marca: String,madera: String,precio:Int):this(marca,madera){
        this.precio = precio
    }

    fun vender(n:String):String{
        return "Vendido"
    }
}