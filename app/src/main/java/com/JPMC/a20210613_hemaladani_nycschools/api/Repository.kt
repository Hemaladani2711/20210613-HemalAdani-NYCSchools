package com.JPMC.a20210613_hemaladani_nycschools.api

import androidx.lifecycle.LiveData
import com.JPMC.a20210613_hemaladani_nycschools.api.objects.School
import com.JPMC.a20210613_hemaladani_nycschools.api.objects.Score

interface Repository {
    fun fetchSchoolData():LiveData<List<School>>
    fun fetchScoreData(dbn:String):LiveData<Score>
}