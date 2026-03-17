interface Vehiculo
{
    fun Mover()
}

class Camion : Vehiculo
{
    override fun Mover()
    {
        println("El camion se mueve")
    }
}

class Motocicleta : Vehiculo
{
    override fun Mover()
    {
        println("La motocicleta se mueve")
    }
}

fun main(args: Array<String>)
{
    val camion1 = Camion()
    val moto1 = Motocicleta()

    camion1.Mover()
    moto1.Mover()
}