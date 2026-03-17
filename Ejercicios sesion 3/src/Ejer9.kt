open class Persona(var nombre: String, var edad: Int)

class Docente(nombre: String, edad: Int, var especialidad: String) : Persona(nombre, edad)
{
    fun mostrarDoc()
    {
        println("Docente: $nombre")
        println("Edad: $edad")
        println("Especialidad: $especialidad")
        println("----------------------")
    }
}

class Est(nombre: String, edad: Int, var carrera: String) : Persona(nombre, edad)
{
    fun mostrarEst()
    {
        println("Estudiante: $nombre")
        println("Edad: $edad")
        println("Carrera: $carrera")
        println("----------------------")
    }
}

fun main() {

    val docente1 = Docente("María López", 45, "Programación")
    val estudiante1 = Est("Carlos Gómez", 20, "Ingeniería en Sistemas")

    docente1.mostrarDoc()
    estudiante1.mostrarEst()

}