package com.example.fibonnaciactivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonnaciactivity.databinding.ActivityMainBinding
import com.example.fibonnaciactivity.databinding.FibonnaciListItemsBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items= displayfibonnaci(100)
        binding.rNumber.layoutManager = LinearLayoutManager(this)

        val numberAdapter = fibonnacirecylerview(items)
        binding.rNumber.adapter = numberAdapter


    }

    fun displayfibonnaci(l: Int):List<Int>{
        val items= mutableListOf(0,1)
        while (items.size<l){
          items.add(items[items.lastIndex] + items[items.lastIndex-1])
        }
        return items
    }
}