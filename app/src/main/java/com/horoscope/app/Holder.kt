package com.horoscope.app

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var image: ImageView
    val name: TextView

    val arr = ArrayList<Int>()


    init {
        image = itemView.findViewById(R.id.imageRecycler)
        name = itemView.findViewById(R.id.nameRecycler)
    }

    fun bind(data: Horoscope) {
        name.text = data.name

        image.setImageResource(data.image)


    }

}