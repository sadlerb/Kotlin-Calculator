package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text: TextView =  findViewById(R.id.text_view_id)
        val one: Button =findViewById(R.id.num1)
        val two : Button = findViewById(R.id.num2)
        val three: Button = findViewById(R.id.num3)
        val four: Button = findViewById(R.id.num4)
        val five: Button = findViewById(R.id.num5)
        val six: Button = findViewById(R.id.num6)
        val seven: Button = findViewById(R.id.num7)
        val eight: Button = findViewById(R.id.num8)
        val nine: Button = findViewById(R.id.num9)
        val zero: Button = findViewById(R.id.num0)
        val plus: Button = findViewById(R.id.add)
        val minus: Button = findViewById(R.id.minus)
        val div: Button = findViewById(R.id.div)
        val multiply: Button = findViewById(R.id.multiply)
        val equals: Button = findViewById(R.id.equals)
        val del: Button = findViewById(R.id.del)
        val clear: Button = findViewById(R.id.clear)

        one.setOnClickListener{
            val current = text.text
            text.text = "$current 1".replace(" ", "")
        }

        two.setOnClickListener{
            val current = text.text
            text.text = "$current 2".replace(" ", "")
        }

        three.setOnClickListener{
            val current = text.text
            text.text = "$current 3".replace(" ", "")
        }

        four.setOnClickListener{
            val current = text.text
            text.text = "$current 4".replace(" ", "")
        }

        five.setOnClickListener{
            val current = text.text
            text.text = "$current 5".replace(" ", "")
        }

        six.setOnClickListener{
            val current = text.text
            text.text = "$current 6".replace(" ", "")
        }

        seven.setOnClickListener{
            val current = text.text
            text.text = "$current 7".replace(" ", "")
        }

        eight.setOnClickListener{
            val current = text.text
            text.text = "$current 8".replace(" ", "")
        }

        nine.setOnClickListener{
            val current = text.text
            text.text = "$current 9".replace(" ", "")
        }

        zero.setOnClickListener{
            val current = text.text
            text.text = "$current 0".replace(" ", "")
        }

        plus.setOnClickListener{
            val current = text.text
            text.text = "$current+"
        }

        minus.setOnClickListener{
            val current = text.text
            text.text = "$current-"
        }

        multiply.setOnClickListener{
            val current = text.text
            text.text = "$current*"
        }

        div.setOnClickListener{
            val current = text.text
            text.text = "$current/"
        }

        equals.setOnClickListener{
            val result = calculate(text.text as String)
            text.text = result
        }

        del.setOnClickListener{
            if (text.text.isNotEmpty()){
                text.text = text.text.toString().dropLast(1)
            }
        }

        clear.setOnClickListener{text.text=""}




    }


    private fun calculate(query: String): String {
        var res = ""
        try{
            val eval = ExpressionBuilder(query).build()
            res = eval.evaluate().toInt().toString()

        } catch (ex: Exception) {
            return "Syntax Error"
        }

        return res

    }


}
