package com.kocerlabs.viewpager2withnavigation.onboarding.screens

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.kocerlabs.viewpager2withnavigation.BaseFragment
import com.kocerlabs.viewpager2withnavigation.R
import com.kocerlabs.viewpager2withnavigation.databinding.FragmentThirdScreenBinding
import com.kocerlabs.viewpager2withnavigation.onboarding.ViewPagerFragmentDirections

class ThirdScreen : BaseFragment<FragmentThirdScreenBinding>() {
    override fun getViewBindingFragment(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentThirdScreenBinding = FragmentThirdScreenBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        binding.finish.setOnClickListener {
            onBoardingFinish()
            val action = ViewPagerFragmentDirections.actionViewPagerFragmentToHomeFragment()
            findNavController().navigate(action)
        }
    }

    private fun onBoardingFinish() {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }
}

