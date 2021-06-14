package com.JPMC.a20210613_hemaladani_nycschools.api.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

data class Score (

    @SerializedName("dbn")
    @Expose
    val dbn:String,
    @SerializedName("school_name")
    @Expose
    val schoolName:String,
    @SerializedName("num_of_sat_test_takers")
    @Expose
    val numOfSatTestTakers:String,
    @SerializedName("sat_critical_reading_avg_score")
    @Expose
    val satCriticalReadingAvgScore:String,
    @SerializedName("sat_math_avg_score")
    @Expose
    val satMathAvgScore:String,
    @SerializedName("sat_writing_avg_score")
    @Expose
    val satWritingAvgScore:String
    )
