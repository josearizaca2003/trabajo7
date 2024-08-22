package pe.edu.upeu.calcxml

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var valAnt=0.0
    var valAct=0.0
    var operador=""
    private lateinit var resultado:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        resultado=findViewById(R.id.txtResult)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        buttonSetup()
    }

    fun buttonSetup(){
        var listaB= arrayOf( R.id.btn9, R.id.btn8, R.id.btn7, R.id.btn6, R.id.btn5,
            R.id.btn4, R.id.btnSum, R.id.btnIgual)
        for (button in listaB){
            val butonx=findViewById<Button>(button)
            butonx.setOnClickListener { onclikListener(butonx) }
        }

    }

    fun onclikListener(view:View){
        when(view.id){
            R.id.btn9, R.id.btn8, R.id.btn7, R.id.btn6, R.id.btn5, R.id.btn4->{
                var butonx=findViewById<Button>(view.id)
                apenddNum(butonx.text.toString())
            }
            R.id.btnSum, R.id.btnMult->{

            }
            R.id.btnIgual->{

            }
        }
    }

    fun apenddNum(valor:String){
        resultado.append(valor)
    }



}