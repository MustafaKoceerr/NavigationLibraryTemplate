package com.kocerlabs.customanimationswithnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kocerlabs.customanimationswithnavigation.databinding.FragmentFirstBinding

class FirstFragment : BaseFragment<FragmentFirstBinding>(){
    override fun getViewBindingFragment(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFirstBinding = FragmentFirstBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.goHomeFromFirst.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToHomeFragment()
            findNavController().navigate(action)
        }

    }
}