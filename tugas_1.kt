 package id.infinitelearning.KotlinSubmission.exercise1

    /**
    Latihan 1
    Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
    - Variable bertipe data string yang menyimpan nilai nama depan Anda.
    - Variable bertipe data string yang menyimpan nilai nama belakang Anda.
    - Variable bertipe data number yang menyimpan nilai umur Anda.
    - Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
    Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
     */
    fun myProfile() {
        val namaDepan : String = "Birrul"
        val namaBelakang : String = "Hasibuan"
        val umur : Number = 20
        val status : Boolean = true

        println("===PROFIL SAYA===")
        println("Nama lengkap saya adalah $namaDepan $namaBelakang")
        println("Saya berusia $umur tahun")
        if (status) {
            println("Status saya yaitu single\n")
        }else {
            println("Status saya yaitu tidak single\n")
        }
    }


    /**
     *  Latihan 2
     *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
     */
    fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
        val grup = """
        ===DETAIL GRUP===
        Id Grup = $groupId
        Sesi = $session
        Anggota Grup = $groupMember
    """.trimIndent()

        return println(grup)
    }

    /**
     * Latihan 3
     * Buat variable yang berisi daftar anggota group kamu,
     * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
     *
     */
    fun myTeam(): List<Any> {
        val anggota = listOf(
            "Birrul Hasibuan",
            "Linda Erlinda Sari",
            "Kristo Pandapotan Samosir",
            "Alvian Diva Awangga",
            "Muhammad Fachrizal Akbar")

        return listOf(anggota[0])
    }

    /**
     * Latihan 4
     * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
     *
     *      total mentor + jumlah anggota group
     *
     */
    fun totalMember(): Int {
        val mentor = arrayOf<String>("Peja", "Ilham")
        val countOfGroup = arrayOf<String>(
            "Birrul Hasibuan",
            "Linda Erlinda Sari",
            "Kristo Pandapotan Samosir",
            "Alvian Diva Awangga",
            "Muhammad Fachrizal Akbar")

        return mentor.size + countOfGroup.size
    }

    fun main() {

        myProfile()

        val myTeam = myTeam()
        println("My team is: $myTeam")

        val totalMember = totalMember()
        println("Total Member group : $totalMember\n")

        /**
         *  Latihan 5
         *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
         *
         */
        groupDetail("10",
            listOf("Birrul Hasibuan",
                "Linda Erlinda Sari",
                "Kristo Pandapotan Samosir",
                "Alvian Diva Awangga",
                "Muhammad Fachrizal Akbar"),
            "Afternoon B")

    }