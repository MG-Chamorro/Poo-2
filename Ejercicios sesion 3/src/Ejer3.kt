class Bus(var numeroRuta : Int,
          var capacidad : Int,
          var conductor : String)
{
    fun iniciarRuta() {
        println("El bus de la ruta $numeroRuta ha iniciado su recorrido.")
        println("Conductor: $conductor")
        println("Capacidad: $capacidad pasajeros")
        println("----------------------------")
    }
}

fun main()
{
    val bus1 = Bus(101, 40, "Pedro")
    val bus2 = Bus(204, 30, "Maria")

    bus1.iniciarRuta()
    bus2.iniciarRuta()
}