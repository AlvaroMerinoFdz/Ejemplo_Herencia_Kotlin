abstract class Animal(
    var nombre: String,
    var raza: String,
    var peso: Double,
    var color: String
) {


    public fun vacunar(): String {
        return this.nombre + " ha sido vacunado"
    }

    public fun comer(): String {
        return this.nombre + " está comiendo"
    }

    public fun dormir():String {
        return this.nombre + " se va a echarse la siesta"
    }

    public abstract fun hacerRuido(): String
    public abstract fun hacerCaso(): Boolean


    override fun toString(): String {
        return  "\t Nombre: " + this.nombre + " , Raza: " + this.raza + " , Peso: " + this.peso + " Color: " + this.color
    }
}