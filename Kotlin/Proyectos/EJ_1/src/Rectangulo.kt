class Rectangulo(val base: Double, val altura: Double) {

    fun perimetro(){
        println("Perimetro es: ${base*2 + 2*altura} cm")
    }

    fun area(){
        println("EL área del rectángulo es: ${base*altura} cm²")
    }

    override fun toString(): String {
        return "Rectangulo de base $base cm y altura $altura cm."
    }
}