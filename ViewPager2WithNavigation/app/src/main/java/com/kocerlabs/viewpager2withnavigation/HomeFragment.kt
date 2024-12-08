package com.kocerlabs.viewpager2withnavigation

import android.view.LayoutInflater
import android.view.ViewGroup
import com.kocerlabs.viewpager2withnavigation.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun getViewBindingFragment(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)



}