package com.JPMC.a20210613_hemaladani_nycschools.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.JPMC.a20210613_hemaladani_nycschools.api.Repository
import com.JPMC.a20210613_hemaladani_nycschools.api.RepositoryImpl
import com.JPMC.a20210613_hemaladani_nycschools.api.objects.School
import com.JPMC.a20210613_hemaladani_nycschools.api.objects.Score

class MainViewModel(val repository: Repository = RepositoryImpl()) : ViewModel() {

    fun getSchoolData():LiveData<List<School>>{
        return repository.fetchSchoolData()
    }
    fun getScoreData(dbn:String):LiveData<Score>{
        return repository.fetchScoreData(dbn)
    }
}