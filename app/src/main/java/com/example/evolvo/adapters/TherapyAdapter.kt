package com.example.evolvo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.evolvo.R
import com.example.evolvo.models.Therapy
import kotlinx.android.synthetic.main.item_treathment_layout.view.*

class TherapyAdapter (val therapies: ArrayList<Therapy>,val context: Context) : RecyclerView.Adapter<TherapyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_treathment_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return therapies.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.txt_nome?.text = therapies.get(position).name
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val txt_nome = view.txt_nome
    }

}