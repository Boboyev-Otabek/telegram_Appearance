package com.example.telegram_appearance.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_appearance.R
import com.example.telegram_appearance.model.Icon

class ViewAdapter(var context: Context, var item: ArrayList<Icon>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var type_black = 0
    var type_green = 1
    var type_blue = 2
    var type_pink = 3

    fun isblack(position: Int): Boolean {
        return position == 0
    }

    fun isgreen(position: Int): Boolean {
        return position == 1
    }

    fun isblue(position: Int): Boolean {
        return position == 2
    }

    override fun getItemViewType(position: Int): Int {
        if (isblack(position)) return type_black
        if (isgreen(position)) return type_green
        if (isblue(position)) return type_blue
        return type_pink
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        if (viewType == type_black) {
            var view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
            return ViewBlackHolder(view)
        }

        if (viewType == type_green) {
            var view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_view_green, parent, false)
            return ViewGreenHolder(view)
        }

        if (viewType == type_blue) {
            var view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_blue, parent, false)
            return ViewBlueHolder(view)
        }

        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_pink, parent, false)
        return ViewPinkHolder(view)

    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        var icons=item[position]
        if(holder is ViewBlackHolder){
            var iv_icon=holder.iv_icon
            iv_icon.setImageResource(icons.icon)

        }
        if(holder is ViewGreenHolder){
            var iv_icon=holder.iv_icon
            iv_icon.setImageResource(icons.icon)

        }
        if(holder is ViewBlueHolder){
            var iv_icon=holder.iv_icon
            iv_icon.setImageResource(icons.icon)

        }
        if(holder is ViewPinkHolder){
            var iv_icon=holder.iv_icon
            iv_icon.setImageResource(icons.icon)

        }

    }

    class ViewBlackHolder(view: View):RecyclerView.ViewHolder(view){
        var iv_icon:ImageView
        init {
            iv_icon=view.findViewById(R.id.iv_icon)
        }
    }


    class ViewGreenHolder(view: View):RecyclerView.ViewHolder(view){
        var iv_icon:ImageView
        init {
            iv_icon=view.findViewById(R.id.iv_icon)
        }
    }
    class ViewBlueHolder(view: View):RecyclerView.ViewHolder(view){
        var iv_icon:ImageView
        init {
            iv_icon=view.findViewById(R.id.iv_icon)
        }
    }
    class ViewPinkHolder(view: View):RecyclerView.ViewHolder(view){
        var iv_icon:ImageView
        init {
            iv_icon=view.findViewById(R.id.iv_icon)
        }
    }



}