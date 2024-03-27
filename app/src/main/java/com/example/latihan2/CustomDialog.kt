package com.example.latihan2

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.latihan2.databinding.DialogCustomBinding

class CustomDialog : DialogFragment() {

    private lateinit var binding: DialogCustomBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = DialogCustomBinding.inflate(layoutInflater)
        val dialog = Dialog(requireContext())
        dialog.setContentView(binding.root)

        // Set up your dialog here
        // For example:
        binding.dialogButton.setOnClickListener {
            // Do something
        }

        return dialog
    }
}