package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {
    lateinit var randomimage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val rollbutton: Button = findViewById(R.id.roll_button)
        rollbutton.setOnClickListener {
            rollDice()
        }
        val `reset-button`: Button = findViewById(R.id.reset_button) //for Reset button
        `reset-button`.setOnClickListener {
            resetdice()
        }
        randomimage=findViewById(R.id.dice_image)
    }
// function for reset dice
private fun resetdice() {
        randomimage.setImageResource(R.drawable.empty_dice)
    }

    private fun rollDice() {

        val randomInt = Random().nextInt(6) + 1

        val drawableresource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }


        randomimage.setImageResource(drawableresource)
    }



}
