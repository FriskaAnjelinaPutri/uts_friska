package com.friska.uts_friska.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.friska.uts_friska.Detail
import com.friska.uts_friska.Model.ModelMakanan
import com.friska.uts_friska.R

class AdapterMakanan(private val itemList: List<ModelMakanan>) :
    RecyclerView.Adapter<AdapterMakanan.ItemViewHolder>() {

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_makanan, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemList[position]
        holder.titleTextView.text = item.title
        holder.descriptionTextView.text = item.description
        holder.imageView.setImageResource(item.imageResId)

        // Set click listener to navigate to DetailActivity
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, Detail::class.java).apply {
                putExtra("TITLE", item.title)
                putExtra("IMAGE_RES_ID", item.imageResId)
            }
            context.startActivity(intent)
        }
    }


    override fun getItemCount(): Int {
        return itemList.size
    }
}