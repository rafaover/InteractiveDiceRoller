package com.example.interactivediceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
            //val resultTextView: TextView = findViewById(R.id.textView)
            //resultTextView.text = "6"

            // val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT) -- DEPRECATED
            // For future codes, using SnackBar is recommended by google via Material Design.
            Snackbar.make(rollButton, "WELL DONE", Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}