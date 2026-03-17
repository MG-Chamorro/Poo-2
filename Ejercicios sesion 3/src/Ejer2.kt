data class Producto
    (val nombre : String, val precio : Double, val cantidad : Int)

fun main ()
{
    val producto1 = Producto("Arroz", 25.0, 50)
    val producto2 = Producto("Frijoles", 30.5, 40)
    val producto3 = Producto("Azúcar", 20.0, 35)
    val producto4 = Producto("Aceite", 55.9, 20)
    val producto5 = Producto("Manzana", 15.25, 60)

    println(producto1)
    println(producto2)
    println(producto3)
    println(producto4)
    println(producto5)
}