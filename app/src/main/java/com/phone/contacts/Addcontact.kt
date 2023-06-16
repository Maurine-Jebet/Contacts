package com.phone.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.phone.contacts.databinding.ActivityAddcontactBinding

class Addcontact : AppCompatActivity() {
    lateinit var binding:ActivityAddcontactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddcontactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume(){
        super.onResume()
        binding.btnAddcontact.setOnClickListener {
            validateContact()
            clearError()
        }

    }
    fun validateContact(){
        val name=binding.etName.text.toString()
        val phone = binding.etPhone.text.toString()

        var error = false

        if (name.isBlank()){
            binding.tilName.error = "Enter name"
            error = true
        }
        if (phone.isBlank()){
            binding.tilPhone.error = "Enter Phone number"
            error = true
        }


        if(!error){
            Toast.makeText(this,"Contact added successfully", Toast.LENGTH_LONG)
                .show()
        }

    }

    fun clearError(){
        binding.tilName.error = null
        binding.tilPhone.error = null

    }

    }
