package dev.lchang.lab05listviewandroid

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var arrSO = arrayOf(
        "FCBarcelona, ManchesterUnited, AlianzaLima, AstonVilla, RealBetis, ValenciaCF, InterMilan  "
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val lsvEquiposdefut: ListView = findViewById<View>(R.id.IsvSO) as ListView
        val adpEquiposdefut = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrSO)
        lsvEquiposdefut.adapter = adpEquiposdefut
        lsvEquiposdefut.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                applicationContext,
                "La seleccion seleccionada es: " + arrSO[position],
                Toast.LENGTH_SHORT
            ).show()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //hola
    }
}