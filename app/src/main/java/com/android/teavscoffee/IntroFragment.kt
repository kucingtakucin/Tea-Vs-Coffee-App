package com.android.teavscoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.android.teavscoffee.databinding.FragmentIntroBinding

class IntroFragment : Fragment() {
    private lateinit var dataBinding: FragmentIntroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_intro, container, false)
        dataBinding.apply {
            tombolMulai.setOnClickListener (
                Navigation.createNavigateOnClickListener(R.id.action_introFragment_to_quizFragment)
            )
            return root
        }
    }
}
