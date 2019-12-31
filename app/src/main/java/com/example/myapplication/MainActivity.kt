 package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

 class MainActivity : AppCompatActivity() {
      ;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button =findViewById(R.id.roll)

        rollButton.setOnClickListener{
            rollDice()
        }
    }

     private fun rollDice() {
         val diceImage: ImageView =findViewById(R.id.image_dice)

         val drawableRes = when(Random().nextInt(6)+1){
             1 -> R.drawable.dice1
             2 -> R.drawable.dice2
             3 -> R.drawable.dice3
             4 -> R.drawable.dice4
             5 -> R.drawable.dice5
             else -> R.drawable.dice6
         }
     diceImage.setImageResource(drawableRes)
     }
 }
