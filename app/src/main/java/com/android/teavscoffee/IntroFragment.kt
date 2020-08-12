package com.android.teavscoffee

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.android.teavscoffee.databinding.FragmentIntroBinding

class IntroFragment : Fragment() {
    private lateinit var dataBinding: FragmentIntroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.title = "Game Teh atau Kopi"
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_intro, container, false)
        setHasOptionsMenu(true)
        dataBinding.apply {
            tombolMulai.setOnClickListener (
                Navigation.createNavigateOnClickListener(R.id.action_introFragment_to_quizFragment)
            )
            return root
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return view?.findNavController().let {
            NavigationUI.onNavDestinationSelected(item, it!!)
        } or super.onOptionsItemSelected(item)
    }
}
