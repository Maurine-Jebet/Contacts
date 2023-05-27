package com.phone.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.phone.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    private fun displayContacts(){
        val cont1=ContactData("","fyhudsvf","76853734")
        val cont2=ContactData("","gsaadds","641872238")
        val cont3=ContactData("","shgdjfhdsa","3472874392")
        val contactList= listOf(cont1,cont2,cont3)
        val tvAdapter=ContactAdapter(contactList)
        binding.rvNames.layoutManager=LinearLayoutManager(this)
        binding.rvNames.adapter=tvAdapter
    }
}