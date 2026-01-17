package com.example.firstappfaerbergnasida

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 1. Список героев
        val heroes = listOf("Medusa", "Tinker", "Kez", "Sand King", "Muerta")

        // 2. Находим View по ID из XML
        val heroText: TextView = findViewById(R.id.hero)
        val actionButton: Button = findViewById(R.id.button)

        // 3. Реакция на нажатие
        actionButton.setOnClickListener {
            heroText.text = heroes.random() // Выбирает случайный элемент
        }
    }
}
