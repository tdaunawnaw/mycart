package com.example.mycart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mycart.adapter.CardAdapter
import com.example.mycart.model.cart

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView=findViewById(R.id.mycart_recycler)

        val cartArray=ArrayList<cart>()
        cartArray.add(cart("Fine Grain Sugar",R.drawable.sugar,20,1) )
        cartArray.add(cart("Peanuts",R.drawable.peanuts,2,20))
        cartArray.add(cart("Dawat Rice",R.drawable.pomegranate,80,3))

        val cardAdapter=CardAdapter(cartArray)

        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=cardAdapter
    }
}
