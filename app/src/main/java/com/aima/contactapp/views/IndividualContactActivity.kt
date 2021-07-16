package com.aima.contactapp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aima.contactapp.databinding.ActivityIndividualContactBinding

class IndividualContactActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIndividualContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIndividualContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageTobePassed = intent.extras!!.getInt("image")
        val fNameTobePassed = intent.extras?.getString("fName")
        val lNameTobePassed = intent.extras?.getString("lName")
        val phoneNoTobePassed = intent.extras!!.getInt("phoneNo")

        binding.imageIndividual.setImageResource(imageTobePassed)
        binding.fnameIndividual.text = fNameTobePassed
        binding.lnameIndividual.text = lNameTobePassed
        binding.phonenoIndividual.text = phoneNoTobePassed.toString()
    }
}