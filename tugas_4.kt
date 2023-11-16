package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {
        val result1 = pembagian(20, 8)
        println("hasil pembagian dari 16/8 = $result1\n")

        val result2 = pembagian(10, 0)
        println("hasil pembagian dari 12/0 = $result2\n")
    }
    catch (e: ArithmeticException) {
        println("terjadi error : ${e.message}")
        println("hasil pembagian dengan 0 = undefined")
    }
}

fun pembagian(a: Int, b:Int) : Int{
    return a/b
}
