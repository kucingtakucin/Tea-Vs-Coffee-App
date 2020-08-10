package com.android.teavscoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.android.teavscoffee.databinding.FragmentFinishBinding

class FinishFragment : Fragment() {
    private lateinit var dataBinding: FragmentFinishBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_finish, container, false)
        val args = arguments?.let { FinishFragmentArgs.fromBundle(it) }
        dataBinding.apply {
            hasil.text = args?.result
            return root
        }
    }

}
