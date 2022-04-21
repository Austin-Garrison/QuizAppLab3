package com.zybooks.quizapplab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val totalQuestions = intent.getIntExtra(QuestionBank.TOTAL_QUESTION,0)
        val correctAnswers = intent.getIntExtra(QuestionBank.CORRECT_ANSWERS,0)

        findViewById<TextView>(R.id.textview_score).text = "$totalQuestions / $totalQuestions"

        findViewById<Button>(R.id.button_restart).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}