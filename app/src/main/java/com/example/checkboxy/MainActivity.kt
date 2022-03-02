package com.example.checkboxy

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder
class MainActivity : AppCompatActivity() {
    lateinit var pizza: CheckBox
    lateinit var kawa: CheckBox
    lateinit var burger: CheckBox
    lateinit var kebab: CheckBox
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        pizza = findViewById(R.id.checkBox1)
        kawa = findViewById(R.id.checkBox2)
        burger = findViewById(R.id.checkBox3)
        kebab = findViewById(R.id.checkBox4)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            var totalAmount: Int = 0
            val result = StringBuilder()
            result.append("Wyrane produkty")
            if (pizza.isChecked) {
                result.append("\nPizza 20 zł")
                totalAmount += 20
            }
            if (kawa.isChecked) {
                result.append("\nCoffee 7zł")
                totalAmount += 7
            }
            if (burger.isChecked) {
                result.append("\nBurger 15zł")
                totalAmount += 15
            }
            if (kebab.isChecked) {
                result.append("\nKebab 12zł")
                totalAmount += 12
            }
            result.append("\nRazem: " + totalAmount + "zł")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}