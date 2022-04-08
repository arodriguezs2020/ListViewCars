package seve.alo.apps.listviewcars

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CocheAdapter(context: Context, private var listCars: ArrayList<Coche>) : BaseAdapter() {

    private var contexto: Context? = context

    // En este metodo tendremos toda la logica para pintar cada uno de los elementos en nuestro ListView
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val coche = listCars[p0]
        return compareView(coche)
    }

    private fun compareView(car: Coche): View {
        return if (car.venta == true) {
            val miVista = setValues(R.layout.molde_coche_grid, car)
            setOnClickImageView(miVista, car)
            miVista
        } else {
            val miVista = setValues(R.layout.molde_venta_grid, car)
            setOnClickImageView(miVista, car)
            miVista
        }
    }

    private fun setValues(molde: Int, coche: Coche): View {
        val inflater =
            contexto!!.getSystemService(AppCompatActivity.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val miVista = inflater.inflate(molde, null)
        miVista.findViewById<ImageView>(R.id.imageView).setImageResource(coche.imagen!!)
        miVista.findViewById<TextView>(R.id.textViewTitulo).text = coche.titulo!!
        miVista.findViewById<TextView>(R.id.textViewDescripcion).text = coche.descripcion!!
        miVista.findViewById<TextView>(R.id.textViewPrecio).text = coche.precio!!.toString()

        return miVista
    }

    private fun setOnClickImageView(
        miVista: View,
        coche: Coche
    ) {
        miVista.findViewById<ImageView>(R.id.imageView).setOnClickListener {
            val intent = Intent(contexto, CocheActivity::class.java)
            intent.putExtra("imagen", coche.imagen!!)
            intent.putExtra("titulo", coche.titulo!!)
            intent.putExtra("descriptcion", coche.descripcion!!)
            intent.putExtra("precio", coche.precio!!)
            contexto!!.startActivity(intent)
        }
    }

    override fun getItem(p0: Int): Any {
        return listCars[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return listCars.size
    }
}