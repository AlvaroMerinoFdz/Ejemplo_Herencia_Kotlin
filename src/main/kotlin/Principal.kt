fun main() {
    var animales: ArrayList<Animal> = ArrayList(10)
    var tiempo = 0
    var aleatorio: Int = 0
    var animal: Animal? = null

    println("Comienza la simulación del Parque")
    while (tiempo < 120) {
        Thread.sleep(1000)
        if (tiempo % 10 == 0) {
            animales = crearAnimal(animales)
        }
        if (tiempo % 2 == 0) {

            for (item in animales) {
                aleatorio = (1..5).random()
                when (aleatorio) {
                    1 -> println(item.comer())
                    2 -> println(item.dormir())
                    3 -> println(item.vacunar())
                    4 -> println(item.hacerRuido())
                    5 -> {
                        if (item.hacerCaso()) {
                            println(item.nombre + " ha hecho caso a su amo")
                        } else {
                            println(item.nombre + " hace lo que le da la gana")
                        }
                    }
                }
            }
        }
        try {
            if (tiempo % 20 == 0) {
                var prob = (1..100).random()
                if (prob <= 50) {
                    var i = (1..animales.size).random()
                    var animalEliminar: Animal = animales.get(i)
                    println(animalEliminar.nombre + " abandona el parque")
                    animales.remove(animalEliminar)
                }
            }
        }catch (error: IndexOutOfBoundsException){
            println(error.message)
        }

        tiempo++
    }
    println("Situación final del parque")
    println(animales)

    println("FIN DEL PROGRAMA")
}

fun crearAnimal(animales: ArrayList<Animal>): ArrayList<Animal> {
    var animal: Animal?
    //aparece un animal nuevo
    var aleatorio = (1..3).random()
    when (aleatorio) {
        1 -> {
            animal = crearGato()
            if (animal != null) {
                animales.add(animal)
            }
        }
        2 -> {
            animal = crearPerro()
            if (animal != null) {
                animales.add(animal)
            }
        }
        3 -> {
            animal = crearElefante()
            if (animal != null) {
                animales.add(animal)
            }
        }

    }
    return animales
}

fun crearGato(): Gato? {
    //persa, siamés, bobtail americano, maine coon
    //peso aleatorio
    // color asignado según la raza
    var aleatorio: Int = (1..3).random()

    var gato: Gato? = null
    var nombre: Int = (1..1000).random()
    when (aleatorio) {
        1 -> {//Raza persa
            gato = Gato(nombre.toString(), "Persa", (5..9).random().toDouble(), "verde")
        }
        2 -> {//Raza siamés
            gato = Gato(nombre.toString(), "Siamés", (6..12).random().toDouble(), "rojo")
        }
        3 -> {
            gato = Gato(nombre.toString(), "Bobtail", (8..12).random().toDouble(), "rojo")
        }
    }
    return gato
}

fun crearPerro(): Perro? {
    var aleatorio: Int = (1..3).random()

    var perro: Perro? = null
    var nombre: Int = (1..1000).random()
    when (aleatorio) {
        1 -> {//Raza persa
            perro = Perro(nombre.toString(), "Pastor Alemán", (5..9).random().toDouble(), "verde")
        }
        2 -> {//Raza siamés
            perro = Perro(nombre.toString(), "Labrador", (6..12).random().toDouble(), "rojo")
        }
        3 -> {
            perro = Perro(nombre.toString(), "Bulldog", (8..12).random().toDouble(), "rojo")
        }
    }
    return perro

}

fun crearElefante(): Elefante? {
    return Elefante((1..1000).random().toString(), "Africano", (650..900).random().toDouble(), "Amarillo")

}