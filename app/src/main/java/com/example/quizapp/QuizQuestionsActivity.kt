package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {

    private var progressBar: ProgressBar?=null
    private var tvProgress: TextView? = null
    private var tvQuestion:TextView? = null
    private var ivImage: ImageView? = null
    private var tvOptionOne:TextView? = null
    private var tvOptionTwo:TextView? = null
    private var tvOptionThree:TextView? = null
    private var tvOptionFour:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionsList = Constants.getQuestions()
        Log.i("QuestionsList size is ","${questionsList.size}")

        progressBar=findViewById(R.id.progressBar)
        tvQuestion = findViewById(R.id.tv_Question)
        ivImage = findViewById(R.id.iv_Flag)
        tvOptionOne = findViewById(R.id.optionOne)
        tvOptionTwo = findViewById(R.id.optionTwo)
        tvOptionThree = findViewById(R.id.optionThree)
        tvOptionFour = findViewById(R.id.optionFour)


        val currentPosition = 1 // Default and the first question position
        val question: Question? = questionsList[currentPosition - 1] // Getting the question from the list with the help of current position.



        progressBar?.progress = currentPosition // Setting the current progress in the progressbar using the position of question
        tvProgress?.text = "$currentPosition" + "/" + progressBar?.getMax() // Setting up the progress text

        // Now set the current question and the options in the UI
        tvQuestion?.text = question!!.question
        ivImage?.setImageResource(question.image)
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour

    }

}