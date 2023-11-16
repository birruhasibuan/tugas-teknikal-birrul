class Hero(val Birrul: String, val age: Int, val height: Double) {
    var health: Int = 20

    fun setProfile() {
        println("Setting up profile...")
        println("Name: $Birrul")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("Profile setup complete.\n")
    }

    fun jalan() {
        println("$Birrul sedang berjalan.")
        health -= 2
    }

    fun lari() {
        println("$Birrul sedang berlari.")
        health -= 5
    }

    fun makan() {
        println("$Birrul sedang makan.")
        health += 3
    }

    fun minum() {
        println("$Birrul sedang minum.")
        health += 2
    }

    fun lompat() {
        println("$Birrul sedang melompat.")
        health -= 3
    }

    fun duduk() {
        println("$Birrul duduk sebentar.")
        health += 1
    }

    fun showStatus() {
        println("Status terkini:")
        println("Name: $Birrul")
        println("Health: $health")
    }
}

fun main() {
    // Membuat instance dari class Hero
    val hero = Hero("Birrul Hasibuan", 20, 170.5)

    // Mengisi nilai variable dengan class Hero menggunakan fungsi setProfile
    hero.setProfile()

    // Menampilkan status sebelum melakukan aktivitas
    hero.showStatus()

    // Melakukan aktivitas-aktivitas
    repeat(5) { hero.jalan() }
    repeat(4) { hero.lari() }
    repeat(4) { hero.makan() }
    repeat(4) { hero.minum() }
    repeat(3) { hero.lompat() }
    repeat(2) { hero.duduk() }

    // Menampilkan status terkini setelah melakukan aktivitas
    hero.showStatus()
}
