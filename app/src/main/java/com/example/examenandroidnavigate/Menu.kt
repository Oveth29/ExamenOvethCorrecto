package com.example.examenandroidnavigate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.examenandroidnavigate.databinding.FragmentCalculoCuadradoBinding
import com.example.examenandroidnavigate.databinding.FragmentRaizBinding
import com.example.examenandroidnavigate.databinding.FragmentAntecesorBinding
import com.example.examenandroidnavigate.databinding.FragmentSucesorBinding
import com.example.examenandroidnavigate.databinding.FragmentMenuBinding

class Menu : Fragment() {
    lateinit var binding : FragmentMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMenuBinding.inflate(layoutInflater)
        binding.BtncalculoCuadrado.setOnClickListener {
            findNavController().navigate(R.id.go_calculoCuadrado)
        }

        binding.BtnRaiz.setOnClickListener {
            findNavController().navigate(R.id.go_raiz)
        }

        binding.BtnAntecesor.setOnClickListener {
            findNavController().navigate(R.id.go_antecesor)
        }

        binding.BtnSucesor.setOnClickListener {
            findNavController().navigate(R.id.go_sucesor)
        }
        return binding.root
    }

}