package com.kocerlabs.modalbottomsheetwithnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.kocerlabs.modalbottomsheetwithnavigation.databinding.FragmentBottomSheetBinding
import com.kocerlabs.modalbottomsheetwithnavigation.databinding.FragmentDialogBinding

class DialogFragment : DialogFragment(){
    private lateinit var binding: FragmentDialogBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDialogBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}