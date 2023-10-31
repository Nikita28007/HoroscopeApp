package com.horoscope.app

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.ByteArrayOutputStream

class FragmentRecycler : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.recycler_fragment, container, false)
        val data = addData()
        initRecycler(view, data)
        return view
    }

    fun initRecycler(view: View, data: ArrayList<Horoscope>) {
        val recycler = view.findViewById<RecyclerView>(R.id.recycle)
        val adapter = Adapter(data, view.context)
        recycler.adapter = adapter

        adapter.setOnClickListener {
            val pos = recycler.getChildAdapterPosition(it)
            val bundle = Bundle()
            bundle.putInt("pos", pos)

            findNavController().navigate(R.id.action_fragmentRecycler_to_fragmentDetails, bundle)
        }

        recycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

    }

    fun addData(): ArrayList<Horoscope> {
        val arr = ArrayList<Horoscope>()
        arr.add(Horoscope(R.drawable.aries, "Aries"))
        arr.add(Horoscope(R.drawable.taurus, "Taurus"))
        arr.add(Horoscope(R.drawable.gemini, "Gemini"))
        arr.add(Horoscope(R.drawable.cancer, "Cancer"))
        arr.add(Horoscope(R.drawable.leo, "Leo"))
        arr.add(Horoscope(R.drawable.virgo, "Virgo"))
        arr.add(Horoscope(R.drawable.libra, "Libra"))
        arr.add(Horoscope(R.drawable.scorpio, "Scorpio"))
        arr.add(Horoscope(R.drawable.sagittarius, "Sagittarius"))
        arr.add(Horoscope(R.drawable.capricorn, "Capricorn"))
        arr.add(Horoscope(R.drawable.aquarius, "Aquarius"))
        arr.add(Horoscope(R.drawable.pisces, "Pisces"))

        return arr
    }

    fun convertImagenString(bitmap: Bitmap): String {
        val stream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 90, stream)
        val byte_arr: ByteArray = stream.toByteArray()
        return Base64.encodeToString(byte_arr, Base64.DEFAULT)
    }

}