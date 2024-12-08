package com.kocerlabs.navigationlibrary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.kocerlabs.navigationlibrary.databinding.FragmentSecondBinding

class SecondFragment : BaseFragment<FragmentSecondBinding>() {
    override fun getViewBindingFragment(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSecondBinding = FragmentSecondBinding.inflate(inflater, container, false)

    val args: SecondFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myNumber = args.number
        binding.secondTxt.text = myNumber.toString()

        binding.secondTxt.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_firstFragment)
        }
    }
}