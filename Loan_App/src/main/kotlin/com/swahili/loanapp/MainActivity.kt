package com.Swahili.loanapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val applyLoanButton: Button = findViewById(R.id.btnApplyLoan)
        val loanHistoryButton: Button = findViewById(R.id.btnLoanHistory)
        val settingsButton: Button = findViewById(R.id.btnSettings)

        applyLoanButton.setOnClickListener {
            startActivity(Intent(this, ApplyLoanActivity::class.java))
        }

        loanHistoryButton.setOnClickListener {
            startActivity(Intent(this, LoanHistoryActivity::class.java))
        }

        settingsButton.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }
}

