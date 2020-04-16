package com.aulia.idn.calmate.BangunRuang


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.aulia.idn.calmate.R
import kotlinx.android.synthetic.main.fragment_balok.*


/**
 * A simple [Fragment] subclass.
 *
 */
class BalokFragment : Fragment() {
    private lateinit var frstNumb : String
    private lateinit var scndNumb : String
    private lateinit var thrdNumb : String
    private var result : Double? = null
    private var fieldEmpty : Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_balok, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_luas_balok.setOnClickListener {
            frstNumb = et_frstNumbB.text.toString().trim()
            scndNumb = et_scndNumbB.text.toString().trim()
            thrdNumb = et_thrdNumbB.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbB.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbB.error = resources.getString(R.string.error_empty_field)
            }
            if (thrdNumb.isEmpty()){
                fieldEmpty = true
                et_thrdNumbB.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (2.0 * ((frstNumb.toDouble() * scndNumb.toDouble()) + (frstNumb
                    .toDouble() * thrdNumb.toDouble()) + (scndNumb.toDouble() * thrdNumb.toDouble())))
            tv_resultB.setText(result.toString())
        }
        btn_volume_balok.setOnClickListener {
            frstNumb = et_frstNumbB.text.toString().trim()
            scndNumb = et_scndNumbB.text.toString().trim()
            thrdNumb = et_thrdNumbB.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbB.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbB.error = resources.getString(R.string.error_empty_field)
            }
            if (thrdNumb.isEmpty()){
                fieldEmpty = true
                et_thrdNumbB.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() * scndNumb.toDouble() * thrdNumb.toDouble())
            tv_resultB.setText(result.toString())
        }
    }
}
