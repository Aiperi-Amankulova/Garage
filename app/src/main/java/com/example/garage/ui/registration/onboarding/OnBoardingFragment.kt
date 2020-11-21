package com.example.garage.ui.registration.onboarding

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.garage.R
import com.example.garage.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_onboarding.*

class OnBoardingFragment : BaseFragment() {

    override fun getViewId() = R.layout.fragment_onboarding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        button.setOnClickListener {
            findNavController().navigate(R.id.action_onBoardFragment_to_inputNameFragment)
        }
    }
}