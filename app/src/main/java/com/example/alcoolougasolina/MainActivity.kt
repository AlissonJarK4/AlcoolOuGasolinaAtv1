package com.example.alcoolougasolina

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CompoundButton
import android.widget.EditText
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var percentual: Double = 0.7
    var escolha: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("PDM23", "No onCreate, $percentual")

        val switch: Switch = findViewById(R.id.swPercentual)
        val btCalc: Button = findViewById(R.id.btCalcular)
        btCalc.setOnClickListener(View.OnClickListener {
            //código do evento

            val fieldAlcool: EditText = findViewById(R.id.edAlcool)
            val fieldGasolina: EditText = findViewById(R.id.edGasolina)

            val valAlcool: Double;
//            if (fieldAlcool.text.toString() == "")
//                valAlcool = 0.0
//            else
                valAlcool = fieldAlcool.text.toString().toDouble()
            val valGasolina: Double;
//            if (fieldAlcool.text.toString() == "")
//                valGasolina = 0.0
//            else
                valGasolina = fieldGasolina.text.toString().toDouble()


            Log.d("PDM23", fieldAlcool.text.toString())
            Log.d("PDM23", fieldGasolina.text.toString())
//            Log.d("PDM23", percentual.toString())

            var calculo = fieldGasolina.text.toString().toDouble() * percentual;

            if (valAlcool < calculo) escolha =
                "Alcool" else escolha = "Gasolina"

            Log.d("PDM23", "Escolha mais barata: $escolha")
        })

        switch.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            percentual = if (isChecked) 0.75 else 0.70;
            // do something, the isChecked will be
            // true if the switch is in the On position
        })
    }

    override fun onResume() {
        super.onResume()
        Log.d("PDM23", "No onResume, $percentual")
    }

    override fun onStart() {
        super.onStart()
        Log.d("PDM23", "No onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("PDM23", "No onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("PDM23", "No onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("PDM23", "No onResume")
    }
}