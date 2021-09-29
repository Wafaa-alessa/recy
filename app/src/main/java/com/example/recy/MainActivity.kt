package com.example.recy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var recy:RecyclerView
    lateinit var name: ArrayList<String>
private lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recy = findViewById(R.id.rv)
        name = ArrayList()

        name.add("wafaa")
        name.add("alesse")
        name.add("wafaa")
        name.add("alesse")

        recy.adapter= MyAdapter(name)
        recy.layoutManager=LinearLayoutManager(this)

        btn.setOnClickListener{
            val name1= ed.text.toString()
            name.add(name1)
            ed.text.clear()
            ed.clearFocus()
            recy.adapter?.notifyDataSetChanged()
        }
    }
}