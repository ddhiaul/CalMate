package com.aulia.idn.calmate.BangunDatar


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.aulia.idn.calmate.R
import kotlinx.android.synthetic.main.fragment_ppanjang.*


/**
 * A simple [Fragment] subclass.
 *
 */
class PPanjangFragment : Fragment() {
    private lateinit var frstNumb : String
    private lateinit var scndNumb : String
    private var result : Double? = null
    private var fieldEmpty : Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ppanjang, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_luas_ppanjang.setOnClickListener {
            frstNumb = et_frstNumbPP.text.toString().trim()
            scndNumb = et_scndNumbPP.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbPP.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbPP.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() * scndNumb.toDouble())
            tv_resultPP.setText(result.toString())
        }
        btn_keliling_ppanjang.setOnClickListener {
            frstNumb = et_frstNumbPP.text.toString().trim()
            scndNumb = et_scndNumbPP.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbPP.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbPP.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = ((2.0 * frstNumb.toDouble()) + (2.0 * scndNumb.toDouble()))
            tv_resultPP.setText(result.toString())
        }
    }
}
