package com.example.examenandroidnavigate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examenandroidnavigate.databinding.FragmentCalculoCuadradoBinding

class CalculoCuadrado : Fragment() {
    private lateinit var binding: FragmentCalculoCuadradoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment using the inflater passed to the method
        binding = FragmentCalculoCuadradoBinding.inflate(inflater, container, false)
        start()
        return binding.root
    }

    private fun start() {
        binding.BtncalculoCuadrado.setOnClickListener {
            val num1: Int = binding.Tfnum1.editText?.text.toString().toInt()
            val resultado: Int = cuadrado(num1)
            binding.tvResultado.text = resultado.toString()
        }
    }

    private fun cuadrado(num1: Int): Int {
        return num1 * num1
    }
}