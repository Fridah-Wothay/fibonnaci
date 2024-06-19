package com.example.fibonnaciactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FibonnaciRecyclerView(var items:List<Int>): RecyclerView.Adapter<Displaynumbers>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Displaynumbers {
       var itemView = LayoutInflater.from(parent.context)
           .inflate(R.layout.fibonnaci_list_items,parent,false)
        return Displaynumbers(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: Displaynumbers, position: Int) {
       holder.tvNumbers.text = items[position].toString()
    }

}
class Displaynumbers(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvNumbers = itemView.findViewById<TextView>(R.id.tvNumbers)
}