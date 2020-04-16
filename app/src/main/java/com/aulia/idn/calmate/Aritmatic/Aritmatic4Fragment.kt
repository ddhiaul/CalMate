package com.aulia.idn.calmate.Aritmatic


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.aulia.idn.calmate.R
import kotlinx.android.synthetic.main.fragment_aritmatic.*
import kotlinx.android.synthetic.main.fragment_aritmatic4.*


/**
 * A simple [Fragment] subclass.
 *
 */
class Aritmatic4Fragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_aritmatic4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_plus4.setOnClickListener {
            frstNumb = et_frstNumb4.text.toString().trim()
            scndNumb = et_scndNumb4.text.toString().trim()
            thrdNumb = et_thrdNumb4.text.toString().trim()
            frthNumb = et_frthNumb4.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (thrdNumb.isEmpty()){
                fieldEmpty = true
                et_thrdNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (frthNumb.isEmpty()){
                fieldEmpty = true
                et_frthNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() + scndNumb.toDouble() + thrdNumb.toDouble() + thrdNumb.toDouble())
            tv_result4.setText(result.toString())
        }
        btn_min4.setOnClickListener {
            frstNumb = et_frstNumb4.text.toString().trim()
            scndNumb = et_scndNumb4.text.toString().trim()
            thrdNumb = et_thrdNumb4.text.toString().trim()
            frthNumb = et_frthNumb4.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (thrdNumb.isEmpty()){
                fieldEmpty = true
                et_thrdNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (frthNumb.isEmpty()){
                fieldEmpty = true
                et_frthNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() - scndNumb.toDouble() - thrdNumb.toDouble() - thrdNumb.toDouble())
            tv_result4.setText(result.toString())
        }
        btn_kali4.setOnClickListener {
            frstNumb = et_frstNumb4.text.toString().trim()
            scndNumb = et_scndNumb4.text.toString().trim()
            thrdNumb = et_thrdNumb4.text.toString().trim()
            frthNumb = et_frthNumb4.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (thrdNumb.isEmpty()){
                fieldEmpty = true
                et_thrdNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (frthNumb.isEmpty()){
                fieldEmpty = true
                et_frthNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() * scndNumb.toDouble() * thrdNumb.toDouble() * frthNumb.toDouble())
            tv_result4.setText(result.toString())
        }
        btn_bagi4.setOnClickListener {
            frstNumb = et_frstNumb4.text.toString().trim()
            scndNumb = et_scndNumb4.text.toString().trim()
            thrdNumb = et_thrdNumb4.text.toString().trim()
            frthNumb = et_frthNumb4.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (thrdNumb.isEmpty()){
                fieldEmpty = true
                et_thrdNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (frthNumb.isEmpty()){
                fieldEmpty = true
                et_frthNumb4.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() / scndNumb.toDouble() / thrdNumb.toDouble() / frthNumb.toDouble())
            tv_result4.setText(result.toString())
        }
    }
}
