package com.example.artbook_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.artbook_project.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun saveButtonClick(view: View) {

    }
    fun selectImage(view: View) {

    }
}