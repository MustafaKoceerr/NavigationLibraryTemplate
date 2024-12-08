package com.kocerlabs.viewpager2withnavigation.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kocerlabs.viewpager2withnavigation.BaseFragment
import com.kocerlabs.viewpager2withnavigation.databinding.FragmentViewPagerBinding
import com.kocerlabs.viewpager2withnavigation.onboarding.screens.FirstScreen
import com.kocerlabs.viewpager2withnavigation.onboarding.screens.SecondScreen
import com.kocerlabs.viewpager2withnavigation.onboarding.screens.ThirdScreen

class ViewPagerFragment : BaseFragment<FragmentViewPagerBinding>() {
    override fun getViewBindingFragment(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentViewPagerBinding = FragmentViewPagerBinding.inflate(inflater, container, false)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)

        val fragmentList = listOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            viewLifecycleOwner.lifecycle
        )

        binding.viewPager.adapter = adapter

        return view
    }
}