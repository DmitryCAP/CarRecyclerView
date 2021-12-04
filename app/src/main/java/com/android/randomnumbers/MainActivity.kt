package com.android.randomnumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var carRecyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     carRecyclerView = findViewById(R.id.car_recycler_view)
        val carList:List<Car> = listOf(
            Car("ferrari", R.drawable.ferrari),
        Car("mersedes",R.drawable.mersedes),
            Car("audi",R.drawable.audi)

        )
        carRecyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
    carRecyclerView.adapter=CarAdapter(carList)
    }
}