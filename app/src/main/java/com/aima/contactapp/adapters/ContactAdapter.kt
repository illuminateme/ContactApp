package com.aima.contactapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aima.contactapp.databinding.ContactrvlayoutBinding
import com.aima.contactapp.models.Contacts

class ContactAdapter(private val contact: List<Contacts>) :
    RecyclerView.Adapter<ContactAdapter.ContactsViewHolder>() {

    inner class ContactsViewHolder(var binding: ContactrvlayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindContact(contacts: Contacts) {
            binding.apply {
                imageId.setImageResource(contacts.image)
                firstnameId.text = contacts.fName
                lastNameId.text = contacts.lName
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding = ContactrvlayoutBinding.inflate(LayoutInflater.from(parent.context))
        return ContactsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contacts = contact[position]
        holder.bindContact(contacts)
    }

    override fun getItemCount(): Int {
        return contact.size
    }


}