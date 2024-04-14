package com.example.fakegrapfood.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fakegrapfood.R
import com.example.fakegrapfood.model.MenuFoodModel

class MenuFoodAdapter(val MenuFoodList:  ArrayList<MenuFoodModel>)
    :RecyclerView.Adapter<MenuFoodAdapter.MenuFoodHolder>() {

        inner class MenuFoodHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            lateinit var foodimg: ImageView
            lateinit var foodtitle: TextView

            init {
                foodimg = itemView.findViewById(R.id.imgFood)
                foodtitle = itemView.findViewById(R.id.txtTitle)
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuFoodHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_menu_food,parent,false)
        return MenuFoodHolder(v)
    }

    override fun getItemCount(): Int {
        return MenuFoodList.size
    }

    override fun onBindViewHolder(holder: MenuFoodHolder, position: Int) {
        holder.foodtitle.setText(MenuFoodList[position].title)
        holder.foodimg.setImageResource(MenuFoodList[position].img)
    }
}