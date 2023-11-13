package com.bengisusahin.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bengisusahin.intent.databinding.ActivityMainBinding
import com.bengisusahin.intent.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}