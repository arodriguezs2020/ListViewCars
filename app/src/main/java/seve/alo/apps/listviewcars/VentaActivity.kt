package seve.alo.apps.listviewcars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import seve.alo.apps.listviewcars.databinding.ActivityVentaBinding

// Creamos esta clase para que cuando el usuario haga click en la imagen pueda ver el producto en detalle, aqui entrara si no esta en venta
class VentaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVentaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVentaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        callValuesIntent()
    }

    private fun callValuesIntent() {
        val bundle: Bundle = intent.extras!!
        val image = bundle.getInt("imagen")
        val title = bundle.getString("titulo")
        val description = bundle.getString("descripcion")
        val price = bundle.getString("precio")
        setValues(image, title, description, price)
    }

    private fun setValues(
        image: Int,
        title: String?,
        description: String?,
        price: String?
    ) {
        binding.imageView.setImageResource(image)
        binding.textViewTitulo.text = title
        binding.textViewDescripcion.text = description
        binding.textViewPrecio.text = price
    }
}