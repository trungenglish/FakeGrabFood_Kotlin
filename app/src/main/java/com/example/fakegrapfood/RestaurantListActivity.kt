package com.example.fakegrapfood

import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fakegrapfood.adapter.RestaurantAdapter
import com.example.fakegrapfood.model.RestaurantModel

class RestaurantListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_restaurant_list)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ListRestaurant()
    }
    fun ListRestaurant(){
        val recyclerView: RecyclerView = findViewById(R.id.ListRestaurant)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,
            false)
        //Create data source
        var restaurantList: ArrayList<RestaurantModel> = ArrayList()

        var res1 = RestaurantModel(R.drawable.international_food,"Giảm 23.000đ","Cơm Tấm Phúc Lộc Thọ","25 mins",null,"4.3 (+1k)")
        var res2 = RestaurantModel(R.drawable.international_food,"Giảm 23.000đ","Cơm Tấm Phúc Lộc Thọ","25 mins",null,"4.3 (+1k)")
        var res3 = RestaurantModel(R.drawable.international_food,"Giảm 23.000đ","Cơm Tấm Phúc Lộc Thọ","25 mins",null,"4.3 (+1k)")
        var res4 = RestaurantModel(R.drawable.international_food,"Giảm 23.000đ","Cơm Tấm Phúc Lộc Thọ","25 mins",null,"4.3 (+1k)")
        var res5 = RestaurantModel(R.drawable.international_food,"Giảm 23.000đ","Cơm Tấm Phúc Lộc Thọ","25 mins",null,"4.3 (+1k)")
        var res6 = RestaurantModel(R.drawable.international_food,"Giảm 23.000đ","Cơm Tấm Phúc Lộc Thọ","25 mins",null,"4.3 (+1k)")

        restaurantList.add(res1)
        restaurantList.add(res2)
        restaurantList.add(res3)
        restaurantList.add(res4)
        restaurantList.add(res5)
        restaurantList.add(res6)

        //Create adapter
        val adapter = RestaurantAdapter(restaurantList)
        recyclerView.adapter = adapter


    }
}