package com.example.online_shop.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.online_shop.R
import com.example.online_shop.databinding.ViewholderColorBinding
class ColorAdapter(val items:MutableList<String>):
    RecyclerView.Adapter<ColorAdapter.Viewholder> (){
    private var selectedPosition = -1
    private var lastSelectedPosition = -1
    private lateinit var context: Context
    class Viewholder (val binding: ViewholderColorBinding):
        RecyclerView.ViewHolder(binding.root) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorAdapter.Viewholder {
        context = parent.context
        val binding = ViewholderColorBinding.inflate(LayoutInflater.from(context),parent,false)
        return Viewholder(binding)

    }
    override fun onBindViewHolder(holder: ColorAdapter.Viewholder, position: Int) {

        Glide.with(holder.itemView.context)
            .load(items[position])
            .into(holder.binding.pic)

        holder.binding.root.setOnClickListener{
            lastSelectedPosition = selectedPosition
            selectedPosition = position
            notifyItemChanged(lastSelectedPosition)
            notifyItemChanged(selectedPosition)
        }
        if (selectedPosition == position){
            holder.binding.colorLayout.setBackgroundResource(R.drawable.gray_bd_selected)
        }else{
            holder.binding.colorLayout.setBackgroundResource(R.drawable.gray_bg)
        }
    }
    override fun getItemCount(): Int = items.size
}