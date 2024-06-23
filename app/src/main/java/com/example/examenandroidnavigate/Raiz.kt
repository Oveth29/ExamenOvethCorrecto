package com.example.examenandroidnavigate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examenandroidnavigate.databinding.FragmentRaizBinding

class Raiz : Fragment() {
    private lateinit var binding: FragmentRaizBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment using the inflater passed to the method
        binding = FragmentRaizBinding.inflate(inflater, container, false)
        start()
        return binding.root
    }

    private fun start() {
        binding.BtnRaiz.setOnClickListener {
            val num1: Double = binding.Tfnum1.editText?.text.toString().toDouble()
            val resultado: Double = raiz(num1)
            binding.tvResultado.text = resultado.toString()
        }
    }

    private fun raiz(num1: Double): Double {
        return kotlin.math.sqrt(num1)
    }
}
