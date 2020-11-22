package com.example.garage.ui.registration.age

import android.os.Bundle
import android.view.View
import com.example.garage.R
import com.example.garage.base.BaseFragment
import com.example.garage.utils.AnimationUtils
import com.example.garage.utils.setSeekBarChangeListener
import kotlinx.android.synthetic.main.fragment_age.*

class AgeFragment : BaseFragment() {

    override fun getViewId() = R.layout.fragment_age

    private var last_scale = 0f
    private var initial_scale = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupViews()
        setupListeners()
    }

    private fun setupViews() {
        tvAgeDesc.animateText(getString(R.string.age_desc))
    }


    private fun setupListeners() {
        seekBar.setSeekBarChangeListener {
            AnimationUtils.animateScale(imgRedMan, last_scale, it.toFloat())
            last_scale = it.toFloat()
            tvAge.text = it.toString()
            initial_scale = it
            if (it == 16) {
                tvAge.text = getString(R.string.age_16)
            } else if (it == 0) {
                tvAge.text = getString(R.string.age_one)
            }
            if (tvAgeDesc != null) {
                if (initial_scale >= 3 && initial_scale < 4)
                    tvAgeDesc.text = context?.getString(R.string.baby)
                else if (initial_scale >= 4 && initial_scale < 14)
                    tvAgeDesc.text = context?.getString(R.string.teenager)
                else if (initial_scale >= 15 && initial_scale <= 17)
                    tvAgeDesc.text = context?.getString(R.string.adult)
            }
        }
    }
}