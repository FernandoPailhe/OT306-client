package com.melvin.ongandroid.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.melvin.ongandroid.R
import com.melvin.ongandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.navContact -> {Toast.makeText(this@MainActivity, "Contacto", Toast.LENGTH_SHORT).show()
                    true}
                R.id.navHome-> {Toast.makeText(this@MainActivity, "Home", Toast.LENGTH_SHORT).show()
                    true}
                R.id.navNews-> {Toast.makeText(this@MainActivity, "Novedades", Toast.LENGTH_SHORT).show()
                    true}
                R.id.navTestimonials->{Toast.makeText(this@MainActivity, "Testimonios", Toast.LENGTH_SHORT).show()
                    true}
                R.id.navStaff->{Toast.makeText(this@MainActivity, "Nosotros", Toast.LENGTH_SHORT).show()
                    true}
                else -> false
            }
        }
    }
}