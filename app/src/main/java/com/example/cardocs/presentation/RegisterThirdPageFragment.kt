package com.example.cardocs.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.cardocs.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.fragment_register_third_page.*

class RegisterThirdPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_register_third_page, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        configCheckBox()
    }

    private fun configCheckBox() {
        cbMasculino.isChecked = false
        cbFeminino.isChecked = false
        cbOther.isChecked = false

        cbMasculino.setOnClickListener {
            cbFeminino.isChecked = false
            cbOther.isChecked = false
        }
        cbFeminino.setOnClickListener {
            cbMasculino.isChecked = false
            cbOther.isChecked = false
        }
        cbOther.setOnClickListener {
            cbFeminino.isChecked = false
            cbMasculino.isChecked = false
        }
    }

    companion object {
        fun newInstance() = RegisterThirdPageFragment()
    }
}