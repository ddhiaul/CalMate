package com.aulia.idn.calmate.BangunRuang


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.aulia.idn.calmate.R
import kotlinx.android.synthetic.main.fragment_kubus.*


/**
 * A simple [Fragment] subclass.
 *
 */
class KubusFragment : Fragment() {
    private lateinit var frstNumb : String
    private var result : Double? = null
    private var fieldEmpty : Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kubus, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_luas_kubus.setOnClickListener {
            frstNumb = et_frstNumbK.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbK.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (6.0 * (frstNumb.toDouble() * frstNumb.toDouble()))
            tv_resultK.setText(result.toString())
        }
        btn_volume_kubus.setOnClickListener {
            frstNumb = et_frstNumbK.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbK.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() * frstNumb.toDouble() * frstNumb.toDouble())
            tv_resultK.setText(result.toString())
        }
    }
}
