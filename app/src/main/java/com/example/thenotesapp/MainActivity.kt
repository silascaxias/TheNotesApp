package com.example.thenotesapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.thenotesapp.databinding.ActivityMainBinding
import com.example.thenotesapp.viewmodel.NoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}