package dev.lchang.lab05listviewandroid

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //Crear una arreglo de string de manera global para simular los valores de la lista.
        var arrSO = arrayOf(
            "Super Mario World", "The Legend of Zelda: A Link to the Past", "Super Metroid", "Street Fighter II", "Chrono Trigger", "Donkey Kong Country", "EarthBound", "Final Fantasy VI", "Super Mario Kart", "Secret of Mana"
        )
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Se obtiene el view lstSO
        val lsvSistemasOperativos = findViewById<ListView>(R.id.lsvSO) as ListView
        // Se crea el adaptador para llenar la lista
        val adaptador: Any? =
            ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, arrSO)
        //Asignar el adaptador a la view
        lsvSistemasOperativos.adapter = adaptador as ListAdapter?
        // Se genera el metodo setOnItemClickListener para la view
        lsvSistemasOperativos.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                applicationContext,
                "Posición: $position",
                Toast.LENGTH_SHORT
            ).show()
        }

    }



}