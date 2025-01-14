fun pedirNumero(msj: String): Double {
    var input: Double? = null
    while (input == null) {
        try {
            print(msj)
            input = readLine()!!.replace(" ", "").toDouble()
            if (input < 0) {
                println("\nValor incorrecto")
                input = null
            }
        } catch (e: NumberFormatException) {
            println("ERROR -> $e")
        }
    }
    return input
}
fun main(){
    var rectangulos = mutableListOf<Rectangulo>()
    var base: Double = 0.1
    var altura: Double = 0.1
    do {
        base = pedirNumero("Introduce la base del rectángulo >> ")
        altura = pedirNumero("Introduce la altura del rectángulo >> ")

        rectangulos.add(Rectangulo(base, altura))
    } while (base > 0 && altura > 0)

    for (rectangulo in rectangulos){
        rectangulo.perimetro()
        rectangulo.area()
        println()
    } // hola


}