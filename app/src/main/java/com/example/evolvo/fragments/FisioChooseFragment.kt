package com.example.evolvo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.evolvo.R
import com.example.evolvo.adapters.TherapyAdapter
import com.example.evolvo.models.Category
import com.example.evolvo.models.Therapy
import kotlinx.android.synthetic.main.fragment_fisio_choose_layout.*

class FisioChooseFragment : Fragment() {


    val therapies : ArrayList<Therapy> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_fisio_choose_layout, container, false)
        addTherapy()
        var recyclerView  = view.findViewById<RecyclerView>(R.id.recyclerview_fisio)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter= TherapyAdapter(therapies, requireContext())
        return view
    }

    companion object{
        private val ARG_CAUGHT = "myFragment_cought"
        fun newIstance():FisioChooseFragment{
            val args: Bundle = Bundle()
            val fragment = FisioChooseFragment()
            return fragment
        }
    }

    fun addTherapy(){
        val category = Category("Healthcare")
        for (i in 1..20){
            val therapy = Therapy("Nome terapia "+i,
                "Descrizione malessere abbastanza lungo",
                "zona collo",
                false,
                false,
                false,
                true,
                5,
                category)
            therapies.add(therapy)
        }
    }

}