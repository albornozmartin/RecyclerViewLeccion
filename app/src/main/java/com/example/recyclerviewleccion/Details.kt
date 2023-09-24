package com.example.recyclerviewleccion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.example.recyclerviewleccion.databinding.ActivityMainBinding
import com.example.recyclerviewleccion.databinding.DetailsBinding

class Details : AppCompatActivity() {
    private lateinit var binding: DetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val titulo = intent.getStringExtra("titulo")
        val duracion = intent.getIntExtra("duracion", 0)
        val genero = intent.getStringExtra("genero")
        val caratula = intent.getStringExtra("caratula")
        val sinopsis = intent.getStringExtra("sinopsis")
        // Establece los datos en las vistas utilizando el binding
        binding.titulo.text = titulo
        binding.duracion.text = duracion.toString()
        binding.genero.text = genero
        binding.imageViewCaratula.load(caratula)
        binding.sinopsis.text=sinopsis

    }
}