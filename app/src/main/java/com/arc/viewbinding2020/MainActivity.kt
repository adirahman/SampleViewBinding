package com.arc.viewbinding2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.arc.viewbinding2020.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainButtonLogin.setOnClickListener {
            Toast.makeText(this,binding.mainEditTextUsername.text.toString()+" "
                    +binding.mainEditTextPassword.text.toString(),Toast.LENGTH_SHORT).show()
        }
    }
}
