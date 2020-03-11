package com.arc.viewbinding2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.arc.viewbinding2020.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var namaAdapter: NamaAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        namaAdapter = NamaAdapter(R.layout.item_nama)

        val listFakeName = ArrayList<String>()
        listFakeName.add("Ucok")
        listFakeName.add("Baba")
        listFakeName.add("Black")
        listFakeName.add("Sheep")

        binding.mainRvNama.adapter = namaAdapter
        namaAdapter.addItems(listFakeName)
    }
}
