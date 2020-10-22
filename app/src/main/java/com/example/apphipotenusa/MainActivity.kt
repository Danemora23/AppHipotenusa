package com.example.apphipotenusa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun Hipotenusa(view: View) {
        //se crearon dos variales para el ingreso del cateo a y cateto b
        //las variales son de tipo String
        val myCatetoa: String = Catetoa.text.toString()
        val myCatetob: String = catetob.text.toString()

        //se creo otra variable que es tipo double para hacer la operacion
        //con el comando Math.hypot se calculo la hipotenusa
        //las variales las pasamos a Double

        val myResultado: Double = Math.hypot(myCatetoa.toInt().toDouble(),myCatetob.toInt().toDouble())
        resultado.setText(myResultado.toString())
    }
}