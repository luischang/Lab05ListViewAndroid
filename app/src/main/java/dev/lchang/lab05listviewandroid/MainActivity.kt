package dev.lchang.lab05listviewandroid

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class MainActivity : AppCompatActivity() {
    var arrPaises = arrayOf(
        "Peru", "Bolivia", "Venezuela", "Colombia", "Argentina", "Chile"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listaPaises : ListView = findViewById<View>(R.id.lsvPaises) as ListView

        val adaptador: Any? = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1,arrPaises)

        listaPaises.adapter = adaptador as ListAdapter?

        listaPaises.setOnItemClickListener{ parent, view, position, id ->
            Toast.makeText(
                applicationContext,
                "Posicion: $position",
                Toast.LENGTH_SHORT
            ).show()
        }





    }
    //New Comment: Infantes - Aguilar

    //NUEVO MENSAJE
}