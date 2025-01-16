fun pedirNombre(msj: String): String {
    var nombre = ""
    do {
        print(msj)
        nombre = readln()
    } while (nombre == "")
    return nombre
}


fun main(){
    val persona1 = Persona(60.3, 1.6)
    val persona2 = Persona("Miguel", 45.3, 1.4)
    val persona3 = Persona("Miguel", 45.3, 2.2)
    println(persona1)
    println(persona2)
    println(persona3)
    println()

    // 1
    persona1.nombre = pedirNombre("Introduce un nombre >> ")
    println("${persona1.nombre} mide ${persona1.altura} cm y su peso es de ${persona1.peso} Kg.\n")

    //3
    println("${persona3.nombre} mide ${persona3.altura} m y su imc es de ${persona3.imc} Kg/m².")
    persona3.altura = 1.8
    println("${persona3.nombre} mide ${persona3.altura} m y su imc es de ${persona3.imc} Kg/m².\n")

    //2
    persona2.altura = persona3.altura
    println("Persona2: $persona2       |      Persona3: $persona3")
    println("¿Los dos son iguales? -> ${persona2.equals(persona2)}")
}