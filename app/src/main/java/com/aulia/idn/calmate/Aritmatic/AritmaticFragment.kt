package com.aulia.idn.calmate.Aritmatic


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aulia.idn.calmate.InfoActivity

import com.aulia.idn.calmate.R
import kotlinx.android.synthetic.main.fragment_aritmatic.*


/**
 * A simple [Fragment] subclass.
 *
 */
class AritmaticFragment : Fragment() {
    private lateinit var frstNumb : String
    private lateinit var scndNumb : String
    private var result : Double? = null
    private var fieldEmpty : Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_aritmatic, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iv_info_ar.setOnClickListener {
            startActivity(Intent(context, InfoActivity::class.java))
        }
        btn_arit2.setOnClickListener {
            val fragment = Aritmatic2Fragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fm_aritmatic, fragment).addToBackStack(null)
                .commit()
        }
        btn_arit3.setOnClickListener {
            val fragment = Aritmatic3Fragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fm_aritmatic, fragment).addToBackStack(null)
                .commit()
        }
        btn_arit4.setOnClickListener {
            val fragment = Aritmatic4Fragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fm_aritmatic, fragment)
                .commit()
        }
        btn_plus.setOnClickListener {
            frstNumb = et_frstNumbAr.text.toString().trim()
            scndNumb = et_scndNumbAr.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbAr.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbAr.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() + scndNumb.toDouble())
            tv_result_ar.setText(result.toString())
        }
        btn_min.setOnClickListener {
            frstNumb = et_frstNumbAr.text.toString().trim()
            scndNumb = et_scndNumbAr.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbAr.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbAr.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() - scndNumb.toDouble())
            tv_result_ar.setText(result.toString())
        }
        btn_kali.setOnClickListener {
            frstNumb = et_frstNumbAr.text.toString().trim()
            scndNumb = et_scndNumbAr.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbAr.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbAr.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() * scndNumb.toDouble())
            tv_result_ar.setText(result.toString())
        }
        btn_bagi.setOnClickListener {
            frstNumb = et_frstNumbAr.text.toString().trim()
            scndNumb = et_scndNumbAr.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbAr.error = resources.getString(R.string.error_empty_field)
            }
            if (scndNumb.isEmpty()){
                fieldEmpty = true
                et_scndNumbAr.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() / scndNumb.toDouble())
            tv_result_ar.setText(result.toString())
        }
    }
}
