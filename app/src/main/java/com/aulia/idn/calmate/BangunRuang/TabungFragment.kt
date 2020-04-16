package com.aulia.idn.calmate.BangunRuang


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.aulia.idn.calmate.R
import kotlinx.android.synthetic.main.fragment_tabung.*
import kotlinx.android.synthetic.main.fragment_trapesium.*


/**
 * A simple [Fragment] subclass.
 *
 */
class TabungFragment : Fragment() {
    private lateinit var frstNumb : String
    private lateinit var scndNumb : String
    private var result : Double? = null
    private var fieldEmpty : Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tabung, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_luas_tabung.setOnClickListener {
            frstNumb = et_frstNumbTb.text.toString().trim()
            scndNumb = et_scndNumbTb.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbTb.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbTb.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (2.0 * 3.14 * frstNumb.toDouble() * (frstNumb.toDouble() + scndNumb.toDouble()))
            tv_resultTb.setText(result.toString())
        }
        btn_volume_tabung.setOnClickListener {
            frstNumb = et_frstNumbTb.text.toString().trim()
            scndNumb = et_scndNumbTb.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbTb.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbTb.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (3.14 * (frstNumb.toDouble() * frstNumb.toDouble()) * scndNumb.toDouble())
            tv_resultTb.setText(result.toString())
        }
    }
}
