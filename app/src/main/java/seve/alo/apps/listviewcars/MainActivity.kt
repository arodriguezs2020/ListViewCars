package seve.alo.apps.listviewcars

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class MainActivity(var adapter: CocheAdapter? = null) : AppCompatActivity() {

    private var listCars = ArrayList<Coche>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView = findViewById<GridView>(R.id.gridView)
        addCars()
        adapter = CocheAdapter(this, listCars)
        gridView.adapter = adapter
    }

    private fun addCars() {
        listCars.add(
            Coche(
                R.drawable.hw_bowser_sm,
                "Bowser",
                "Coche del malvado Bowser",
                "Precio: $350",
                false
            )
        )
        listCars.add(
            Coche(
                R.drawable.hw_buddy_car,
                "Buddy",
                "Coche del vaquero buddy",
                "Precio: $350",
                true
            )
        )
        listCars.add(
            Coche(
                R.drawable.hw_camaro_ee_2015,
                "Camaro",
                "Coche Camaro Edición Especial",
                "Precio: $350",
                false
            )
        )
        listCars.add(
            Coche(
                R.drawable.hw_charger_2014,
                "Charger",
                "Coche Charger 2014",
                "Precio: $350",
                true
            )
        )
        listCars.add(
            Coche(
                R.drawable.hw_fury_shark,
                "Shark",
                "Coche del temible tiburón",
                "Precio: $350",
                false
            )
        )
        listCars.add(
            Coche(
                R.drawable.hw_mario_sm,
                "Mario",
                "Coche de Super Mario",
                "Precio: $350",
                false
            )
        )
        listCars.add(
            Coche(
                R.drawable.hw_toad_sm,
                "Toad",
                "Coche de Toad",
                "Precio: $350",
                true
            )
        )
        listCars.add(
            Coche(
                R.drawable.hw_yoshi_sm,
                "Yoshi",
                "Coche de Yoshi",
                "Precio: $350",
                true
            )
        )
    }
}