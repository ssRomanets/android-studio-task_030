package com.example.task_030

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 * Use the [ViewPagerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val authorNamesPagerTV: TextView = view.findViewById(R.id.autorNamesTV)
        val pictureNamePagerTV: TextView = view.findViewById(R.id.pictureNameTV)
        val viewPagerIV: ImageView = view.findViewById(R.id.viewPagerIV)
        val viewPagerItem = arguments?.getSerializable("vp") as OnBoardingFragmentViewPagerModel
        authorNamesPagerTV.text = viewPagerItem.authorNames
        pictureNamePagerTV.text = viewPagerItem.pictureName
        viewPagerIV.setImageResource(viewPagerItem.imageView)
    }
}












