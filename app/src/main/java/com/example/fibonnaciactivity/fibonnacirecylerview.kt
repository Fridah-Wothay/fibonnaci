package com.example.fibonnaciactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class fibonnacirecylerview(var items:List<Int>): RecyclerView.Adapter<displaynumbers>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): displaynumbers {
       var itemView = LayoutInflater.from(parent.context)
           .inflate(R.layout.fibonnaci_list_items,parent,false)
        return displaynumbers(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: displaynumbers, position: Int) {
       holder.tvNumbers.text = items[position].toString()
    }

}
class displaynumbers(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvNumbers = itemView.findViewById<TextView>(R.id.tvNumbers)
}