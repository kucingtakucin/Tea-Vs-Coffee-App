package com.android.teavscoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.android.teavscoffee.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {
    private lateinit var dataBinding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.title = "About"
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false)
        dataBinding.apply {
            return root
        }
    }
}