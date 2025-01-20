package com.example.casestudy1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(activity: RecyclerViewMain): RecyclerView.Adapter<MyViewHolder>(){

    private var names = mutableListOf(
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val mContext = parent.context
        val layoutInflater = LayoutInflater.from(mContext)
        val view = layoutInflater.inflate(R.layout.recyclerview_row, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val planet = names[position]
        holder.myTextView.text = planet
    }

    override fun getItemCount(): Int {
        return names.size
    }
}