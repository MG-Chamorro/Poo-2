class Libro(var titulo: String, var autor: String, var anioPublicado: Int)
{
    fun mostrarInformacion()
    {
        println("Título: $titulo")
        println("Autor: $autor")
        println("Año de publicación: $anioPublicado")
        println("-----------------------------")
    }
}

fun main()
{
    val libro1 = Libro("Titanic", "Morgan Robertson", 1898)
    val libro2 = Libro("Las Crónicas de Narnia", "C. S. Lewis", 1950)
    val libro3 = Libro("Harry Potter", "J. K. Rowling", 1997)
    val libro4 = Libro("Blackwater", "Michael McDowell", 1983)

    libro1.mostrarInformacion()
    libro2.mostrarInformacion()
    libro3.mostrarInformacion()
    libro4.mostrarInformacion()
}