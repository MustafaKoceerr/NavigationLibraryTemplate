package com.kocerlabs.navigationsafeargscustomobjects

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kocerlabs.navigationsafeargscustomobjects.databinding.FragmentABinding
import com.kocerlabs.navigationsafeargscustomobjects.model.User

class FragmentA : BaseFragment<FragmentABinding>() {
    override fun getViewBindingFragment(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentABinding = FragmentABinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            button.setOnClickListener {
                val firstName = firstNameEt.text.toString()
                val lastName = lastNameEt.text.toString()
                val user = User(firstName, lastName)

                val action = FragmentADirections.actionFragmentAToFragmentB(user)
                findNavController().navigate(action)
            }
        }

    }
}
