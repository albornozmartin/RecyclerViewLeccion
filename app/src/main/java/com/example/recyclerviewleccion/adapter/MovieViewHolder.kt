package com.example.recyclerviewleccion.adapter

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import coil.load
import com.example.recyclerviewleccion.Movie
import com.example.recyclerviewleccion.databinding.ItemMovieBinding

class MovieViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemMovieBinding.bind(view)

    fun render(movieModel: Movie){
        binding.titulo.text=movieModel.nombre
        binding.duracion.text=movieModel.duracion.toString()
        binding.genero.text=movieModel.genero
        binding.imageViewCaratula.load(movieModel.caratula)

        val intent = Intent(details::class.java)
        binding.imageViewCaratula.setOnClickListener({


        })
    }
}