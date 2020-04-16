package com.aulia.idn.calmate.BangunDatar


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.aulia.idn.calmate.R
import kotlinx.android.synthetic.main.fragment_jajargenjang.*


/**
 * A simple [Fragment] subclass.
 *
 */
class JajargenjangFragment : Fragment() {
    private lateinit var frstNumb : String
    private lateinit var scndNumb : String
    private var result : Double? = null
    private var fieldEmpty : Boolean = false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jajargenjang, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_luas_jajargenjang.setOnClickListener {
            frstNumb = et_frstNumbJ.text.toString().trim()
            scndNumb = et_scndNumbJ.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbJ.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbJ.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() * scndNumb.toDouble())
            tv_resultJ.setText(result.toString())
        }
        btn_keliling_jajargenjang.setOnClickListener {
            frstNumb = et_frstNumbJ.text.toString().trim()
            scndNumb = et_scndNumbJ.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbJ.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbJ.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = ((2.0 * frstNumb.toDouble()) + (2.0 * scndNumb.toDouble()))
            tv_resultJ.setText(result.toString())
        }
    }
}
