package com.selimcinar.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation


class SecondFragment : Fragment() {
    lateinit var button2: Button
    lateinit var textView2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button2 = button2.findViewById(R.id.button2)
        textView2 = textView2.findViewById(R.id.textView2)
        arguments?.let {
            //argümandan gelen veriyi kullanmak.
            val kullaniciAdi = SecondFragmentArgs.fromBundle(it).username
            println(kullaniciAdi)
            textView2.text=kullaniciAdi
        }

        button2.setOnClickListener {

            val  action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            Navigation.findNavController(it).navigate(action)

        }
    }


}