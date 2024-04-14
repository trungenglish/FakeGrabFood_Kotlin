package com.example.fakegrapfood.adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fakegrapfood.R
import com.example.fakegrapfood.model.BannerModel

class BannerAdapter(val BannerList: ArrayList<BannerModel>)
    :RecyclerView.Adapter<BannerAdapter.BannerHolder>(){

        inner class BannerHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            lateinit var headerbanner: TextView
            lateinit var imgbanner: ImageView
            lateinit var contentbanner: TextView
            lateinit var namebanner: TextView

            init {
                headerbanner = itemView.findViewById(R.id.txtHeader)
                imgbanner = itemView.findViewById(R.id.imgBanner)
                contentbanner = itemView.findViewById(R.id.txtContentBanner)
                namebanner = itemView.findViewById(R.id.txtNameBanner)
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_banner,parent,false)
        return BannerHolder(v)
    }

    override fun getItemCount(): Int {
        return Int.MAX_VALUE
    }

    override fun onBindViewHolder(holder: BannerHolder, position: Int) {
        val pos = position %  BannerList.size
        holder.headerbanner.setText(BannerList[pos].header)
        holder.imgbanner.setImageResource(BannerList[pos].img)
        holder.contentbanner.setText(BannerList[pos].content)
        holder.namebanner.setText(BannerList[pos].name)
    }
}