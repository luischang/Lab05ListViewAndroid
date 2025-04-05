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
    var arrSo = arrayOf(
        "Android", "iPhone", "Windows Phone", "Blackberry", "Firefox OS", "Amazon World", "Nokia"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            //Hola Meza-Rosales
        }

        val lsvSistemasOperativos: ListView = findViewById<ListView>(R.id.lsvSO) as ListView

        val adaptador: Any? =
            ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, arrSo)

        lsvSistemasOperativos.adapter = adaptador as ListAdapter?

        lsvSistemasOperativos.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                applicationContext,
                "Posición $position",
                Toast.LENGTH_SHORT
            ).show()

        }
    }
}