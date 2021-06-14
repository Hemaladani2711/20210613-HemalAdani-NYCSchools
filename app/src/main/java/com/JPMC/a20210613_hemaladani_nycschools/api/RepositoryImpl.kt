package com.JPMC.a20210613_hemaladani_nycschools.api

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.JPMC.a20210613_hemaladani_nycschools.api.objects.School
import com.JPMC.a20210613_hemaladani_nycschools.api.objects.Score
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryImpl: Repository {
    companion object{
        val TAG= RepositoryImpl::class.simpleName
    }
    override fun fetchSchoolData(): LiveData<List<School>> {
        val data=MutableLiveData<List<School>>()
        val api: RetrofitApi = RetrofitApi.create()
        val call: Call<List<School>> = api.getSchoolsData()
        call.enqueue(object : Callback<List<School>?> {
            override fun onResponse(
                call: Call<List<School>?>,
                response: Response<List<School>?>
            ) {
                Log.d(TAG,"Data Recd")
                data.value=response.body()
            }

            override fun onFailure(call: Call<List<School>?>, t: Throwable) {
                Log.d(TAG,"some error")
                //todo: handle error case
                //data.value=null
            }


        })

        return data
    }

    override fun fetchScoreData(dbn:String): LiveData<Score> {
        val data = MutableLiveData<Score>()
        val api: RetrofitApi = RetrofitApi.create()
        val call:Call<List<Score>> = api.getScoreData(dbn)
        call.enqueue(object :Callback<List<Score>?>{
            override fun onResponse(call: Call<List<Score>?>, response: Response<List<Score>?>) {
                val scores=response.body()
                scores?.let{
                    if(scores.size>0){
                        data.value=it[0]
                    }

                }
            }

            override fun onFailure(call: Call<List<Score>?>, t: Throwable) {

            }


        })
        return data
    }
}