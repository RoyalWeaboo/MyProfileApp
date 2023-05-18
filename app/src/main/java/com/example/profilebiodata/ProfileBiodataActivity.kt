package com.example.profilebiodata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class ProfileBiodataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_biodata)

        //mengambil semua textview untuk diproses
        val tvName: TextView = findViewById<TextView>(R.id.tvName)
        val tvEmail: TextView = findViewById<TextView>(R.id.tvEmailContent)
        val tvPhoneNumber: TextView = findViewById<TextView>(R.id.tvPhoneNumberContent)
        val tvAddress: TextView = findViewById<TextView>(R.id.tvAddressContent)

        //mengambil text pada textview
        val nama: String = tvName.text.toString()
        val email: String = tvEmail.text.toString()
        val number : String = tvPhoneNumber.text.toString()
        val address : String = tvAddress.text.toString()

        //menampilkan text pada textview dengan toast
        tvName.setOnClickListener {
            Toast.makeText(this, nama,Toast.LENGTH_SHORT).show()
        }
        tvEmail.setOnClickListener {
            Toast.makeText(this, email,Toast.LENGTH_SHORT).show()
        }
        tvPhoneNumber.setOnClickListener {
            Toast.makeText(this, number,Toast.LENGTH_SHORT).show()
        }
        tvAddress.setOnClickListener {
            Toast.makeText(this, address,Toast.LENGTH_SHORT).show()
        }
    }


}