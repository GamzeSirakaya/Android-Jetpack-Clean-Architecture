package com.example.recyclerviewdemo1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo1.Fruit
import com.example.recyclerviewdemo1.R
import kotlinx.android.synthetic.main.list_item.view.*

class RecyclerAdapter(
    private val fruitList: List<Fruit>,
    private val clickListener: (Fruit) -> Unit
) :
    RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {


    class MyViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(fruit: Fruit, clickListener: (Fruit) -> Unit) {
            view.txt.text = fruit.name
            view.setOnClickListener {
                clickListener(fruit)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(fruitList[position], clickListener)
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }
}