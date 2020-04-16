package com.aulia.idn.calmate.BangunDatar


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.aulia.idn.calmate.R
import kotlinx.android.synthetic.main.fragment_trapesium.*


/**
 * A simple [Fragment] subclass.
 *
 */
class TrapesiumFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_trapesium, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_luas_trapesium.setOnClickListener {
            frstNumb = et_frstNumbT.text.toString().trim()
            scndNumb = et_scndNumbT.text.toString().trim()
            thrdNumb = et_thrdNumbT.text.toString().trim()
            frthNumb = et_frthNumbT.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbT.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbT.error = resources.getString(R.string.error_empty_field)
            }
            if (thrdNumb.isEmpty()){
                fieldEmpty = true
                et_thrdNumbT.error = resources.getString(R.string.error_empty_field)
            }
            if (frthNumb.isNotEmpty()){
                fieldEmpty = true
                et_frthNumbT.error = resources.getString(R.string.error_field_empty)
            }
            if (!fieldEmpty)
                result = ((frstNumb.toDouble() + scndNumb.toDouble()) * thrdNumb.toDouble() / 2.0)
            tv_resultT.setText(result.toString())
        }
        btn_keliling_trapesium.setOnClickListener {
            frstNumb = et_frstNumbT.text.toString().trim()
            scndNumb = et_scndNumbT.text.toString().trim()
            thrdNumb = et_thrdNumbT.text.toString().trim()
            frthNumb = et_frthNumbT.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbT.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbT.error = resources.getString(R.string.error_empty_field)
            }
            if (thrdNumb.isEmpty()){
                fieldEmpty = true
                et_thrdNumbT.error = resources.getString(R.string.error_empty_field)
            }
            if (frthNumb.isEmpty()){
                fieldEmpty = true
                et_frthNumbT.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() + scndNumb.toDouble() + thrdNumb.toDouble() + frthNumb.toDouble())
            tv_resultT.setText(result.toString())
        }
    }
}
