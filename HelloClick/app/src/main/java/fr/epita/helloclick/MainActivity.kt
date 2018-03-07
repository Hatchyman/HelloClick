package fr.epita.helloclick

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

private var increment = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.buttonClick)
        val btnReset = findViewById<Button>(R.id.buttonReset)
        val btnReverse = findViewById<Button>(R.id.buttonReverse)
        val btnBig = findViewById<Button>(R.id.ButtonBig)
        val btnNormal = findViewById<Button>(R.id.buttonNormal)
        btnClick.setOnClickListener(this@MainActivity)
        btnReset.setOnClickListener(this@MainActivity)
        btnReverse.setOnClickListener(this@MainActivity)
        btnBig.setOnClickListener(this@MainActivity)
        btnNormal.setOnClickListener(this@MainActivity)

    }

    override fun onClick(clickedView: View?) {
       if (clickedView != null)
       {
           when (clickedView.id)
           {
               R.id.buttonClick -> {

                   val textCount = findViewById<TextView>(R.id.textViewCount)
                   val count: Int
                   count =  Integer.parseInt(textCount.text.toString()) + increment
                   textCount.text = count.toString()

               }

               R.id.buttonReset ->
               {
                   val textCount = findViewById<TextView>(R.id.textViewCount)
                   textCount.text = "0"

               }

               R.id.buttonReverse ->
               {
                   val textCount = findViewById<TextView>(R.id.textViewCount)
                   val count: Int
                   count =  Integer.parseInt(textCount.text.toString()) - increment
                   textCount.text = count.toString()

               }

               R.id.ButtonBig ->
               {
                    increment = 10
               }

               R.id.buttonNormal ->
               {
                    increment = 1
               }
           }
       }
    }

}
