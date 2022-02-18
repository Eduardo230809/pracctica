package com.example.nota

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nota.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.BtnCalcular.setOnClickListener{
            val sist1 = binding.EtSist1.text.toString().trim()
            val sist2 = binding.EtSist2.text.toString().trim()
            val examen = binding.Etexamen.text.toString().trim()


            val notaFinal = sist1.toInt() + sist2.toInt() + examen.toInt();

            val nota = when {
               notaFinal < 85 -> binding.txtnota.setText(notaFinal.toString() + " "+ "reprobo")
               notaFinal >=85 -> binding.txtnota.setText(notaFinal.toString() + " "+ "aprobo")
                else -> "revise sus calificaciones"
}


        }
    }

}