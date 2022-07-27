package com.example.telegram_appearance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_appearance.adapter.ViewAdapter
import com.example.telegram_appearance.model.Icon

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    initView()
    }
    fun initView(){
        recyclerView=findViewById(R.id.recyclerview)
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        refreshAdapter(getAllIcon())
    }
    fun refreshAdapter(icon:ArrayList<Icon>){
var adapter=ViewAdapter(this,icon)
        recyclerView.adapter=adapter
    }
    fun getAllIcon():ArrayList<Icon>{
        var icons=ArrayList<Icon>()

        icons.add((Icon(R.drawable.home)))

        icons.add((Icon(R.drawable.chick)))

        icons.add((Icon(R.drawable.snowman)))

        icons.add((Icon(R.drawable.olmos)))
        icons.add((Icon(R.drawable.chick)))



        return icons
    }
}