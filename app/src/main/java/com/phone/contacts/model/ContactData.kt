package com.phone.contacts.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contact")
data class ContactData(
    @PrimaryKey(autoGenerate = true)var contactId:Int,
    var avatar:String,
    var displayName:String,
    var PhoneNumber:String
)