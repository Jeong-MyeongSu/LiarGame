package com.wjdaudtn.mini

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class PartFragment : Fragment() {

    private var count: Int = 0
    private var randomValue: Int = 0
    private lateinit var keyword: String

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_part, container, false)

        arguments?.let {
            count = it.getInt(ARG_COUNT)
            randomValue = it.getInt(ARG_RANDOM_VALUE)
            keyword = it.getString(ARG_KEYWORD).toString()
        }

        val txtFragmentPart: TextView = view.findViewById(R.id.txt_fragment_part)
        val txtFragmentKeyword: TextView = view.findViewById(R.id.txt_fragment_keyword)

        if (count == randomValue) {
            txtFragmentPart.text = "당신은 라이어 입니다."
            txtFragmentPart.setTextColor(Color.parseColor("#FE2E64"))
            txtFragmentKeyword.text = "키워드를 유추하여 정체를 숨기세요!"
        } else {
            txtFragmentPart.text = "당신은 시민 입니다."
            txtFragmentKeyword.text = "키워드 : $keyword"
        }

        return view
    }

    companion object {
        private const val ARG_COUNT = "count"
        private const val ARG_RANDOM_VALUE = "randomValue"
        private const val ARG_KEYWORD = "keyword"

        @JvmStatic
        fun newInstance(count: Int, randomValue: Int, keyword: String) =
            PartFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COUNT, count)
                    putInt(ARG_RANDOM_VALUE, randomValue)
                    putString(ARG_KEYWORD, keyword)
                }
            }
    }
}