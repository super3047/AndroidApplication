package com.example.emotiondetection

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ChallengeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge)

        val btnRetry = findViewById<Button>(R.id.btn_retry)
        val btnExit = findViewById<Button>(R.id.btn_exit)

        btnRetry.setOnClickListener {
            // TODO: 填写再来按钮的逻辑，如刷新挑战等
        }
        btnExit.setOnClickListener {
            finish()
        }
    }
} 