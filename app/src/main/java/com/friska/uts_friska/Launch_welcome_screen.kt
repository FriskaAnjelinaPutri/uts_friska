package com.friska.uts_friska

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Launch_welcome_screen : AppCompatActivity() {
    private lateinit var btnLog: Button
    private lateinit var btnSig: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_launch_welcome_screen)
        btnLog=findViewById(R.id.btnLogin)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnLog.setOnClickListener(){
            val intentMenu2 = Intent(this@Launch_welcome_screen, Login::class.java)
            startActivity(intentMenu2)
        }
        btnSig=findViewById(R.id.btnLogin)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnSig.setOnClickListener(){
            val intentMenu2 = Intent(this@Launch_welcome_screen, Login::class.java)
            startActivity(intentMenu2)
        }
    }
}