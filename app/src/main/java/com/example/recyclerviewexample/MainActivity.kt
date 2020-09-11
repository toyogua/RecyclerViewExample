package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = MainAdapter(this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        val dummylist = mutableListOf<Usuario>()
        dummylist.add(Usuario("https://i.picsum.photos/id/694/200/300.jpg?hmac=fAbYLUWtofDk7qWl4qOA_p9o2oSC3vylIK8clCV-ttk",
        "Jose Ramirez", "Developer"))

        dummylist.add(Usuario("https://i.picsum.photos/id/866/200/300.jpg?hmac=rcadCENKh4rD6MAp6V_ma-AyWv641M4iiOpe1RyFHeI",
                "Jose Ramirez", "Developer"))

        adapter.setListData(dummylist)
        adapter.notifyDataSetChanged()
    }
}
