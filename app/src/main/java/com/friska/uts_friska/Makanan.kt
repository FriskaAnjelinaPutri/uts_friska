package com.friska.uts_friska

import android.os.Bundle
import android.widget.Adapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.friska.uts_friska.Adapter.AdapterMakanan
import com.friska.uts_friska.Model.ModelMakanan

class Makanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_makanan)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val items = listOf(
            ModelMakanan("Chicken Curry", "Lorem ipsum dolor sit omet, consecteture.", R.drawable.image6),
            ModelMakanan("Chicken Burger", "Lorem ipsum dolor sit omet, consecteture.", R.drawable.image5),
            ModelMakanan("Broccoli Lasagna", "Lorem ipsum dolor sit omet, consecteture.", R.drawable.image4),
            ModelMakanan("Mexican Appetizer", "Lorem ipsum dolor sit omet, consecteture.", R.drawable.image3),
            ModelMakanan("Broccoli Lasagna", "Lorem ipsum dolor sit omet, consecteture.", R.drawable.image2),
            ModelMakanan("Broccoli Lasagna", "Lorem ipsum dolor sit omet, consecteture.", R.drawable.image1)
        )
        val adapter = AdapterMakanan(items)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}