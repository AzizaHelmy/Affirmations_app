package com.example.affirmationsapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationsapp.databinding.ListItemBinding
import com.example.affirmationsapp.model.Affirmation

class ItemAdapter(private val dataSet: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount() = dataSet.size


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val itemList = dataSet[position]
        holder.bind(itemList)
    }

    //=========================================================
    class ItemViewHolder(private val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(list: Affirmation) {
            binding.itemTitle.text = binding.itemTitle.context.resources.getString(list.stringResourceId)
            binding.itemImage.setImageResource(list.imageResourceId)
        }
    }
    //========================================================
}