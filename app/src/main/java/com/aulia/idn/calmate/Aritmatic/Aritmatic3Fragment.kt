package com.aulia.idn.calmate.Aritmatic


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.aulia.idn.calmate.R
import kotlinx.android.synthetic.main.fragment_aritmatic.*
import kotlinx.android.synthetic.main.fragment_aritmatic3.*


/**
 * A simple [Fragment] subclass.
 *
 */
class Aritmatic3Fragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_aritmatic3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_plus3.setOnClickListener {
            frstNumb = et_frstNumb3.text.toString().trim()
            scndNumb = et_scndNumb3.text.toString().trim()
            thrdNumb = et_thrdNumb3.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumb3.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumb3.error = resources.getString(R.string.error_empty_field)
            }
            if (thrdNumb.isEmpty()){
                fieldEmpty = true
                et_thrdNumb3.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() + scndNumb.toDouble() + thrdNumb.toDouble())
            tv_result3.setText(result.toString())
        }
        btn_min3.setOnClickListener {
            frstNumb = et_frstNumb3.text.toString().trim()
            scndNumb = et_scndNumb3.text.toString().trim()
            thrdNumb = et_thrdNumb3.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumb3.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumb3.error = resources.getString(R.string.error_empty_field)
            }
            if (thrdNumb.isEmpty()){
                fieldEmpty = true
                et_thrdNumb3.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() - scndNumb.toDouble() - thrdNumb.toDouble())
            tv_result3.setText(result.toString())
        }
        btn_kali3.setOnClickListener {
            frstNumb = et_frstNumb3.text.toString().trim()
            scndNumb = et_scndNumb3.text.toString().trim()
            thrdNumb = et_thrdNumb3.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumb3.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumb3.error = resources.getString(R.string.error_empty_field)
            }
            if (thrdNumb.isEmpty()){
                fieldEmpty = true
                et_thrdNumb3.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() * scndNumb.toDouble() * thrdNumb.toDouble())
            tv_result3.setText(result.toString())
        }
        btn_bagi3.setOnClickListener {
            frstNumb = et_frstNumb3.text.toString().trim()
            scndNumb = et_scndNumb3.text.toString().trim()
            thrdNumb = et_thrdNumb3.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumb3.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumb3.error = resources.getString(R.string.error_empty_field)
            }
            if (thrdNumb.isEmpty()){
                fieldEmpty = true
                et_thrdNumb3.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() / scndNumb.toDouble() / thrdNumb.toDouble())
            tv_result3.setText(result.toString())
        }
    }
}
