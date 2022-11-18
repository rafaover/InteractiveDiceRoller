package com.example.interactivediceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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

            val snackListPos = listOf(
                "Well Done!", "Let's Roll", "That's what you got", "Hell Yeah!", "Noice!"
            )
            Snackbar.make(rollButton, snackListPos.random(), Snackbar.LENGTH_SHORT).show()

        }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        val dice = Dice(20) // Calling Dice Class to create a D6
        val diceRoll = dice.roll()
        // ID:Dice (ImageView)
        val diceImage: ImageView = findViewById(R.id.dice)
        // Update the result if the proper dice image
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}
