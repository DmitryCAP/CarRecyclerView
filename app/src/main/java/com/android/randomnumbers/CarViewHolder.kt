package com.android.randomnumbers

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

    private val brandTextView: TextView = itemView.findViewById(R.id.brand_text_view)
    private val carImageView : ImageView = itemView.findViewById(R.id.car_image_view)

    fun bind (car:Car) {
        brandTextView.text = car.brand
        carImageView.setImageResource(car.image)
    }
}