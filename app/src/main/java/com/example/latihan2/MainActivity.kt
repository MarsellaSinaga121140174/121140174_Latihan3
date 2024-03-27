package com.example.latihan2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.latihan2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Add ExampleFragment to MainActivity
        val fragment = ExampleFragment()
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentContainer.id, fragment)
            .commit()

        // Show CustomDialog when button clicked
        binding.showDialogButton.setOnClickListener {
            val dialog = CustomDialog()
            val fragmentManager: FragmentManager = supportFragmentManager
            dialog.show(fragmentManager, "CustomDialog")
        }
    }
}
