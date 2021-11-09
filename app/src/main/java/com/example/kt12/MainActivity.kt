package com.example.kt12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kt12.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var listPictures = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addPictures()
        submitPicture()
        randomPicture()
    }
    private fun submitPicture() {
        binding.btnSubmit.setOnClickListener {
            listPictures.add(binding.etUrl.text.toString())
            binding.ivUrl.loadImage(binding.etUrl.text.toString())
        }
    }

    private fun randomPicture() {
        binding.btnRandom.setOnClickListener {
            binding.ivUrl.loadImage(listPictures.random())
        }
    }

    private fun addPictures() {
        listPictures.add("https://icdn.lenta.ru/images/2021/04/27/16/20210427163138131/detail_9b31eaf4376cdff03e0ba1bcaa826a01.jpg")
        listPictures.add("https://i.pinimg.com/236x/b4/d2/94/b4d294d5ae0be7f3d085c7c223fa5597.jpg")
        listPictures.add("https://i.pinimg.com/236x/ec/94/7d/ec947d4c309fe67d34ea5506a0999250.jpg")
        listPictures.add("https://i.pinimg.com/236x/22/46/56/2246562b46b81f2991723aa1cacd8ca5.jpg")
        listPictures.add("https://i.pinimg.com/236x/d6/b2/c2/d6b2c2e0d9df95df359f0a4aaa14146b.jpg")
    }
}