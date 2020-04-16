package com.aulia.idn.calmate.BangunDatar


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.aulia.idn.calmate.R
import kotlinx.android.synthetic.main.fragment_persegi.*


/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiFragment : Fragment() {
    private lateinit var frstNumb : String
    private var result : Double? = null
    private var fieldEmpty : Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_persegi, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_luas_persegi.setOnClickListener {
            frstNumb = et_frstNumbP.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbP.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() * frstNumb.toDouble())
            tv_resultP.setText(result.toString())
        }
        btn_keliling_persegi.setOnClickListener {
            frstNumb = et_frstNumbP.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbP.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (4.0 * frstNumb.toDouble())
            tv_resultP.setText(result.toString())
        }
    }
}
