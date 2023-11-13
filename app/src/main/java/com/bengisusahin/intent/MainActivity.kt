package com.bengisusahin.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bengisusahin.intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun next(view: View){
        val intent = Intent(this@MainActivity, NextActivity::class.java)
        intent.putExtra("name",binding.editText.text.toString())
        startActivity(intent)
        finish() //activity intent ile cagirlirsa onCreate calistirilir Ama bu hafızaya kaydediyor o yüzden finishle activity i kapatıyoruz
    }
}