package com.aima.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aima.contactapp.adapters.ContactAdapter
import com.aima.contactapp.databinding.ActivityAddContactBinding
import com.aima.contactapp.databinding.ActivityMainBinding
import com.aima.contactapp.models.AddContactActivity
import com.aima.contactapp.models.Contacts
import com.aima.contactapp.views.IndividualContactActivity

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
                "Aimajujfjf",
                "Atiarikkkgkgj",
                2348048474444

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote",
                2348048474444

            ),
            Contacts(
                R.drawable.ic_baseline_person_24,
                "Aima",
                "Atiari",
                2348048474444

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote",
                2348048474444

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote",
                2348048474444

            ),
            Contacts(
                R.drawable.ic_baseline_person_24,
                "Aima",
                "Atiari",
                2348048474444

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote",
                2348048474444

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote",
                2348048474444

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote",
                2348048474444

            ),
            Contacts(
                R.drawable.ic_baseline_person_24,
                "Aima",
                "Atiari",
                2348048474444

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote",
                2348048474444

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote",
                2348048474444

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote",
                2348048474444

            ),
            Contacts(
                R.drawable.ic_baseline_person_24,
                "Aima",
                "Atiari",
                2348048474444

            ),

            Contacts(
                R.drawable.ic_baseline_person_24,
                "John",
                "Mote",
                2348048474444

            )

        )

    myContactAdapter =  ContactAdapter(contact, this){
        val intent = Intent(this, IndividualContactActivity::class.java)
        intent.putExtra("image", it.image)
        intent.putExtra("fName", it.fName)
        intent.putExtra("lName", it.lName)
        intent.putExtra("phoneNum", it.phoneNo)
        startActivity(intent)
    }
        binding.recyclerViewBlock.adapter = myContactAdapter
        }

}