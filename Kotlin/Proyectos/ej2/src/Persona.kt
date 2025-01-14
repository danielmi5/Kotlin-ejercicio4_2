class Persona(var peso: Double, var altura: Double) {
    var nombre = "Desconocido"
    val imc: Double
        get() = peso/(altura*altura)

    constructor(nombre: String, peso: Double, altura: Double): this(peso, altura){
        this.nombre = nombre
    }

    override fun toString(): String {
        return "$nombre con peso $peso Kg y altura $altura cm"
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}


