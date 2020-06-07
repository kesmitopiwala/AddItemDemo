package com.example.adddeleteitemdemo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.adddeleteitemdemo.R
import com.example.adddeleteitemdemo.adapter.ItemAdapter
import com.example.adddeleteitemdemo.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView=findViewById<RecyclerView>(R.id.recylerview_items)
        recyclerView.layoutManager=LinearLayoutManager(this)
         val users=ArrayList<User>()
        users.add(User("Kiran Patel","Mumbai,Maharashtra","9567893450"))
        users.add(User("Rucha Mehta","Indore,MadhyaPradesh","9980567089"))
        users.add(User("Ami Vora","Chennai,Tamilnadu","9994499807"))
        users.add(User("Mehul Rana","Jaipur,Rajasthan","9345690340"))
        users.add(User("Mit Shah","Udaipur,Rajasthan","9366690340"))
        users.add(User("Mina Patel","Bhopa,MadhyaPradesh","9289690999"))
        users.add(User("Riya Roy","Ahmedabad,Gujarat","9995690000"))
        users.add(User("Jyoti Mehta","Surat,Gujarat ","9625690570"))
        users.add(User("Maitri Shah","Agra,Uttarpradesh","9744552240"))
        users.add(User("Kesar Tank","Vadodara,Gujarat","9445690840"))
        users.add(User("Tanvi Patel","Mathura,Uttarpradesh","9249603040"))
        users.add(User("Krishna Shah","Jaipur,Rajasthan","9017272313"))

        val itemadapter=ItemAdapter(users)

        recyclerView.adapter=itemadapter
    }
}
