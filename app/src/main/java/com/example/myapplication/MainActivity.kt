package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.kotlinex.Employee

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val items = mutableListOf<Employee>()
        items.add(Employee("Tony","Tony@gmail.com",R.drawable.a))
        items.add(Employee("Stark","Stark@gmail.com",R.drawable.b))
        items.add(Employee("Joe","Joe@gmail.com",R.drawable.c))
        items.add(Employee("Who","Who@gmail.com",R.drawable.d))
        items.add(Employee("Nig","Nig@gmail.com",R.drawable.e))
        items.add(Employee("Ga","Ga@gmail.com",R.drawable.f))
        items.add(Employee("Adang","Adang@gmail.com",R.drawable.g))
        items.add(Employee("Ommal","Ommal@gmail.com",R.drawable.h))

        items.add(Employee("Tony","Tony@gmail.com",R.drawable.a))
        items.add(Employee("Stark","Stark@gmail.com",R.drawable.b))
        items.add(Employee("Joe","Joe@gmail.com",R.drawable.c))
        items.add(Employee("Who","Who@gmail.com",R.drawable.d))
        items.add(Employee("Nig","Nig@gmail.com",R.drawable.e))
        items.add(Employee("Ga","Ga@gmail.com",R.drawable.f))
        items.add(Employee("Adang","Adang@gmail.com",R.drawable.g))
        items.add(Employee("Ommal","Ommal@gmail.com",R.drawable.h))

        val recycler = findViewById<RecyclerView>(R.id.recyclerview)
        recycler.layoutManager = LinearLayoutManager(applicationContext)
        recycler.adapter = Adapter(applicationContext,items)
    }
}