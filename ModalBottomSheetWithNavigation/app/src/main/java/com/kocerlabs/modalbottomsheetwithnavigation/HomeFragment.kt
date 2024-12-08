package com.kocerlabs.modalbottomsheetwithnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kocerlabs.modalbottomsheetwithnavigation.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun getViewBindingFragment(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonDialog.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToDialogFragment()
            findNavController().navigate(action)
        }
        binding.buttonBottomSheet.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToBottomSheetFragment()
            findNavController().navigate(action)
        }
    }
}