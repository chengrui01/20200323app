package com.example.a20220323app

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btn_send = findViewById<Button>(R.id.button2)
        var radioGroup1 = findViewById<RadioGroup>(R.id.radioGroup1)
        var radioGroup2 = findViewById<RadioGroup>(R.id.radioGroup2)
        var radioGroup3 = findViewById<RadioGroup>(R.id.redigGroup3)

        btn_send.setOnClickListener{
            var b = Bundle()
            b.putString("drink",radioGroup1.findViewById<RadioButton>
            (radioGroup1.checkedRadioButtonId).text.toString())

            b.putString("sugar",radioGroup2.findViewById<RadioButton>
                (radioGroup2.checkedRadioButtonId).text.toString())

            b.putString("ice",radioGroup3.findViewById<RadioButton>
                (radioGroup3.checkedRadioButtonId).text.toString())
            setResult(Activity.RESULT_OK, Intent().putExtras(b))
            finish()
        }
    }
}