package com.example.fragments.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.fragments.Communicator
import com.example.fragments.R



class FragmentA : Fragment() {

    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_a, container, false)
        communicator = activity as Communicator

        view.findViewById<Button>(R.id.button).setOnClickListener {
            communicator.passDataCommunicator(view.findViewById<EditText>(R.id.editText).text.toString())
        }

        return view

    }


}