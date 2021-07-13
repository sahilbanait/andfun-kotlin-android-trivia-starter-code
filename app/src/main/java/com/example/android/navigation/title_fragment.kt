package com.example.android.navigation

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.FragmentTitleBinding

class title_fragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title, container, false)
        binding.playButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_title_fragment2_to_gameFragment2)
        )
             //{ Navigation.findNavController(view).navigate(R.id.action_title_fragment2_to_gameFragment2)
             //second method
                 //view.findNavController().navigate(R.id.action_title_fragment2_to_gameFragment2)

            // }
        setHasOptionsMenu(true )
        return binding.root

        }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return NavigationUI.onNavDestinationSelected(item,requireView().findNavController())
        super.onOptionsItemSelected(item)
    }
}

