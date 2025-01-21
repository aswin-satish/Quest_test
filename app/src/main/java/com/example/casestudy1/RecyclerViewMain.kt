package com.example.casestudy1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewMain : Fragment() {
    private lateinit var mRecyclerView: RecyclerView
    private var mAdapter: RecyclerViewAdapter = RecyclerViewAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.recyclerview_main,container,false)

        mRecyclerView = view.findViewById<RecyclerView>(R.id.recyclerview)
        //mRecyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        mRecyclerView.layoutManager = LinearLayoutManager(requireContext(),RecyclerView.VERTICAL,false)

        mRecyclerView.adapter = mAdapter


        return view
    }
}