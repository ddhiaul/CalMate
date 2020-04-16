package com.aulia.idn.calmate.BangunRuang


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.aulia.idn.calmate.R
import kotlinx.android.synthetic.main.fragment_kerucut.*


/**
 * A simple [Fragment] subclass.
 *
 */
class KerucutFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_kerucut, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_luas_kerucut.setOnClickListener {
            frstNumb = et_frstNumbKr.text.toString().trim()
            scndNumb = et_scndNumbKr.text.toString().trim()
            thrdNumb = et_thrdNumbKr.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbKr.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbKr.error = resources.getString(R.string.error_empty_field)
            }
            if (thrdNumb.isNotEmpty()){
                fieldEmpty = true
                et_thrdNumbKr.error = resources.getString(R.string.error_field_empty)
            }
            if (!fieldEmpty)
                result = (3.14 * frstNumb.toDouble() * (frstNumb.toDouble() + scndNumb.toDouble()))
            tv_resultKr.setText(result.toString())
        }
        btn_volume_kerucut.setOnClickListener {
            frstNumb = et_frstNumbKr.text.toString().trim()
            scndNumb = et_scndNumbKr.text.toString().trim()
            thrdNumb = et_thrdNumbKr.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbKr.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isNotEmpty()){
                fieldEmpty = true
                et_scndNumbKr.error = resources.getString(R.string.error_field_empty)
            }
            if (thrdNumb.isEmpty()){
                fieldEmpty = true
                et_thrdNumbKr.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (3.14 * (frstNumb.toDouble() * frstNumb.toDouble()) * thrdNumb.toDouble() / 3.0)
            tv_resultKr.setText(result.toString())
        }
    }
}
