package com.tokoluka.loginapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    fun init (){
        button2.setOnClickListener {
            if(name.text.toString().isEmpty() || passwordTextView.text.toString().isEmpty()){

            }
            else{
                val intent = Intent(this,secondActivity::class.java)
                intent.putExtra("name",name.text.toString())
                startActivity(intent)

            }
        }
    }
}
