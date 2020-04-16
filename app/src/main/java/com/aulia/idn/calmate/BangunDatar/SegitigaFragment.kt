package com.aulia.idn.calmate.BangunDatar


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.aulia.idn.calmate.R
import kotlinx.android.synthetic.main.fragment_segitiga.*


/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaFragment : Fragment() {
    private lateinit var frstNumb : String
    private lateinit var scndNumb : String
    private lateinit var thrdNumb : String
    private lateinit var frthNumb : String
    private var result : Double? = null
    private var fieldEmpty : Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_segitiga, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_luas_segitiga.setOnClickListener {
            frstNumb = et_frstNumbS.text.toString().trim()
            scndNumb = et_scndNumbS.text.toString().trim()
            thrdNumb = et_thrdNumbS.text.toString().trim()
            frthNumb = et_frthNumbS.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbS.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isNotEmpty()){
                fieldEmpty = true
                et_scndNumbS.error = resources.getString(R.string.error_field_empty)
            }
            if (thrdNumb.isNotEmpty()){
                fieldEmpty = true
                et_thrdNumbS.error = resources.getString(R.string.error_field_empty)
            }
            if (frthNumb.isEmpty()){
                fieldEmpty = true
                et_frthNumbS.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() * frthNumb.toDouble() / 2.0)
            tv_resultS.setText(result.toString())
        }
        btn_keliling_segitiga.setOnClickListener {
            frstNumb = et_frstNumbS.text.toString().trim()
            scndNumb = et_scndNumbS.text.toString().trim()
            thrdNumb = et_thrdNumbS.text.toString().trim()
            frthNumb = et_frthNumbS.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbS.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbS.error = resources.getString(R.string.error_empty_field)
            }
            if (thrdNumb.isEmpty()){
                fieldEmpty = true
                et_thrdNumbS.error = resources.getString(R.string.error_empty_field)
            }
            if (frthNumb.isNotEmpty()){
                fieldEmpty = true
                et_frthNumbS.error = resources.getString(R.string.error_field_empty)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() + scndNumb.toDouble() + thrdNumb.toDouble())
            tv_resultS.setText(result.toString())
        }
    }
}
