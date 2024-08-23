package com.example.dachaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.dachaapp.databinding.ActivityMainBinding
import com.example.dachaapp.SizeFragment
import androidx.fragment.app.Fragment
import android.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.FragmentActivity




class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Устанавливаем обработчик нажатия на кнопку

        binding.addFieldBtn.setOnClickListener {

            //val intent = Intent(this@MainActivity, MakeField::class.java)
            //startActivity(intent) // Запускаем активность

            val transaction = fragmentManager.beginTransaction()

            // Create an instance of your fragment

            transaction.replace(binding.fragmentContainer.id, SizeFragment())

            // Commit the transaction
            transaction.commit()

        }
    }
}