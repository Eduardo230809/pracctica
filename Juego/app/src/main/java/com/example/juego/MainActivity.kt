package com.example.juego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.juego.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.BtnVerificar.setOnClickListener {
            var aleatorio=(1..10).random()
            var numero = binding.EtNum.text.toString().trim()
            var num = numero.toInt()

             if(num!=aleatorio && num!=null){
                 Toast.makeText(this, "No acertaste, el numero era $aleatorio", Toast.LENGTH_SHORT)
                     .show()

        } else if (num == aleatorio){
                 Toast.makeText(this, "Felicidades, acertaste!", Toast.LENGTH_SHORT)
                     .show()

        }




        }
    }
}