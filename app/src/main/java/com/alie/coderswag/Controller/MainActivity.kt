package com.alie.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.alie.coderswag.Adapters.CategoryAdapter
import com.alie.coderswag.Model.Category
import com.alie.coderswag.R
import com.alie.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        adapter = ArrayAdapter(this,
//            android.R.layout.simple_list_item_1,
//            DataService.categories)
        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        /*categoryListView.setOnItemClickListener { parent, view, position, id ->
            val category = DataService.categories[position]
            Toast.makeText(this,"You clicked on the ${category.title} cell",Toast.LENGTH_SHORT).show()
        }*/
    }
}
