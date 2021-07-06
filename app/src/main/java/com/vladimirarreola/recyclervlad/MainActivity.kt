package com.vladimirarreola.recyclervlad

import adapter.NotasAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vladimirarreola.recyclervlad.modelo.nota

class MainActivity : AppCompatActivity() {
    lateinit var recyclerNotas: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerNotas = findViewById(R.id.listaNotas)

        val notas = ArrayList<nota>()
        notas.add(nota(Titulo = "Primera nota", descripcion = "Una descripcion muy larga sobre el final de EVANGELION"))
        notas.add(nota(Titulo = "Segunda nota", descripcion = "Una descripcion muy larga acerca de los videos de Dross"))
        notas.add(nota(Titulo = "Tercera nota", descripcion = "Una descripcion muy corta sobre las razones por los cuales es tan dificil encontrar" +
                "trabajo"))
        notas.add(nota(Titulo = "Cuarta nota", descripcion = "Una descripcion sobre con cual juego de Final Fantasy empezar"))
        notas.add(nota(Titulo = "Quinta nota", descripcion = "Una descripcion sobre como porque está bien aprovechar las oferta" +
                "s de steam"))
        notas.add(nota(Titulo = "Sexta nota", descripcion = "Una descripcion de porque no está mal ver el fútbol"))
        notas.add(nota(Titulo = "Septima nota", descripcion = "Una descripcion"))
        notas.add(nota(Titulo = "Octava nota", descripcion = "Una descripcion"))

        recyclerNotas.layoutManager = GridLayoutManager(this, 2)
        recyclerNotas.setHasFixedSize(true)
        recyclerNotas.adapter = NotasAdapter(notas, this)
    }
}