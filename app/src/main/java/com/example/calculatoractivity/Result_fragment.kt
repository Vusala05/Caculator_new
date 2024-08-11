package com.example.calculatoractivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.calculatoractivity.databinding.FragmentResultFragmentBinding


class Result_fragment : Fragment(R.layout.fragment_result_fragment) {
    private lateinit var binding: FragmentResultFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentResultFragmentBinding.bind(view)

        arguments?.let {
            val result = Result_fragmentArgs.fromBundle(it).result
            binding.result.text = result
        }
        binding.back.setOnClickListener {
            val action = Result_fragmentDirections.actionResultFragmentToCalculateFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}

