package com.example.fakegrapfood

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fakegrapfood.adapter.FoodAdapter
import com.example.fakegrapfood.model.FoodModel

class ListFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_food)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ListFood()
    }
    fun ListFood(){
        val recyclerView: RecyclerView = findViewById(R.id.ListFood)
        recyclerView.layoutManager = GridLayoutManager(this,2)
        //Create data source
        var foodList : ArrayList<FoodModel> = ArrayList()

        var food1 = FoodModel(R.drawable.international_food,"Cơm Sườn Phúc Lộc Thọ & 1 Món","56.000")
        var food2 = FoodModel(R.drawable.international_food,"Cơm Sườn Phúc Lộc Thọ & 1 Món","56.000")
        var food3 = FoodModel(R.drawable.international_food,"Cơm Sườn Phúc Lộc Thọ & 1 Món","56.000")
        var food4 = FoodModel(R.drawable.international_food,"Cơm Sườn Phúc Lộc Thọ & 1 Món","56.000")
        var food5 = FoodModel(R.drawable.international_food,"Cơm Sườn Phúc Lộc Thọ & 1 Món","56.000")
        var food6 = FoodModel(R.drawable.international_food,"Cơm Sườn Phúc Lộc Thọ & 1 Món","56.000")
        var food7 = FoodModel(R.drawable.international_food,"Cơm Sườn Phúc Lộc Thọ & 1 Món","56.000")
        var food8 = FoodModel(R.drawable.international_food,"Cơm Sườn Phúc Lộc Thọ & 1 Món","56.000")
        var food9 = FoodModel(R.drawable.international_food,"Cơm Sườn Phúc Lộc Thọ & 1 Món","56.000")
        var food10 = FoodModel(R.drawable.international_food,"Cơm Sườn Phúc Lộc Thọ & 1 Món","56.000")

        foodList.add(food1)
        foodList.add(food2)
        foodList.add(food3)
        foodList.add(food4)
        foodList.add(food5)
        foodList.add(food6)
        foodList.add(food7)
        foodList.add(food8)
        foodList.add(food9)
        foodList.add(food10)

        //Create Adapter
        val adapter = FoodAdapter(foodList)
        recyclerView.adapter = adapter
    }
}