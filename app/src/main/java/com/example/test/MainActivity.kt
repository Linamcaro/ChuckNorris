package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.test.Constants.BASE_URL
import com.example.test.data.AppModule
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val service = AppModule.provideRetrofitInstance(BASE_URL)

        lifecycleScope.launch {
           val categories = service.getCategory()
            println(categories)
        }*/
    }



}