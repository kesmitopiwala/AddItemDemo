package com.example.adddeleteitemdemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.adddeleteitemdemo.R
import com.example.adddeleteitemdemo.model.User
import kotlinx.android.synthetic.main.list_items.view.*

class ItemAdapter(val userList: ArrayList<User>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val list_layout=LayoutInflater.from(parent.context).inflate(R.layout.list_items,parent,false);
        return ViewHolder(list_layout);
    }

    override fun getItemCount(): Int {
       return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.userItems(userList[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun userItems(user: User)
        {
            val textview_name= itemView.findViewById<TextView>(R.id.Username)
            val textview_address=itemView.findViewById<TextView>(R.id.Address)
            val textview_mobilenum=itemView.findViewById<TextView>(R.id.Mobilenumber)


            textview_name.text=user.name
            textview_address.text=user.address
            textview_mobilenum.text=user.mobile_num

        }
    }

}