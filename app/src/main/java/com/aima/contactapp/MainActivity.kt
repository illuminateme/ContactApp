package com.aima.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aima.contactapp.adapters.ContactAdapter
import com.aima.contactapp.databinding.ActivityAddContactBinding
import com.aima.contactapp.databinding.ActivityMainBinding
import com.aima.contactapp.models.AddContactActivity
import com.aima.contactapp.models.Contacts

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myContactAdapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addContactIcon.setOnClickListener {
            val intent = Intent(this, AddContactActivity::class.java)
            startActivity(intent)

        }

        binding.textContactAdd.setOnClickListener {
            val intent = Intent(this, AddContactActivity::class.java)
            startActivity(intent)
        }

        val contact: List<Contacts> = listOf(
            Contacts(
                R.drawable.ic_baseline_person_24,
                "Aima",
                "Atiari"

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote"

            ),
            Contacts(
                R.drawable.ic_baseline_person_24,
                "Aima",
                "Atiari"

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote"

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote"

            ),
            Contacts(
                R.drawable.ic_baseline_person_24,
                "Aima",
                "Atiari"

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote"

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote"

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote"

            ),
            Contacts(
                R.drawable.ic_baseline_person_24,
                "Aima",
                "Atiari"

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote"

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote"

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote"

            ),
            Contacts(
                R.drawable.ic_baseline_person_24,
                "Aima",
                "Atiari"

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote"

            )

        )

    myContactAdapter =  ContactAdapter(contact)
        binding.recyclerViewBlock.adapter = myContactAdapter
        }

}