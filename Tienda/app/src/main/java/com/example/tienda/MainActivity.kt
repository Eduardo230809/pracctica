package com.example.tienda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tienda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        ejemplo()
    }
private fun ejemplo()= binding.btnCalcular.setOnClickListener {
var precio = binding.EtPrecio.text.toString()
    var precioo = precio.toInt()
    var iva = precioo*15/100
    var neto = precioo+iva

    binding.txtIVA.setText(iva.toString())
    binding.txtNeto.setText(neto.toString())

}
}