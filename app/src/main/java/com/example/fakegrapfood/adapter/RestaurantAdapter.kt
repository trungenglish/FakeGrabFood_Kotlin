package com.example.fakegrapfood.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fakegrapfood.R
import com.example.fakegrapfood.model.RestaurantModel

class RestaurantAdapter (val RestaurantList: ArrayList<RestaurantModel>)
    : RecyclerView.Adapter<RestaurantAdapter.RestaurantHolder>() {

    inner class RestaurantHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var foodimg: ImageView
        lateinit var saleoff: TextView
        lateinit var foodname: TextView
        lateinit var distance: TextView
        lateinit var time: TextView
        lateinit var rate: TextView

        init {
            foodimg = itemView.findViewById(R.id.imgFood)
            saleoff = itemView.findViewById(R.id.txtSaleOff)
            foodname = itemView.findViewById(R.id.txtFoodName)
            distance = itemView.findViewById(R.id.txtDistance)
            time = itemView.findViewById(R.id.txtTime)
            rate = itemView.findViewById(R.id.txtRate)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_item_order_again, parent, false)
        return RestaurantHolder(v)
    }

    override fun getItemCount(): Int {
        return RestaurantList.size
    }

    override fun onBindViewHolder(holder: RestaurantHolder, position: Int) {
        holder.foodimg.setImageResource(RestaurantList[position].img)
        holder.saleoff.text = RestaurantList[position].saleoff
        holder.foodname.text = RestaurantList[position].name
        holder.distance.text = RestaurantList[position].distance
        holder.time.text = RestaurantList[position].time
        holder.rate.text = RestaurantList[position].rate
    }
}
