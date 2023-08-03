package com.phone.contacts.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.phone.contacts.databinding.ContactListItemBinding
import com.phone.contacts.model.ContactData
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactAdapter(var contactList:List<ContactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding=
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        var binding=holder.binding
        binding.tvdisplayName.text=currentContact.displayName
        binding.tvPhoneNumber.text=currentContact.PhoneNumber
        Picasso
            .get()
            .load(currentContact.avatar)
            .resize(80,80)
            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.ivImage)


    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactViewHolder(var binding: ContactListItemBinding):RecyclerView.ViewHolder(binding.root)