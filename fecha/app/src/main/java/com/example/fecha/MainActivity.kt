package com.example.fecha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.example.fecha.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            val user = binding.editTextTextPersonName.text.toString().trim()
            val year: Int = Calendar.getInstance().get(Calendar.YEAR)
            val userb = year - user.toInt();

            val imagenn = when {
                userb in 0..18 -> {
                    R.drawable.image_1

                }
                else -> {
                    R.drawable.image_2
                }

            }
            binding.imageView.setImageResource(imagenn)

            if (user == "") {
                Toast.makeText(this, "Ingrese su fecha de nacimiento porfavor", Toast.LENGTH_SHORT)
                    .show()
            } else if (userb < 18) {
                Toast.makeText(this, "es menor de edad", Toast.LENGTH_SHORT)
                    .show()

            } else if (userb >= 18) {
                Toast.makeText(this, "Es mayor de edad", Toast.LENGTH_SHORT)
                    .show()

            }
        }
    }

}