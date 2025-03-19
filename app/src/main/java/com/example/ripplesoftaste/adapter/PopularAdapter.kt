package com.example.ripplesoftaste.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ripplesoftaste.databinding.PopularItemBinding

class PopularAdapter (private val item:List<String>,private val price:List<String>, private val image:List<Int>): RecyclerView.Adapter<PopularAdapter.PopularViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
return PopularViewHolder(
    PopularItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
)}

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val item=item[position]
    val images=image[position]
    val price =price[position]
    holder.bind(item,price,images)

    }
    override fun getItemCount(): Int {
        return item.size
    }

    class PopularViewHolder(private val binding: PopularItemBinding) :RecyclerView.ViewHolder(binding.root) {
       private val imageView=binding.imageView5
        fun bind(item: String,price: String, images: Int) {
            binding.textView22.text = item
            binding.PricePopular.text = price  // Corrected ID for price
            imageView.setImageResource(images)
        }

    }
}