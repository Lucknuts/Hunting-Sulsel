package id.dicoding.huntingsulsel

import java.util.*

object TentangTempatwisata {

    private val namaTempat = arrayOf("Air Terjun Parangloe",
        "Apparalang Bulukumba",
        "Balla Lompoa Gowa",
        "Benteng Rotterdam Makassar",
        "Danau Tanralili Lembanna",
        "Hutan Mangrove Lantebung",
        "Hutan Pinus Malino",
        "Jembatqan Gantung Bantimuurung",
        "Lappa Laona Barru",
        "Patung Yesus Toraja")


    private val tentangTempat = arrayOf("Deskripsi Lokasi",
        "Deskripsi Lokasi",
        "Deskripsi Lokasi",
        "Deskripsi Lokasi",
        "Deskripsi Lokasi",
        "Deskripsi Lokasi",
        "Deskripsi Lokasi",
        "Deskripsi Lokasi",
        "Deskripsi Lokasi",
        "Deskripsi Lokasi")

    private val gambarTempat = intArrayOf(R.drawable.airterjun_bantimurung,
        R.drawable.apparalang_bulukumba,
        R.drawable.bentengrotterdam_makassar,
        R.drawable.danautanralili_malino,
        R.drawable.hutanmangrove_lantebung,
        R.drawable.hutanpinus_malino,
        R.drawable.jembatangantung_maros,
        R.drawable.lappalaona_barru,
        R.drawable.patungyesus_toraja,
        R.drawable.pulaukhayangan_makassar)

    val listData: ArrayList<TempatWisata>
        get(){
            val list = arrayListOf<TempatWisata>()
            for (postiton in namaTempat.indices) {
                val tempatWisata = TempatWisata()
                tempatWisata.nama = namaTempat[postiton]
                tempatWisata.deskripsi = tentangTempat[postiton]
                tempatWisata.gambar = gambarTempat[postiton]
                list.add(tempatWisata)
            }
            return list
            }
        }

