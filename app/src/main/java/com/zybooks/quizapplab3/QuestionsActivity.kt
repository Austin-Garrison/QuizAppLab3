package com.zybooks.quizapplab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOption: Int = 0
    private var mCorrectAnswers: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        mQuestionList = QuestionBank.getQuestions()
        setQuestion()
    }

    private fun setQuestion() {
        val button_submit = findViewById(R.id.button_submit) as Button
        button_submit.setOnClickListener {
            mCurrentPosition++
            setQuestion()
        }

        val question = mQuestionList!![mCurrentPosition - 1]

        if (mCurrentPosition == mQuestionList!!.size) {
            findViewById<TextView>(R.id.button_submit).text = "Finish"
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra(QuestionBank.CORRECT_ANSWERS, mCorrectAnswers)
            intent.putExtra(QuestionBank.TOTAL_QUESTION, mQuestionList!!.size - 1)
            startActivity(intent)
        }
        selectedOption(findViewById<RadioGroup>(R.id.radio_question))
        if (question!!.correctAnswer == mSelectedOption) {
            mCorrectAnswers++
        }

        findViewById<TextView>(R.id.textview_question).text = question!!.question
        findViewById<RadioButton>(R.id.textview_option_one).text = question.optionOne
        findViewById<RadioButton>(R.id.textview_option_two).text = question.optionTwo
        findViewById<RadioButton>(R.id.textview_option_three).text = question.optionThree
        findViewById<RadioButton>(R.id.textview_option_four).text = question.optionFour
    }

    override fun onClick(v: View?) {
        val button_submit = findViewById(R.id.button_submit) as Button
        button_submit.setOnClickListener {
            mCurrentPosition++
            setQuestion()
        }
    }



    private fun selectedOption(rg: RadioGroup) {
        mSelectedOption = rg.checkedRadioButtonId
    }
}