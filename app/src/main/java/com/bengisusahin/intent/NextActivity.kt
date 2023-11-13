package com.bengisusahin.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bengisusahin.intent.databinding.ActivityMainBinding
import com.bengisusahin.intent.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentFromMain = intent
        val name = intentFromMain.getStringExtra("name")
        binding.nameText.text = "Name: ${name}"

    }

    fun previous(view: View){
        val intent = Intent(this@NextActivity, MainActivity::class.java)
        startActivity(intent)
        //activity intent ile cagirlirsa onCreate tekrar cagirlir
    }


}