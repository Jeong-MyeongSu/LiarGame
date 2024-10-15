package com.wjdaudtn.mini

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class LastFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 뷰를 먼저 인플레이트합니다.
        val view = inflater.inflate(R.layout.fragment_last, container, false)

        // 인플레이트한 뷰에서 findViewById를 호출합니다.
        val btnBack: ImageView = view.findViewById(R.id.btn_back_fragment_last)
        btnBack.setOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }

        return view
    }
}