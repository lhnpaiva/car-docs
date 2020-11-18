package com.example.cardocs.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cardocs.R

class RegisterFirstPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_register_first_page, container, false)
    }

    companion object{
        fun newInstance() = RegisterFirstPageFragment()
    }
}