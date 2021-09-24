import kotlin.random.Random

class Perro(nombre: String, raza: String, peso: Double, color: String) : Animal(nombre, raza, peso, color) {
    fun sacarPaseo():String {
        return "El perro " + this.nombre + " se va a dar un paseíto."
    }
    init {
        this.nombre = "Perro " + this.nombre
    }

    override fun hacerRuido(): String {
        return "El perro " + this.nombre + " ladra: GUAUU"
    }

    override fun hacerCaso(): Boolean {
        var caso = false
        var aleatorio: Int = (0..100).random()
        if (aleatorio <= 90) caso = true
        return caso
    }
}