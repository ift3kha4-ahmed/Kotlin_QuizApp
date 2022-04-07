package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.quizapp.Constants
import com.example.quizapp.MainActivity
import com.example.quizapp.R


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName:TextView = findViewById(R.id.tv_name )
        val tvScore:TextView = findViewById(R.id.tv_score)
        val btnFinish:Button = findViewById(R.id.btn_finish )

        tvName.text= intent.getStringExtra(Constants.USR_NAME)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        val  tvTotalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTIONS ,0)

        tvScore.text = "Your Score is $correctAnswers out of $tvTotalQuestion!!"

        btnFinish.setOnClickListener(){
            startActivity(Intent(this, MainActivity::class.java))

        }



    }
}