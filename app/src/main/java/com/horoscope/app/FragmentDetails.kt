package com.horoscope.app

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentDetails : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.details_fragment, container, false)
        val pos = arguments?.getInt("pos")
        val images = images()
        view.findViewById<ImageView>(R.id.imageDetailFragment)
            .setImageResource(images[pos!!])
        val data = addDataDesc()
        view.findViewById<TextView>(R.id.detailsFragmentText).text = data[pos]
        return view
    }

    fun addDataDesc(): ArrayList<String> {
        val arrDesc = ArrayList<String>()
        arrDesc.add("Saturn, our cosmic professor, visits receptive Pisces and your house of compassion and sacrifice this year, Aries, which means—gasp!—you’ll have to consider other people and their feelings for a change! It’s obvious that you have some unfinished spiritual business to take care of in 2024, and your biggest challenges come when you attempt to clear up any unresolved mental or emotional issues that are holding you back.")
        arrDesc.add("Your stable sign hosts unpredictable Uranus again all year, producing uneven energy but also promoting positive, healthy change. This year is an exciting time to examine your usual routines and procedures and tweak the parts that aren’t working. And while your slow, deliberate movements aren’t ideal during this rebellious transit, some progress is better than none.")
        arrDesc.add("Your clever mind helps you come up with some interesting ideas and concepts this year, Gemini, but your tendency to get distracted could overshadow your success. Luckily, serious, ambitious Saturn is spending the year in inspirational Pisces and your career zone, highlighting your dreams and aspirations but also giving you the focus that you need to turn them into reality. Saturn is a tough but fair teacher, and you can use its determined and consistent energy to zero in on what matters and tackle your top priorities.")
        arrDesc.add("Cancer, as an emotional, moody water sign with a heart of gold, it’s time to come out of your shell a little bit this year. You’ll always be something of an introvert, but 2024 will have more adventures and learning experiences than last year.")
        arrDesc.add("You love a good moment to shine in the spotlight, Leo, and as driven Saturn spends time in receptive Pisces and your transformation zone, you get the chance to play a lot of various, versatile roles this year. Let’s just say that you’ll be trying on a lot of different hats to see which one fits—and having a lot of fun in the process!")
        arrDesc.add("Your precise, often critical perspective on life comes from being ruled by smart, logical Mercury, and you prefer things to be as predictable as possible. However, Virgo, with teacher Saturn moving through ethereal Pisces, your zodiac opposite and your relationship zone, this year, you won’t be able to count on those predictable interactions that you’ve come to value and rely on as part of your everyday routine.")
        arrDesc.add("Libra, there’s a serious vibe to your life with Saturn partnering with adaptable Pisces and your sixth house of details and daily rituals this year, which means you’ll be spending a lot of time finding ways to be more effective and efficient. Your well-being (mind, body, and soul) is also at the top of your priority list in 2024, and taking care of yourself will lead to major improvements in your overall quality of life.")
        arrDesc.add("You’re a mysterious, intense water sign who likes to play up your secretive allure, Scorpio, but as serious Saturn transits your fifth house of drama and the quest for attention in 2024, you’ll be in the spotlight more than ever. There is also more ambitious emphasis on the things you do for fun, like sports and hobbies, so get that competitive vibe of yours ready to start flowing. Because if you’re going to commit your time to something, ")
        arrDesc.add("Your adventurous leader Jupiter spends an almost equal amount of time in both steady, practical Taurus (from the start of the year to late May) and then in open-minded, versatile Gemini (from late May through the end of December), bringing a lot of balance to your life. The first part of the year provides patience and inner strength, with the second half offering a newfound curiosity about the world that leads to new perspectives, viewpoints, and opinions.")
        arrDesc.add("You’re a capable, determined earth sign who takes life seriously, Capricorn. This year, as your ambitious planetary leader Saturn spends its time in perceptive Pisces and your communication zone, your attention shifts to the way you interact with people. You still meet your work responsibilities with your usual amount of grit and determination, but your personal interests are evolving and allowing you to feel less inhibited and more sociable.")
        arrDesc.add("Aquarius, as driven outer planet Saturn is accompanied by Pisces this year, the spotlight is on your money house, giving you the opportunity to focus on your sense of self-worth and finances. Getting more serious and organized in these areas of your life is your main goal in 2024, and while your airy, rebellious sign likes to get extreme, a “back to basics” approach pays off better than trying to be overly creative now.")
        arrDesc.add("Because as ambitious Saturn spends time in your first house of self this year, you’re going to have all eyes on you as your confidence increases and you work to find out who you truly are. Scary? Yes! But the discomfort and awkwardness that you feel can pay off big time in the form of personal growth and transformation.")
        return arrDesc
    }

    private fun images(): ArrayList<Int> {
        val arr = ArrayList<Int>()
        arr.add(R.drawable.aries)
        arr.add(R.drawable.taurus)
        arr.add(R.drawable.gemini)
        arr.add(R.drawable.cancer)
        arr.add(R.drawable.leo)
        arr.add(R.drawable.virgo)
        arr.add(R.drawable.libra)
        arr.add(R.drawable.scorpio)
        arr.add(R.drawable.sagittarius)
        arr.add(R.drawable.capricorn)
        arr.add(R.drawable.aquarius)
        arr.add(R.drawable.pisces)
        return arr
    }

    private fun convertStringBitmap(imagen: String?): Bitmap {
        val decodedString: ByteArray = Base64.decode(imagen, Base64.DEFAULT)
        return BitmapFactory.decodeByteArray(decodedString, 0, decodedString.size)
    }
}