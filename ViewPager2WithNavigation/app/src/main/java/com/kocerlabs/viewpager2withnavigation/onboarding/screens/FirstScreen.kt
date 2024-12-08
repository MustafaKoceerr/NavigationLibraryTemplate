package com.kocerlabs.viewpager2withnavigation.onboarding.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.kocerlabs.viewpager2withnavigation.BaseFragment
import com.kocerlabs.viewpager2withnavigation.R
import com.kocerlabs.viewpager2withnavigation.databinding.FragmentFirstScreenBinding

class FirstScreen : BaseFragment<FragmentFirstScreenBinding>() {
    override fun getViewBindingFragment(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFirstScreenBinding = FragmentFirstScreenBinding.inflate(inflater, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        binding.next.setOnClickListener {
            viewPager?.currentItem = 1
        }

    }
}