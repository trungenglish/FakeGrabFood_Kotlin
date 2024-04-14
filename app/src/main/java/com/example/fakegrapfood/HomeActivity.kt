package com.example.fakegrapfood

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fakegrapfood.adapter.BannerAdapter
import com.example.fakegrapfood.adapter.RestaurantAdapter
import com.example.fakegrapfood.adapter.MenuFoodAdapter
import com.example.fakegrapfood.model.BannerModel
import com.example.fakegrapfood.model.RestaurantModel
import com.example.fakegrapfood.model.MenuFoodModel

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        MenuFood()
        BannerHome()
        OrderAgain()
    }
    fun MenuFood(){
        val recyclerView : RecyclerView = findViewById(R.id.optionMenu)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,
            false)
        //Create data source
        var foodmenuList : ArrayList<MenuFoodModel> = ArrayList()

        var food1 = MenuFoodModel("Món quốc tế", R.drawable.international_food)
        var food2 = MenuFoodModel("Gà Rán - Burger", R.drawable.international_food)
        var food3 = MenuFoodModel("Bún - Phở - Cháo", R.drawable.international_food)
        var food4 = MenuFoodModel("Cơm", R.drawable.international_food)
        var food5 = MenuFoodModel("Cà Phê Trà Sinh Tố", R.drawable.international_food)
        var food6 = MenuFoodModel("Trà Sữa", R.drawable.international_food)
        var food7 = MenuFoodModel("Ăn Vặt", R.drawable.international_food)
        var food8 = MenuFoodModel("Lẩu & Nướng - Quay", R.drawable.international_food)
        var food9 = MenuFoodModel("Tráng Miệng", R.drawable.international_food)
        var food10 = MenuFoodModel("Bánh Mì - Xôi", R.drawable.international_food)
        var food11 = MenuFoodModel("Cơm Chay - Salad Healthy", R.drawable.international_food)
        var food12 = MenuFoodModel("Bánh Việt Nam", R.drawable.international_food)
        var food13 = MenuFoodModel("Món Khác", R.drawable.international_food)
        var food14 = MenuFoodModel("Pizza", R.drawable.international_food)
        var food15 = MenuFoodModel("Hải Sản", R.drawable.international_food)
        var food16 = MenuFoodModel("Giao Hàng Chính Hãng", R.drawable.international_food)

        foodmenuList.add(food1)
        foodmenuList.add(food2)
        foodmenuList.add(food3)
        foodmenuList.add(food4)
        foodmenuList.add(food5)
        foodmenuList.add(food6)
        foodmenuList.add(food7)
        foodmenuList.add(food8)
        foodmenuList.add(food9)
        foodmenuList.add(food10)
        foodmenuList.add(food11)
        foodmenuList.add(food12)
        foodmenuList.add(food13)
        foodmenuList.add(food14)
        foodmenuList.add(food15)
        foodmenuList.add(food16)

        //Create Adapter
        val adapter = MenuFoodAdapter(foodmenuList)
        recyclerView.adapter = adapter
    }
    fun BannerHome(){
        //Create recyclerView
        val recyclerView : RecyclerView = findViewById(R.id.recyclerBanner)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,
            false)
        //Create data source
        var bannerList : ArrayList<BannerModel> = ArrayList()

        var banner1 = BannerModel("Mua ngay1",R.drawable.banner_food,"Mua Voucher Nhà Hàng đi ăn bao hời","Ad - Grabfood Voucher Nhà Hàng")
        var banner2 = BannerModel("Mua ngay2",R.drawable.banner_food,"Mua Voucher Nhà Hàng đi ăn bao hời","Ad - Grabfood Voucher Nhà Hàng")
        var banner3 = BannerModel("Đặt ngay3",R.drawable.banner_food,"Mua Voucher Nhà Hàng đi ăn bao hời","Ad - Grabfood Voucher Nhà Hàng")
        var banner4 = BannerModel("Mua ngay4",R.drawable.banner_food,"Mua Voucher Nhà Hàng đi ăn bao hời","Ad - Grabfood Voucher Nhà Hàng")
        var banner5 = BannerModel("Ưu đãi Hot cho mẹ5",R.drawable.banner_food,"Mua Voucher Nhà Hàng đi ăn bao hời","Ad - Grabfood Voucher Nhà Hàng")
        var banner6 = BannerModel("Đăt ngay6",R.drawable.banner_food,"Mua Voucher Nhà Hàng đi ăn bao hời","Ad - Grabfood Voucher Nhà Hàng")
        var banner7 = BannerModel("Đặt ngay7",R.drawable.banner_food,"Mua Voucher Nhà Hàng đi ăn bao hời","Ad - Grabfood Voucher Nhà Hàng")
        var banner8 = BannerModel("Tiết kiệm ngay8",R.drawable.banner_food,"Mua Voucher Nhà Hàng đi ăn bao hời","Ad - Grabfood Voucher Nhà Hàng")
        var banner9 = BannerModel("Đặt ngay9",R.drawable.banner_food,"Mua Voucher Nhà Hàng đi ăn bao hời","Ad - Grabfood Voucher Nhà Hàng")
        var banner10 = BannerModel("Tìm món ngay10",R.drawable.banner_food,"Mua Voucher Nhà Hàng đi ăn bao hời","Ad - Grabfood Voucher Nhà Hàng")
        var banner11 = BannerModel("Tiết kiêm ngay11",R.drawable.banner_food,"Mua Voucher Nhà Hàng đi ăn bao hời","Ad - Grabfood Voucher Nhà Hàng")
        var banner12 = BannerModel("Tiết kiêm ngay12",R.drawable.banner_food,"Mua Voucher Nhà Hàng đi ăn bao hời","Ad - Grabfood Voucher Nhà Hàng")
        var banner13 = BannerModel("Tiết kiêm ngay13",R.drawable.banner_food,"Mua Voucher Nhà Hàng đi ăn bao hời","Ad - Grabfood Voucher Nhà Hàng")
        var banner14 = BannerModel("Đặt ngay14",R.drawable.banner_food,"Mua Voucher Nhà Hàng đi ăn bao hời","Ad - Grabfood Voucher Nhà Hàng")
        var banner15 = BannerModel("Bấm đặt ngay15",R.drawable.banner_food,"Mua Voucher Nhà Hàng đi ăn bao hời","Ad - Grabfood Voucher Nhà Hàng")

        bannerList.add(banner1)
        bannerList.add(banner2)
        bannerList.add(banner3)
        bannerList.add(banner4)
        bannerList.add(banner5)
        bannerList.add(banner6)
        bannerList.add(banner7)
        bannerList.add(banner8)
        bannerList.add(banner9)
        bannerList.add(banner10)
        bannerList.add(banner11)
        bannerList.add(banner12)
        bannerList.add(banner13)
        bannerList.add(banner14)
        bannerList.add(banner15)

        //Create banner
        val adapter = BannerAdapter(bannerList)
        recyclerView.adapter = adapter
        recyclerView.scrollToPosition(Int.MAX_VALUE/2)
    }
    fun OrderAgain(){
        //Create RecyclerView
        val recyclerView : RecyclerView = findViewById(R.id.recyclerOrderAgain)
        recyclerView.layoutManager =LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,
            false)
        //Create data source
        var foodOrderAgainList : ArrayList<RestaurantModel> = ArrayList()

        var food1 = RestaurantModel(R.drawable.international_food,"Ưu đãi đến 45k - 20.000đ off","Chick and Cheese - Gà cay phô mai, Gà rán Hàn Quốc","15 phút .","1.5km . ","4.5(730)")
        var food2 = RestaurantModel(R.drawable.international_food,"Ưu đãi đến 45k - 20.000đ off","Chick and Cheese - Gà cay phô mai, Gà rán Hàn Quốc","15 phút .","1.5km . ","4.5(730)")
        var food3 = RestaurantModel(R.drawable.international_food,"Ưu đãi đến 45k - 20.000đ off","Chick and Cheese - Gà cay phô mai, Gà rán Hàn Quốc","15 phút .","1.5km . ","4.5(730)")

        foodOrderAgainList.add(food1)
        foodOrderAgainList.add(food2)
        foodOrderAgainList.add(food3)

        //Create Adapter
        val adapter = RestaurantAdapter(foodOrderAgainList)
        recyclerView.adapter = adapter
    }
}