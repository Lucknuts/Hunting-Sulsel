package id.dicoding.huntingsulsel


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*


class ListTempatWisataAdapter(private val  listTempatWisata: ArrayList<TempatWisata>) : RecyclerView.Adapter<ListTempatWisataAdapter.ListViewHolder>(){


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.tampilan_list, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val tempatWisata = listTempatWisata[position]

        Glide.with(holder.itemView.context)
            .load(tempatWisata.gambar)
            .apply(RequestOptions().override(55, 55))
            .into(holder.gambartempatnya)

        holder.namatempatnya.text = tempatWisata.nama
        holder.deskripsitempatnya.text = tempatWisata.deskripsi
    }

   override fun getItemCount(): Int {
       return listTempatWisata.size
    }



   inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var namatempatnya: TextView = itemView.findViewById(R.id.nama_item_wisata)
        var deskripsitempatnya : TextView = itemView.findViewById(R.id.tentang_item_wisata)
        var gambartempatnya : ImageView = itemView.findViewById(R.id.gambar_item_wisata)

    }

}