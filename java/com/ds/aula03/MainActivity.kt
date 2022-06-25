package com.ds.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {

//            val toast = Toast.makeText(this,"Rolou o dado!", Toast.LENGTH_SHORT).show()
//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = "6"
            rollDice()
        }

}

    class Dice(private val numSides : Int) {
        fun roll(): Int {
            val numero = (1..numSides).random()
            return (numero)
        }
    }
    private fun rollDice() {
        val dice = Dice (6)// quantidade de lados do dado
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)

        val drawableResource = when (diceRoll) {
            1 -> (R.drawable.dice_1)
            2 -> (R.drawable.dice_2)
            3 -> (R.drawable.dice_3)
            4 -> (R.drawable.dice_4)
            5 -> (R.drawable.dice_5)
            else -> (R.drawable.dice_6)
        }

        diceImage.contentDescription = diceRoll.toString()

    }
}



