package com.android.teavscoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.android.teavscoffee.databinding.FragmentQuizBinding

class QuizFragment : Fragment() {
    private lateinit var dataBinding: FragmentQuizBinding
    private val questions: ArrayList<String> = arrayListOf(
        "Apa yang kamu minum saat sedang relax?",
        "Apa yang kamu minum saat kerja?",
        "Apa yang kamu minum saat ingin menonton film?",
        "Apa yang kamu minum sebelum tidur?"
    )
    private var teaScore: Int = 0
    private var coffeeScore: Int = 0
    private var current: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_quiz, container, false)
        dataBinding.apply {
            pertanyaan.text = questions[current]
            teaButton.setOnClickListener {
                teaScore++
                nextQuestion(dataBinding)
            }
            coffeeButton.setOnClickListener {
                coffeeScore++
                nextQuestion(dataBinding)
            }
            return root
        }
    }

    private fun nextQuestion(dataBinding: FragmentQuizBinding) {
        current++
        if (current < questions.size) {
            dataBinding.pertanyaan.text = questions[current]
            Toast.makeText(context, "Berhasil, Tea: $teaScore, Coffee: $coffeeScore", Toast.LENGTH_SHORT).show()
        } else
            Toast.makeText(context, "Sudah maksimal!!! Next Fragment...", Toast.LENGTH_SHORT).show()
    }
}
