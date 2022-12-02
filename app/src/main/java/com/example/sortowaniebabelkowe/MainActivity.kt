package com.example.switchbab

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import com.example.sortowaniebabelkowe.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lbl = findViewById<TextView>(R.id.textView)
        var losbtn = findViewById<Button>(R.id.buttonLosowanie)
        var sortbtn = findViewById<Button>(R.id.buttonSortowanie)
        val sw1 = findViewById<Switch>(R.id.sw1)
        val sw2 = findViewById<Switch>(R.id.sw2)
        val sw3 = findViewById<Switch>(R.id.sw3)
        val sw4 = findViewById<Switch>(R.id.sw4)
        val sw5 = findViewById<Switch>(R.id.sw5)
        val sw6 = findViewById<Switch>(R.id.sw6)
        val sw7 = findViewById<Switch>(R.id.sw7)
        val sw8 = findViewById<Switch>(R.id.sw8)
        val sw9 = findViewById<Switch>(R.id.sw9)
        val t = IntArray(10)
        for (j in 1..9) {
            t[j] = 0
        }

        fun los(){
            var rnds = (1..9).random()
            t[rnds] = 1
            sw1.text = rnds.toString()

            rnds = (1..9).random()
            while(t[rnds] == 1)
                rnds = (1..9).random()
            t[rnds] = 1
            sw2.text = rnds.toString()

            rnds = (1..9).random()
            while(t[rnds] == 1)
                rnds = (1..9).random()
            t[rnds] = 1
            sw3.text = rnds.toString()

            rnds = (1..9).random()
            while(t[rnds] == 1)
                rnds = (1..9).random()
            t[rnds] = 1
            sw4.text = rnds.toString()

            rnds = (1..9).random()
            while(t[rnds] == 1)
                rnds = (1..9).random()
            t[rnds] = 1
            sw5.text = rnds.toString()

            rnds = (1..9).random()
            while(t[rnds] == 1)
                rnds = (1..9).random()
            t[rnds] = 1
            sw6.text = rnds.toString()

            rnds = (1..9).random()
            while(t[rnds] == 1)
                rnds = (1..9).random()
            t[rnds] = 1
            sw7.text = rnds.toString()

            rnds = (1..9).random()
            while(t[rnds] == 1)
                rnds = (1..9).random()
            t[rnds] = 1
            sw8.text = rnds.toString()

            rnds = (1..9).random()
            while(t[rnds] == 1)
                rnds = (1..9).random()
            t[rnds] = 1
            sw9.text = rnds.toString()

            for (j in 1..9) {
                t[j] = 0
            }
        }

        fun wypisanie(sws : Array<Int>) {
            lbl.text = "sortowanie: "
            for (pass in 0 until (sws.size))
            {
                var text = lbl.text
                lbl.text = text.toString() + "  " + sws[pass].toString()
            }
        }

        fun sortowanie(sws : Array<Int>) {
            for (pass in 0 until (sws.size - 1)) {
                // A single pass of bubble sort
                for (currentPosition in 0 until (sws.size - pass - 1)) {
                    // This is a single step
                    if (sws[currentPosition] > sws[currentPosition + 1]) {
                        val tmp = sws[currentPosition]
                        sws[currentPosition] = sws[currentPosition + 1]
                        sws[currentPosition + 1] = tmp
                    }
                }
            }

            wypisanie(sws)
        }

        fun prepare() {
            var sws : Array<Int> = arrayOf()
            var i = 0
            if(sw1.isChecked)
                sws += sw1.text.toString().toInt()
            if(sw2.isChecked)
                sws += sw2.text.toString().toInt()
            if(sw3.isChecked)
                sws += sw3.text.toString().toInt()
            if(sw4.isChecked)
                sws += sw4.text.toString().toInt()
            if(sw5.isChecked)
                sws += sw5.text.toString().toInt()
            if(sw6.isChecked)
                sws += sw6.text.toString().toInt()
            if(sw7.isChecked)
                sws += sw7.text.toString().toInt()
            if(sw8.isChecked)
                sws += sw8.text.toString().toInt()
            if(sw9.isChecked)
                sws += sw9.text.toString().toInt()

            sortowanie(sws)
        }


        losbtn.setOnClickListener {
            los()
        }

        sortbtn.setOnClickListener {
            prepare()
        }


    }
}