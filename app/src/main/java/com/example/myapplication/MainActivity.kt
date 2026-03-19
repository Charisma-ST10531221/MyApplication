package com.example.myapplication

import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var txtStudentNumber: EditText
    lateinit var txtName: EditText
    lateinit var txtAge: EditText
    lateinit var txtSubject: EditText
    lateinit var txtMark: EditText
    lateinit var txtResults: EditText
    lateinit var btnEvaluate: EditText
    lateinit var btnClear: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        txtStudentNumber= findViewById( R.id.txtName)
        txtName= findViewById(R.id.txtName)
        txtAge= findViewById(R.id.txtAge)
        txtSubject= findViewById(R.id.txtSubject)
        txtMark=findViewById(R.id.txtMark)
        txtResults=findViewById(R.id.txtResults)
        btnEvaluate=findViewById(R.id.btnEvaluate)
        btnClear=findViewById(R.id.btnClear)





            btnClear.setOnClickListener {
                txtStudentNumber.text.clear()
                txtName.text.clear()
                txtAge.text.clear()
                txtSubject.text.clear()
                txtMark.text.clear()


        }
        btnEvaluate.setOnClickListener {
            val StudentNo = txtStudentNumber.text.toString()
            val name = txtName.text.toString()
            val ageText = txtAge.text.toString()
            val subject = txtSubject.text.toString()
            val markText = txtMark.text.toString()

            if (StudentNo.isEmpty()||name.isEmpty()|| ageText.isEmpty()||subject.isEmpty()||text.isEmpty()||

        }
        else 

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}