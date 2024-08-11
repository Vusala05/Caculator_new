package com.example.calculatoractivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.calculatoractivity.databinding.FragmentCalculateFragmentBinding


class Calculate_fragment : Fragment(R.layout.fragment_calculate_fragment) {

        private lateinit var binding: FragmentCalculateFragmentBinding

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            binding = FragmentCalculateFragmentBinding.bind(view)

            setupPlus()

        }

        private fun setupPlus() {
            binding.plus.setOnClickListener {
                val firstNum = binding.firstNum.text.toString().toDoubleOrNull() ?: 0.0
                val secondNum = binding.secondNum.text.toString().toDoubleOrNull() ?: 0.0
                val result = firstNum + secondNum
                val action = Calculate_fragmentDirections.actionCalculateFragmentToResultFragment(result.toString())
                Navigation.findNavController(it).navigate(action)
            }
        }


}