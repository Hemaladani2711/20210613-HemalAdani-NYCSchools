package com.JPMC.a20210613_hemaladani_nycschools.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.JPMC.a20210613_hemaladani_nycschools.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listFragment= ListSchoolsFragment.newInstance()
        supportFragmentManager.beginTransaction()
            .add(R.id.container,listFragment)
            .addToBackStack(ListSchoolsFragment.TAG)
            .commit()
    }
}