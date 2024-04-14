package com.example.fakegrapfood.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fakegrapfood.R
import com.example.fakegrapfood.model.FoodModel

class FoodAdapter(val FoodList: ArrayList<FoodModel>)
    :RecyclerView.Adapter<FoodAdapter.FoodHolder>(){

        inner class FoodHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            lateinit var imgfood: ImageView
            lateinit var namefood: TextView
            lateinit var pricefood: TextView

            init {
                imgfood = itemView.findViewById(R.id.imgFood)
                namefood = itemView.findViewById(R.id.txtFoodName)
                pricefood = itemView.findViewById(R.id.txtPrice)
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_food,parent,false)
        return  FoodHolder(v)
    }

    override fun getItemCount(): Int {
        return FoodList.size
    }

    override fun onBindViewHolder(holder: FoodHolder, position: Int) {
        holder.imgfood.setImageResource(FoodList[position].img)
        holder.namefood.setText(FoodList[position].name)
        holder.pricefood.setText(FoodList[position].price)
    }
}