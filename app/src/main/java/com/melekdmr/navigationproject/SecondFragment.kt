package com.melekdmr.navigationproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.melekdmr.navigationproject.databinding.FragmentFirstBinding
import com.melekdmr.navigationproject.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private var binding: FragmentSecondBinding?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        val view = binding!!.root
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

     arguments?.let {
         val kullaniciAdi=SecondFragmentArgs.fromBundle(it).username
         binding?.textView2?.text=kullaniciAdi
     }



        binding?.button2?.setOnClickListener {

            val action=SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            Navigation.findNavController(it).navigate(action)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
}

}
