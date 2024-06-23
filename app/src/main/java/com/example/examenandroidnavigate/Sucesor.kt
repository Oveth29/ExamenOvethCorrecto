package com.example.examenandroidnavigate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examenandroidnavigate.databinding.FragmentSucesorBinding

class Sucesor : Fragment() {
    private lateinit var binding: FragmentSucesorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment using the inflater passed to the method
        binding = FragmentSucesorBinding.inflate(inflater, container, false)
        start()
        return binding.root
    }

    private fun start() {
        binding.BtnSucesor.setOnClickListener {
            val num1: Int = binding.Tfnum1.editText?.text.toString().toInt()
            val resultado: Int = sucesor(num1)
            binding.tvResultado.text = resultado.toString()
        }
    }

    private fun sucesor(num1: Int): Int {
        val sucesor = num1 + 1
        return Math.pow(sucesor.toDouble(), 3.0).toInt()
    }
}
