fun main(args: Array<String>){

    /*
    1.Created father class (Guitar), writte before class "open"
      -Set properties and constructors
    2.Create son class (Acoustic)
      -Set constructor with "super(properties)"

     */
    val guitar = Guitar("Fender")
    println(guitar.marca)

    val acoustic = Acoustic("Epiphone","Rosewood")
    println(acoustic.marca + ": "+ acoustic.madera)

    println(acoustic.registrar())

}