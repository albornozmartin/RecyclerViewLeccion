package com.example.recyclerviewleccion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewleccion.adapter.MovieAdapter
import com.example.recyclerviewleccion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }
    fun initRecyclerView(){
        binding.recycler.layoutManager=LinearLayoutManager(this)
        binding.recycler.adapter= MovieAdapter(MovieProvider.movies)
    }
}