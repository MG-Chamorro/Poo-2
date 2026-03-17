class CuentaBancaria(private var numeroCuenta: Int, private var saldo: Double)
{
    fun Depositar(monto : Double)
    {
        saldo += monto
        println("Se deposito: $saldo")
    }

    fun Retirar(monto : Double)
    {
        if (monto <= saldo)
        {
            saldo -= monto
            println("Se retirar: $saldo")
        }
        else
        {
            println("Fondos insuficiente")
        }
    }

    fun Consultar()
    {
        println("Numero de cuenta: $numeroCuenta")
        println("Saldo actual: C$$saldo")
    }
}

fun main(args: Array<String>)
{
    val cuenta1 = CuentaBancaria(123456, 500.0)
    val cuenta2 = CuentaBancaria(654321, 800.0)

    cuenta1.Consultar()

    cuenta1.Depositar(200.0)

    cuenta2.Retirar(150.0)

    cuenta2.Consultar()
}