package com.horoscope.app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class Adapter(val data: ArrayList<Horoscope>, val context: Context) :
    RecyclerView.Adapter<Holder>(), View.OnClickListener {

    private lateinit var listener: View.OnClickListener
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_line, parent, false)
        view.setOnClickListener(this)
        val holder = Holder(view)
        return holder
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(data[position])
    }

    fun setOnClickListener(listener: View.OnClickListener) {
        this.listener = listener
    }

    override fun onClick(v: View?) {

        if (listener != null) {
            listener.onClick(v)
        }
    }


}