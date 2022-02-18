package com.example.salario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.salario.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

            binding.BtnCalcular.setOnClickListener{
            var salario = binding.EtSalario.text.toString()
               var salarioo = salario.toInt()

                var aumento1 = (salarioo*20/100)+salarioo
                var aumento2 = (salarioo*15/100)+salarioo
                var aumento3 = (salarioo*10/100)+salarioo

                val salarioTotal = when {
                        salarioo in 0..5000 -> binding.txtSalarioTotal.setText(aumento1.toString() + " "+ "es su nuevo salario")
                        salarioo in 5001..10000 -> binding.txtSalarioTotal.setText(aumento2.toString() + " "+ "es su nuevo salario")
                        else -> binding.txtSalarioTotal.setText(aumento3.toString() + " "+ "es su nuevo salario")
                }
            }
    }
}