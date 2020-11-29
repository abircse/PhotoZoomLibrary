package com.coxtunes.photozoomlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.chrisbanes.photoview.PhotoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val photoview = findViewById(R.id.photo_view) as PhotoView
        photoview.setImageResource(R.drawable.image)
    }
}