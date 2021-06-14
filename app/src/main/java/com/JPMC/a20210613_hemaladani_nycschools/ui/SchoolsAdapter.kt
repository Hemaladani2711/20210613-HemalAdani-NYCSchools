package com.JPMC.a20210613_hemaladani_nycschools.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.JPMC.a20210613_hemaladani_nycschools.R
import com.JPMC.a20210613_hemaladani_nycschools.api.objects.School

class SchoolsAdapter(val items:List<School>):RecyclerView.Adapter<SchoolsAdapter.ViewHolder>() {

    lateinit var schoolsClickListener: SchoolsClickListener
    interface SchoolsClickListener{
        fun clickListener(view:View?,position:Int)
    }
    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView),View.OnClickListener{
        val txtSchoolsName:TextView
        val txtSchoolsAddress:TextView
        init {
            txtSchoolsName=itemView.findViewById(R.id.txt_school_name)
            txtSchoolsAddress=itemView.findViewById(R.id.txt_school_address)
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            schoolsClickListener.clickListener(v,this.layoutPosition)
        }

    }
    fun setListener(schoolsClickListener: SchoolsClickListener){
        this.schoolsClickListener=schoolsClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val school=items[position]
        holder.txtSchoolsName.text=school.schoolName
        holder.txtSchoolsAddress.text=getSchoolAddress(school)
    }

    /**
     * this function takes school object and
     * returns school address.
     * @param: School object
     * */
    fun getSchoolAddress(school: School):String{
        var address=school.primaryAddressLine1+school.city+"-"+school.zip+school.stateCode
        return address
    }

    override fun getItemCount(): Int = items.size
}