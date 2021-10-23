package com.example.atv1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var cores: TextView
    private lateinit var layout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.cores = findViewById(R.id.tvCores)
        this.layout = findViewById(R.id.layout)

        this.layout.setOnClickListener {
            var red = Random.nextInt(0,255)
            var green = Random.nextInt(0,255)
            var blue = Random.nextInt(0,255)
            this.cores.text= red.toString() +" " + green.toString() + " " + blue.toString()
            this.layout.setBackgroundColor(Color.argb(255,red ,green ,blue))
        }
    }
}