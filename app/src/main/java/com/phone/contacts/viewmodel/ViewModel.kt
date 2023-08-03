package com.phone.contacts.viewmodel

import android.provider.ContactsContract
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.phone.contacts.model.ContactData
import com.phone.contacts.repository.ContactsRepository
import kotlinx.coroutines.launch

class classViewModel: ViewModel() {
    val contactsRepo = ContactsRepository()

    fun saveContact(contact: ContactData){
        viewModelScope.launch {
            contactsRepo.saveContact(contact)
        }

    }

}