package seve.alo.apps.listviewcars

// Creamos una clase que contenga cada uno de los elementos de nuestro coche
class Coche(image: Int, title: String, description: String, price: String, vent: Boolean) {

    var imagen : Int? = image
    var titulo : String? = title
    var descripcion : String? = description
    var precio : String? = price
    var venta : Boolean? = vent
}