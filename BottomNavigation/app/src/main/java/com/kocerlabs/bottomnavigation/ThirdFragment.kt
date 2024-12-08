package com.kocerlabs.bottomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kocerlabs.bottomnavigation.databinding.FragmentThirdBinding

class ThirdFragment : BaseFragment<FragmentThirdBinding>() {
    override fun getViewBindingFragment(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentThirdBinding = FragmentThirdBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}

