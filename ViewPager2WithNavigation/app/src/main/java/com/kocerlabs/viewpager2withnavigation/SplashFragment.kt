package com.kocerlabs.viewpager2withnavigation

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.kocerlabs.viewpager2withnavigation.databinding.FragmentSplashBinding


class SplashFragment : BaseFragment<FragmentSplashBinding>() {
    override fun getViewBindingFragment(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSplashBinding = FragmentSplashBinding.inflate(inflater, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler(Looper.getMainLooper()).postDelayed({
            if (onBoardingFinish()) navigateToFragment(SplashFragmentDirections.actionSplashFragmentToHomeFragment())
            else navigateToFragment(SplashFragmentDirections.actionSplashFragmentToViewPagerFragment())
        }, 3000)


    }

    private fun onBoardingFinish(): Boolean {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished", false)
    }

    private fun navigateToFragment(action: NavDirections) {
        findNavController().navigate(
            action
        )
    }
}