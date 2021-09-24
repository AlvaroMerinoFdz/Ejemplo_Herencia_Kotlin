class Elefante(nombre: String, raza: String, peso: Double, color: String) : Animal(nombre, raza, peso, color) {
    override fun hacerRuido(): String {
        return this.nombre + " barrita."
    }
    init {
        this.nombre = "Elefante " + this.nombre
    }

    override fun hacerCaso(): Boolean {
        //El elefante no le hace caso a nadie
        return false
    }
}