package com.example.dachaapp

import android.os.Bundle
import android.app.Fragment
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import android.widget.EditText
import com.example.dachaapp.databinding.ActivityMainBinding
import com.example.dachaapp.databinding.FragmentSize2Binding

class SizeFragment : Fragment() {

    private lateinit var binding: FragmentSize2Binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.continueBtn.setOnClickListener {

            // здесь при клике на кнопку получаются введенные значения
            val width_field = Integer.parseInt(binding.fieldWidth.text.toString())
            val length_field = Integer.parseInt(binding.fieldLength.text.toString())

            val intent = Intent(activity, MakeField::class.java)

            // здесь передаются в новую активити полученные значения
            intent.putExtra("width", width_field)
            intent.putExtra("length", length_field)

            activity?.startActivity(intent)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSize2Binding.inflate(inflater, container, false)
        return binding.root
    }
}

