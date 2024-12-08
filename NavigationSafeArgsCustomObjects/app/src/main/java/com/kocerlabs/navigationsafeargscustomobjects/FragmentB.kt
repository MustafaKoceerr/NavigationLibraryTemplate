package com.kocerlabs.navigationsafeargscustomobjects

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.kocerlabs.navigationsafeargscustomobjects.databinding.FragmentBBinding

class FragmentB : BaseFragment<FragmentBBinding>() {

    private val args by navArgs<FragmentBArgs>()
    override fun getViewBindingFragment(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentBBinding = FragmentBBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView.text =
            "FirstName: ${args.currentUser.firstName}\nLastName: ${args.currentUser.lastName}"
    }
}
