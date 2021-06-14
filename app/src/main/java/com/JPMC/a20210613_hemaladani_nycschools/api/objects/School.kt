package com.JPMC.a20210613_hemaladani_nycschools.api.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable

data class School(

    @SerializedName("dbn")
    @Expose
    val dbn:String,
    @SerializedName("school_name")
    @Expose
    val schoolName:String,
    @SerializedName("boro")
    @Expose
    val boro:String,
    @SerializedName("overview_paragraph")
    @Expose
    val overviewParagraph:String,
    @SerializedName("school_10th_seats")
    @Expose
    val school10thSeats:String,
    @SerializedName("academicopportunities1")
    @Expose
    val academicopportunities1:String,
    @SerializedName("academicopportunities2")
    @Expose
    val academicopportunities2:String,
    @SerializedName("ell_programs")
    @Expose
    val ellPrograms:String,
    @SerializedName("neighborhood")
    @Expose
    val neighborhood:String,
    @SerializedName("building_code")
    @Expose
    val buildingCode:String,
    @SerializedName("location")
    @Expose
    val location:String,
    @SerializedName("phone_number")
    @Expose
    val phoneNumber:String,
    @SerializedName("fax_number")
    @Expose
    val faxNumber:String,
    @SerializedName("school_email")
    @Expose
    val schoolEmail:String,
    @SerializedName("website")
    @Expose
    val website:String,
    @SerializedName("subway")
    @Expose
    val subway:String,
    @SerializedName("bus")
    @Expose
    val bus:String,
    @SerializedName("grades2018")
    @Expose
    val grades2018:String,
    @SerializedName("finalgrades")
    @Expose
    val finalgrades:String,
    @SerializedName("total_students")
    @Expose
    val totalStudents:String,
    @SerializedName("extracurricular_activities")
    @Expose
    val extracurricularActivities:String,
    @SerializedName("school_sports")
    @Expose
    val schoolSports:String,
    @SerializedName("attendance_rate")
    @Expose
    val attendanceRate:String,
    @SerializedName("pct_stu_enough_variety")
    @Expose
    val pctStuEnoughVariety:String,
    @SerializedName("pct_stu_safe")
    @Expose
    val pctStuSafe:String,
    @SerializedName("school_accessibility_description")
    @Expose
    val schoolAccessibilityDescription:String,
    @SerializedName("directions1")
    @Expose
    val directions1:String,
    @SerializedName("requirement1_1")
    @Expose
    val requirement11:String,
    @SerializedName("requirement2_1")
    @Expose
    val requirement21:String,
    @SerializedName("requirement3_1")
    @Expose
    val requirement31:String,
    @SerializedName("requirement4_1")
    @Expose
    val requirement41:String,
    @SerializedName("requirement5_1")
    @Expose
    val requirement51:String,
    @SerializedName("offer_rate1")
    @Expose
    val offerRate1:String,
    @SerializedName("program1")
    @Expose
    val program1:String,
    @SerializedName("code1")
    @Expose
    val code1:String,
    @SerializedName("interest1")
    @Expose
    val interest1:String,
    @SerializedName("method1")
    @Expose
    val method1:String,
    @SerializedName("seats9ge1")
    @Expose
    val seats9ge1:String,
    @SerializedName("grade9gefilledflag1")
    @Expose
    val grade9gefilledflag1:String,
    @SerializedName("grade9geapplicants1")
    @Expose
    val grade9geapplicants1:String,
    @SerializedName("seats9swd1")
    @Expose
    val seats9swd1:String,
    @SerializedName("grade9swdfilledflag1")
    @Expose
    val grade9swdfilledflag1:String,
    @SerializedName("grade9swdapplicants1")
    @Expose
    val grade9swdapplicants1:String,
    @SerializedName("seats101")
    @Expose
    val seats101:String,
    @SerializedName("admissionspriority11")
    @Expose
    val admissionspriority11:String,
    @SerializedName("admissionspriority21")
    @Expose
    val admissionspriority21:String,
    @SerializedName("admissionspriority31")
    @Expose
    val admissionspriority31:String,
    @SerializedName("grade9geapplicantsperseat1")
    @Expose
    val grade9geapplicantsperseat1:String,
    @SerializedName("grade9swdapplicantsperseat1")
    @Expose
    val grade9swdapplicantsperseat1:String,
    @SerializedName("primary_address_line_1")
    @Expose
    val primaryAddressLine1:String,
    @SerializedName("city")
    @Expose
    val city:String,
    @SerializedName("zip")
    @Expose
    val zip:String,
    @SerializedName("state_code")
    @Expose
    val stateCode:String,
    @SerializedName("latitude")
    @Expose
    val latitude:String,
    @SerializedName("longitude")
    @Expose
    val longitude:String,
    @SerializedName("community_board")
    @Expose
    val communityBoard:String,
    @SerializedName("council_district")
    @Expose
    val councilDistrict:String,
    @SerializedName("census_tract")
    @Expose
    val censusTract:String,
    @SerializedName("bin")
    @Expose
    val bin:String,
    @SerializedName("bbl")
    @Expose
    val bbl:String,
    @SerializedName("nta")
    @Expose
    val nta:String,
    @SerializedName("borough")
    @Expose
    val borough:String
)