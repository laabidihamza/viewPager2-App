package com.example.viewpagertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {

    private var titlesList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postToList()

        val viewpager2 = findViewById<ViewPager2>(R.id.viewpager2)
        viewpager2.adapter = ViewPagerAdapter (titlesList,descList,imagesList)
        viewpager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val indicator = findViewById<CircleIndicator3>(R.id.indicator)

        indicator.setViewPager(viewpager2)
    }
        private fun addToList(title:String,description:String,image:Int){
            titlesList.add(title)
            descList.add(description)
            imagesList.add(image)


        }

        private fun postToList(){
            for (i in 1..5){
                addToList("title $i","description $i",R.mipmap.ic_launcher_round)
            }
        }

}