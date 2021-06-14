package com.JPMC.a20210613_hemaladani_nycschools.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.JPMC.a20210613_hemaladani_nycschools.R
import com.JPMC.a20210613_hemaladani_nycschools.api.objects.School

class ListSchoolsFragment : Fragment(), SchoolsAdapter.SchoolsClickListener {

    companion object {
        val TAG= ListSchoolsFragment::class.simpleName
        fun newInstance() = ListSchoolsFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var schools:List<School>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.list_schools_fragment, container, false)
        recyclerView=view.findViewById(R.id.recyclerview)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getSchoolData().observe(viewLifecycleOwner,{items->
            items?.let {
                schools=it
                val adapter = SchoolsAdapter(it)
                recyclerView.layoutManager=LinearLayoutManager(context)
                adapter.setListener(this)
                recyclerView.adapter=adapter

            }
        }
        )

    }

    override fun clickListener(view: View?, position: Int) {
        val detailFragment= DetailViewFragment.newInstance(schools[position].dbn)
        parentFragmentManager.beginTransaction()
            .replace(R.id.container,detailFragment)
            .addToBackStack(DetailViewFragment.TAG)
            .commit()
    }

}