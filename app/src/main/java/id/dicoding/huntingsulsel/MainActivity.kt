package id.dicoding.huntingsulsel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var wisata: RecyclerView
    private var list = ArrayList<TempatWisata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wisata = findViewById(R.id.objek_wisata)
        wisata.setHasFixedSize(true)

        list.addAll(TentangTempatwisata.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        wisata.layoutManager = LinearLayoutManager(this)
        val listTempatWisataAdapter = ListTempatWisataAdapter(list)
        wisata.adapter = listTempatWisataAdapter
    }

}