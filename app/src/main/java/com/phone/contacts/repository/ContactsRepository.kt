package com.phone.contacts.repository

import com.phone.contacts.model.ContactData
import com.phone.contacts.MyContactsApp
import com.phone.contacts.database.ContactsDb
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val database = ContactsDb.getDatabase(MyContactsApp.appContext)

    suspend fun saveContact(contact: ContactData){
        withContext(Dispatchers.IO){
            database.getContactDao().insertContact(contact)


        }
    }
}