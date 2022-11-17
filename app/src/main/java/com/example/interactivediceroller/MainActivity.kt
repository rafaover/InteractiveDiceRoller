package com.example.interactivediceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
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
            val snackList = listOf(
                "Well Done!", "Let's Roll", "Roll Again!", "Oh No!", "Fuck That", "Hell No!"
            )
            Snackbar.make(rollButton, snackList.random(), Snackbar.LENGTH_SHORT).show()
        }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        val dice = Dice(20) // Calling Dice Class to create a D6
        val diceRoll1 = dice.roll()
        val diceRoll2 = dice.roll()


        // Update the screen with the dice roll
        val resultTextView1: TextView = findViewById(R.id.textView)
        val resultTextView2: TextView = findViewById(R.id.textView2)
        // Need to convert to string because of textView
        resultTextView1.text = diceRoll1.toString()
        resultTextView2.text = diceRoll2.toString()
    }
}