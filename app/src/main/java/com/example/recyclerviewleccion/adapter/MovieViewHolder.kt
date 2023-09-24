package com.example.recyclerviewleccion.adapter

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import coil.load
import com.example.recyclerviewleccion.Movie
import com.example.recyclerviewleccion.databinding.ItemMovieBinding
import com.example.recyclerviewleccion.Details

class MovieViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemMovieBinding.bind(view)

    fun render(movieModel: Movie){
        binding.titulo.text=movieModel.nombre
        binding.duracion.text=movieModel.duracion.toString()
        binding.genero.text=movieModel.genero
        binding.imageViewCaratula.load(movieModel.caratula)
        val intent = Intent(binding.imageViewCaratula.context,Details::class.java)
        binding.imageViewCaratula.setOnClickListener {
            val intent = Intent(binding.imageViewCaratula.context, Details::class.java)
            intent.putExtra("titulo", movieModel.nombre)
            intent.putExtra("duracion", movieModel.duracion)
            intent.putExtra("genero", movieModel.genero)
            intent.putExtra("caratula", movieModel.caratula)
            intent.putExtra("sinopsis",movieModel.sinopsis)
            binding.imageViewCaratula.context.startActivity(intent)
        }
    }
}