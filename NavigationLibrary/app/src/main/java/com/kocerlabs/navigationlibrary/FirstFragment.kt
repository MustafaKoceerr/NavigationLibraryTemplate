package com.kocerlabs.navigationlibrary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kocerlabs.navigationlibrary.databinding.FragmentFirstBinding


class FirstFragment : BaseFragment<FragmentFirstBinding>() {
    override fun getViewBindingFragment(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFirstBinding = FragmentFirstBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.firstTxt.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(22)
//            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
            Navigation.findNavController(view).navigate(action)
        }
    }

}