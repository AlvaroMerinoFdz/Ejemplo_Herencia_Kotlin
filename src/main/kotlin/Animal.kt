abstract class Animal(
    var nombre: String,
    var raza: String,
    var peso: Double,
    var color: String,
    var vacunado: Boolean = false
) {


    public fun vacunar() {
    }

    public fun comer() {
    }

    public fun dormir() {
    }

    public abstract fun hacerRuido(): String
    public abstract fun hacerCaso(): Boolean


    override fun toString(): String {
        return this.javaClass.toString() + "Nombre: " + this.nombre + " , Raza: " + this.raza + " , Peso: " + this.peso + " Color: " + this.color
    }
}