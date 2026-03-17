open class Empleado(var nombre: String, var salario: Double)
{
    class Programador(nombre: String, salario: Double, var lenguaje: String) : Empleado(nombre, salario)
    {
        fun mostrarInfo()
        {
            println("Nombre: $nombre")
            println("Salario: C$$salario")
            println("Lenguaje: $lenguaje")
        }
    }
}

fun main(args: Array<String>)
{
    var prog1 = Empleado.Programador("Carlos", 5000.0, "Java")
    prog1.mostrarInfo()
}