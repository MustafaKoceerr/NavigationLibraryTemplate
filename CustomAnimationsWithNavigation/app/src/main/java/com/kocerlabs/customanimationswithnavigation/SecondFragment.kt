package com.kocerlabs.customanimationswithnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kocerlabs.customanimationswithnavigation.databinding.FragmentSecondBinding

class SecondFragment : BaseFragment<FragmentSecondBinding>() {
    override fun getViewBindingFragment(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSecondBinding = FragmentSecondBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.goHomeFromSecond.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToHomeFragment()
            findNavController().navigate(action)
        }
    }
}