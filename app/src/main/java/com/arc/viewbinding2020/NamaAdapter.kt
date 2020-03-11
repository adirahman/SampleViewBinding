package com.arc.viewbinding2020

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arc.viewbinding2020.databinding.ItemNamaBinding

class NamaAdapter(): RecyclerView.Adapter<NamaAdapter.NamaViewHolder>(){

    private val items = mutableListOf<String>()

    fun addItems(items:List<String>){
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemNamaBinding.inflate(layoutInflater)
        return NamaViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: NamaViewHolder, position: Int) {
        holder.bind(items[position])
    }

    inner class NamaViewHolder(private val binding: ItemNamaBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(nama:String){
            binding.itemNamaTextviewName.setText(nama)
        }
    }
}