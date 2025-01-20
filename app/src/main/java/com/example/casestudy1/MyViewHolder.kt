package com.example.casestudy1

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var myTextView:TextView=itemView.findViewById<TextView>(R.id.textView)

}