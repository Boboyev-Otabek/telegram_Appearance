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

    var available=0
    var notavailable=1


    override fun getItemViewType(position: Int): Int {
      if(item.get(position).isAvailable) {return available}
        return notavailable
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        if(viewType==available){
            var view:View=LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
            return ViewBlueHolder(view)
        }

        var view:View=LayoutInflater.from(parent.context).inflate(R.layout.item_view_green,parent,false)
        return ViewGreenHolder(view)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        var icons=item[position]
       if(holder is ViewBlueHolder){

           var iv_icon=holder.iv_icon
           iv_icon.setImageResource(icons.icon)
       }

        if(holder is ViewGreenHolder){
            var iv_icon=holder.iv_icon
            iv_icon.setImageResource(icons.icon)
        }
    }


    class  ViewBlueHolder(view: View):RecyclerView.ViewHolder(view){

        var iv_icon:ImageView
        init {
            iv_icon=view.findViewById(R.id.iv_icon)
        }
    }

    class  ViewGreenHolder(view: View):RecyclerView.ViewHolder(view){
        var iv_icon:ImageView
        init {
            iv_icon=view.findViewById(R.id.iv_icon)
        }
    }
}