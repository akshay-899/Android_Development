package com.example.mini_pro

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val droid=findViewById<TextView>(R.id.android)
        val ios_dev=findViewById<TextView>(R.id.ios)
        val machine_dev=findViewById<TextView>(R.id.machine)
        val web_dev=findViewById<TextView>(R.id.web)
        val block_dev=findViewById<TextView>(R.id.blockchain)
        val web3_dev=findViewById<TextView>(R.id.web3)
        val contact_us=findViewById<Button>(R.id.contact)
        droid.setOnClickListener {
            val intent = Intent(this, kot::class.java)
            startActivity(intent)
        }
        ios_dev.setOnClickListener {
            val intent=Intent(this,ios::class.java)
            startActivity(intent)

        }
        web_dev.setOnClickListener {
            val intent=Intent(this,web::class.java)
            startActivity(intent)
        }
        machine_dev.setOnClickListener {
            val intent=Intent(this,machine::class.java)
            startActivity(intent)
        }
        block_dev.setOnClickListener {
            val intent=Intent(this,block::class.java)
            startActivity(intent)
        }
        web3_dev.setOnClickListener {
            val intent=Intent(this,web3::class.java)
            startActivity(intent)
        }
        contact_us.setOnClickListener{
            val phonenumber="0"+999999999
            val intent=Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:$phonenumber")
            startActivity(intent)
        }



    }
}