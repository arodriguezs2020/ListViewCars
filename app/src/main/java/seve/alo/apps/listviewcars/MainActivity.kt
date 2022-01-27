package seve.alo.apps.listviewcars

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*


class MainActivity(var adapter: CocheAdapter? = null) : AppCompatActivity() {

    // Creamos nuestro array de Coches
    var listaDeCoches = ArrayList<Coche>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Llamamos al elemento ListView que tenemos en el xml
        val gridView = findViewById<GridView>(R.id.gridView)

        // Añadimos todos nuestros Coches con cada una de sus propiedades
        listaDeCoches.add(Coche(R.drawable.hw_bowser_sm, "Bowser", "Coche del malvado Bowser", "Precio: $350", false))
        listaDeCoches.add(Coche(R.drawable.hw_buddy_car,"Buddy", "Coche del vaquero buddy", "Precio: $350", true))
        listaDeCoches.add(Coche(R.drawable.hw_camaro_ee_2015,"Camaro", "Coche Camaro Edición Especial", "Precio: $350", false))
        listaDeCoches.add(Coche(R.drawable.hw_charger_2014,"Charger", "Coche Charger 2014", "Precio: $350", true))
        listaDeCoches.add(Coche(R.drawable.hw_fury_shark,"Shark", "Coche del temible tiburón", "Precio: $350", false))
        listaDeCoches.add(Coche(R.drawable.hw_mario_sm,"Mario", "Coche de Super Mario", "Precio: $350", false))
        listaDeCoches.add(Coche(R.drawable.hw_toad_sm,"Toad", "Coche de Toad", "Precio: $350", true))
        listaDeCoches.add(Coche(R.drawable.hw_yoshi_sm,"Yoshi", "Coche de Yoshi", "Precio: $350", true))

        // Creamos una instancia de nuestra clase CochesAdapter
        adapter = CocheAdapter(this, listaDeCoches)
        // Le pasamos a nuestro listView el adaptador que acabamos de instanciar
        gridView.adapter = adapter
    }
}