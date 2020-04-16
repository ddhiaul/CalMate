package com.aulia.idn.calmate.Aritmatic


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.aulia.idn.calmate.R
import kotlinx.android.synthetic.main.fragment_aritmatic.*
import kotlinx.android.synthetic.main.fragment_aritmatic2.*


/**
 * A simple [Fragment] subclass.
 *
 */
class Aritmatic2Fragment : Fragment() {
    private lateinit var frstNumb : String
    private lateinit var scndNumb : String
    private var result : Double? = null
    private var fieldEmpty : Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_aritmatic2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_plus2.setOnClickListener {
            frstNumb = et_frstNumb2.text.toString().trim()
            scndNumb = et_scndNumb2.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumb2.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumb2.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() + scndNumb.toDouble())
            tv_result2.setText(result.toString())
        }
        btn_min2.setOnClickListener {
            frstNumb = et_frstNumb2.text.toString().trim()
            scndNumb = et_scndNumb2.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumb2.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumb2.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() - scndNumb.toDouble())
            tv_result2.setText(result.toString())
        }
        btn_kali2.setOnClickListener {
            frstNumb = et_frstNumb2.text.toString().trim()
            scndNumb = et_scndNumb2.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumb2.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumb2.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() * scndNumb.toDouble())
            tv_result2.setText(result.toString())
        }
        btn_bagi2.setOnClickListener {
            frstNumb = et_frstNumb2.text.toString().trim()
            scndNumb = et_scndNumb2.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumb2.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumb2.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() / scndNumb.toDouble())
            tv_result2.setText(result.toString())
        }
    }
}
