package com.example.online_shop.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterInside
import com.bumptech.glide.request.RequestOptions
import com.example.online_shop.Model.SliderModel
import com.example.online_shop.R
class SliderAdapter(
    private var sliderItems:List<SliderModel>,
    private val viewPager2: ViewPager2
):RecyclerView.Adapter<SliderAdapter.SliderViewHolder>()
{
    private lateinit var context:Context
    private val runnable = Runnable {
        sliderItems = sliderItems
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SliderViewHolder {
       context = parent.context
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.slider_item_container, parent, false )
        return SliderViewHolder(view)
    }
    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        holder.setImage(sliderItems[position], context)
    }
    override fun getItemCount(): Int = sliderItems.size
    class SliderViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val imageView:ImageView = itemView.findViewById(R.id.imageSlider)
        fun setImage (sliderItems: SliderModel, context: Context){
            val requestOptions = RequestOptions().transform(CenterInside())

            Glide.with(context)
                .load(sliderItems.url)
                .apply(requestOptions)
                .dontAnimate()
                .diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.ALL)
                .into(imageView)
        }
    }
}