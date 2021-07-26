package com.example.recyclerviewdemo1

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewdemo1.adapter.RecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fruitsList = listOf<Fruit>(
        Fruit("Mango", "Tom"),
        Fruit("Banana", "Tom"),
        Fruit("Apple", "Henry"),
        Fruit("Strawberry", "Tommy"),
        Fruit("Lemon", "Jerry"),
        Fruit("Orange", "David"),
        Fruit("Plum", "Tom"),
        Fruit("Melon", "Tom"),
        Fruit("Watermelon", "Tom"),
        Fruit("Banana", "Tom"),

        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.setBackgroundColor(Color.GRAY)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerAdapter(fruitsList) { selectedFruitItem: Fruit ->
            listItemClicked(
                selectedFruitItem
            )
        }

    }

    private fun listItemClicked(fruit: Fruit) {
        Toast.makeText(this, "Supplier name is ${fruit.supplier}", Toast.LENGTH_LONG).show()

    }
}