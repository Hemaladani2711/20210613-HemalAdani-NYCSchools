package com.JPMC.a20210613_hemaladani_nycschools.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.JPMC.a20210613_hemaladani_nycschools.R

private const val arg="dbn"

class DetailViewFragment : Fragment() {

    lateinit var dbn:String
    lateinit var txtSchoolName:TextView
    lateinit var txtWritingScore:TextView
    lateinit var txtReadingScore:TextView
    lateinit var txtMathScore:TextView

    override fun onAttach(context: Context) {
        super.onAttach(context)
        arguments?.let {
            dbn=it.getSerializable(arg) as String
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detail_view, container, false)
        txtSchoolName=view.findViewById(R.id.txt_school_name)
        txtWritingScore=view.findViewById(R.id.txt_sat_writing)
        txtReadingScore=view.findViewById(R.id.txt_sat_reading)
        txtMathScore=view.findViewById(R.id.txt_sat_math)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val viewModel=ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getScoreData(dbn).observe(viewLifecycleOwner,{score->
            score?.let {
                txtSchoolName.text=score.schoolName
                txtMathScore.text=getString(R.string.avg_math_score)+score.satMathAvgScore
                txtReadingScore.text=getString(R.string.avg_reading_score)+score.satCriticalReadingAvgScore
                txtWritingScore.text=getString(R.string.avg_writing_score)+score.satWritingAvgScore
            }

        })
    }

    companion object {
        val TAG= DetailViewFragment::class.simpleName
        fun newInstance(dbn:String) = DetailViewFragment().apply {
            arguments=Bundle().apply {
                putSerializable(arg,dbn)
            }
        }

    }
}