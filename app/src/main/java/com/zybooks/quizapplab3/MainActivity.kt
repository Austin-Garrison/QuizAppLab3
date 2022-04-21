package com.zybooks.quizapplab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_start = findViewById<Button>(R.id.button_start)
        val name = findViewById<EditText>(R.id.name).getText()

        button_start.setOnClickListener {
            if (name.toString().trim().equals("")){
                showAlertDialog()
            }
            else {
                val intent = Intent(this, QuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun showAlertDialog() {
        val alertDialog = AlertDialog.Builder(this)

        alertDialog.apply {
            setTitle("Error")
            setMessage("Please enter your name.")
            setPositiveButton("OK") { _, _ ->
            }
            setNegativeButton("Cancel") { _, _ ->
            }
        }.create().show()
    }
}


