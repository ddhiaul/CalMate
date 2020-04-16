package com.aulia.idn.calmate.BangunRuang


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aulia.idn.calmate.InfoActivity

import com.aulia.idn.calmate.R
import kotlinx.android.synthetic.main.fragment_bgn_ruang.*


/**
 * A simple [Fragment] subclass.
 *
 */
class BgnRuangFragment : Fragment() {
    private lateinit var frstNumb : String
    private var result : Double? = null
    private var fieldEmpty : Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bgn_ruang, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iv_info_br.setOnClickListener {
            startActivity(Intent(context, InfoActivity::class.java))
        }
        iv_kubus.setOnClickListener {
            val fragment = KubusFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fm_bgn_ruang, fragment).addToBackStack(null)
                .commit()
        }
        iv_balok.setOnClickListener {
            val fragment = BalokFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fm_bgn_ruang, fragment).addToBackStack(null)
                .commit()
        }
        iv_tabung.setOnClickListener {
            val fragment = TabungFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fm_bgn_ruang, fragment).addToBackStack(null)
                .commit()
        }
        iv_kerucut.setOnClickListener {
            val fragment = KerucutFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fm_bgn_ruang, fragment).addToBackStack(null)
                .commit()
        }
        btn_luas_kubus_br.setOnClickListener {
            frstNumb = et_frstNumbK_br.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbK_br.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (6.0 * (frstNumb.toDouble() * frstNumb.toDouble()))
            tv_resultK_br.setText(result.toString())
        }
        btn_volume_kubus_br.setOnClickListener {
            frstNumb = et_frstNumbK_br.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbK_br.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() * frstNumb.toDouble() * frstNumb.toDouble())
            tv_resultK_br.setText(result.toString())
        }
    }
}
