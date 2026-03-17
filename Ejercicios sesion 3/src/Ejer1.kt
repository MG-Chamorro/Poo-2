class Estudiante(var nombre : String, var carnet: Int, var carrera: String, var anio : Int)
{
    fun mostrarDatos()
    {
        println("Nombre: $nombre")
        println("Carnet: $carnet")
        println("Carrera: $carrera")
        println("Año: $anio")
        println("--------------------")
    }
}

fun main()
{
    val est1 = Estudiante("Gabriel", 23458976, "Ing Sistemas", 2)
    val est2 = Estudiante("Maria", 12345678, "Ing. Industrial", 3)
    val est3 = Estudiante("Carlos", 72830459, "Arquitectura", 1)

    est1.mostrarDatos()
    est2.mostrarDatos()
    est3.mostrarDatos()
}

