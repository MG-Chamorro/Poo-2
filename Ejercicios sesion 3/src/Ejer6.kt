class Taxi(var placa: String, var conductor: String, var modelo: String)
{
    fun IniciarServicio()
    {
        println("Taxi con placa $placa ha iniciado servicio.")
        println("Conductor: $conductor")
        println("Modelo: $modelo")
        println("--------------------------")
    }
}

fun main(args: Array<String>)
{
    var taxi1 = Taxi("M135-324", "Mario", "Civic")
    var taxi2 = Taxi("G1353", "Miguel", "CRV")
    var taxi3 = Taxi("M234-254", "Jose", "Hilux")

    taxi1.IniciarServicio()
    taxi2.IniciarServicio()
    taxi3.IniciarServicio()
}