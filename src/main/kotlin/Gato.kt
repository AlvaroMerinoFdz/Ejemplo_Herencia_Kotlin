import kotlin.random.Random

class Gato(nombre: String, raza: String, peso: Double, color: String) : Animal(nombre, raza, peso, color) {
    fun toserBolaPelo(): String {
        return "El gato " + this.nombre + " tose una bola de pelo."
    }
    init {
        this.nombre = "Gato " + this.nombre
    }

    override fun hacerRuido(): String {
        return "El gato " + this.nombre + " maulla: MIAUU"
    }

    override fun hacerCaso(): Boolean {
        var caso = false
        var aleatorio: Int = (0..100).random()
        if (aleatorio <= 5) caso = true
        return caso
    }
}