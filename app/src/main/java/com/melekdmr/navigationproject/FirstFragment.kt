package com.melekdmr.navigationproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.melekdmr.navigationproject.databinding.FragmentFirstBinding



class FirstFragment : Fragment() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    private var binding:FragmentFirstBinding?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding!!.root
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.button1?.setOnClickListener {

            val action=FirstFragmentDirections.actionFirstFragmentToSecondFragment("melekdemir")
            Navigation.findNavController(it).navigate(action)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}