package dev.lchang.lab05listviewandroid

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var arrSO = arrayOf(
        "Android", "iPhone", "Windows Phone", "Blackberry", "FireFox OS", "Amazon World", "Nokia"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Asegúrate de que este es el layout correcto que estás utilizando
        setContentView(R.layout.activity_main)

        val lsvSistemasOperativos: ListView = findViewById(R.id.lsvSO)

        // Crea el adaptador correctamente
        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrSO)

        // Asigna el adaptador a la ListView
        lsvSistemasOperativos.adapter = adaptador

        // Establece el listener para la acción de clic en el item
        lsvSistemasOperativos.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                applicationContext,
                "Has seleccionado: ${arrSO[position]} en la posición: $position",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
