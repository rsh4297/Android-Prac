package com.example.recyclerviewkttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.man,"승현",27,"대학생"),
            Profiles(R.drawable.woman,"아람",23,"대학생"),
            Profiles(R.drawable.man,"석영",36,"교수"),
            Profiles(R.drawable.man,"범수",26,"취준생"),
            Profiles(R.drawable.woman,"다율",29,"개발자"),
            Profiles(R.drawable.man,"한울",27,"개백수")
        )
        rv_profile.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv_profile.setHasFixedSize(true)//리사이클러 성능개선 방안

        rv_profile.adapter = ProfileAdapter(profileList)
    }
}