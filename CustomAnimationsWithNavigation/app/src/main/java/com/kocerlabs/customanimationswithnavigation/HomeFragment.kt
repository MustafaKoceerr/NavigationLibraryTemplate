package com.kocerlabs.customanimationswithnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kocerlabs.customanimationswithnavigation.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun getViewBindingFragment(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            goFirst.setOnClickListener {
                val action = HomeFragmentDirections.actionHomeFragmentToFirstFragment()
                findNavController().navigate(action)
            }

            goSecond.setOnClickListener {
                val action = HomeFragmentDirections.actionHomeFragmentToSecondFragment()
                findNavController().navigate(action)
            }
        }

    }
}