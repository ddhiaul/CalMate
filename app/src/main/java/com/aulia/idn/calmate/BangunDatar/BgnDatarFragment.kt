package com.aulia.idn.calmate.BangunDatar


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.FragmentManager
import com.aulia.idn.calmate.InfoActivity

import com.aulia.idn.calmate.R
import kotlinx.android.synthetic.main.fragment_bgn_datar.*


/**
 * A simple [Fragment] subclass.
 *
 */
class BgnDatarFragment : Fragment() {
    private lateinit var frstNumb : String
    private var result : Double? = null
    private var fieldEmpty : Boolean = false
    companion object {
        fun newInstance() : BgnDatarFragment {
            val fragment = BgnDatarFragment()
            val arg = Bundle()
            fragment.arguments = arg
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bgn_datar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        iv_info_bd.setOnClickListener {
            startActivity(Intent(context, InfoActivity::class.java))
        }

        iv_persegi.setOnClickListener {
            val fragment = PersegiFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fm_bgn_datar, fragment).addToBackStack(null)
                .commit()
        }
        iv_ppanjang.setOnClickListener {
            val fragment = PPanjangFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fm_bgn_datar, fragment).addToBackStack(null)
                .commit()
        }
        iv_lingkaran.setOnClickListener {
            val fragment = LingkaranFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fm_bgn_datar, fragment).addToBackStack(null)
                .commit()
        }
        iv_jajargenjang.setOnClickListener {
            val fragment = JajargenjangFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fm_bgn_datar, fragment).addToBackStack(null)
                .commit()
        }
        iv_segitiga.setOnClickListener {
            val fragment = SegitigaFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fm_bgn_datar, fragment).addToBackStack(null)
                .commit()
        }
        iv_trapesium.setOnClickListener {
            val fragment = TrapesiumFragment()
            val fragmentTransaction = childFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fm_bgn_datar, fragment).addToBackStack(null)
                .commit()
        }

        btn_luas_persegi_htg.setOnClickListener {
            frstNumb = et_frstNumbP_htg.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbP_htg.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (frstNumb.toDouble() * frstNumb.toDouble())
            tv_resultP_htg.setText(result.toString())
        }
        btn_keliling_persegi_htg.setOnClickListener {
            frstNumb = et_frstNumbP_htg.text.toString().trim()
            if (frstNumb.isEmpty()){
                fieldEmpty = true
                et_frstNumbP_htg.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty)
                result = (4.0 * frstNumb.toDouble())
            tv_resultP_htg.setText(result.toString())
        }
    }
}
