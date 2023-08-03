package com.phone.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import com.phone.contacts.databinding.ActivityAddcontactBinding

class Addcontact : AppCompatActivity() {
    lateinit var binding:ActivityAddcontactBinding
    val contactViewHolder:ViewModel by viewModels()
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
    private fun validateContact(){
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
            Toast.makeText(this,getString(R.string.contact_added_successfully), Toast.LENGTH_LONG)
                .show()
        }

    }

    private fun clearError(){
        binding.tilName.error = null
        binding.tilPhone.error = null

    }

    }
