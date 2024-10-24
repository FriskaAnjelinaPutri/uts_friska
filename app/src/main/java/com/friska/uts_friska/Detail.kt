package com.friska.uts_friska

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        val imageView5: ImageView = findViewById(R.id.imageView5)
        val detailTitleTextView: TextView = findViewById(R.id.detailTitleTextView)
        val commentEditText: EditText = findViewById(R.id.commentEditText)
        val button2: Button = findViewById(R.id.button2)

        val title = intent.getStringExtra("TITLE")
        val imageResId = intent.getIntExtra("IMAGE_RES_ID", R.drawable.image6)

        // Set the data to the views
        detailTitleTextView.text = title
        imageView5.setImageResource(imageResId)

        button2.setOnClickListener {
            finish() // Close the activity
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}