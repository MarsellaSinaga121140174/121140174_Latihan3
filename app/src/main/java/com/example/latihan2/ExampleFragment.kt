package com.example.latihan2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.latihan2.databinding.FragmentExampleBinding

class ExampleFragment : Fragment() {

    private lateinit var binding: FragmentExampleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExampleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Access UI elements through binding
        binding.textView.text = "Hello, View Binding!"

        binding.button.setOnClickListener {
            // Button click listener
            // Do something here
        }
    }
}
