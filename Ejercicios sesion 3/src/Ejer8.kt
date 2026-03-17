data class Pedido(val cliente: String, val platillo : String, val precio : Double)

fun main()
{
    val Platos = listOf(
        Pedido("Luis Miguel", "Lecheagria", 150.0 ),
        Pedido("Carlos Montiel", "Nacatamal", 200.0),
        Pedido("Mauricio","Bistec",500.0)
    )

    for (p in Platos)
    {
        println("Cliente: ${p.cliente}, platillo: ${p.platillo}, precio: ${p.precio}")
    }
}