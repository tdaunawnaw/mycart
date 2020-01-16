package com.example.mycart.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mycart.R
import com.example.mycart.model.cart
import kotlinx.android.synthetic.main.mycartitem.view.*

class CardViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
    var cartimage=ItemView.findViewById<ImageView>(R.id.sugar)
    var txtsugar=ItemView.findViewById<TextView>(R.id.grainsugar)
    var btnminus=ItemView.findViewById<Button>(R.id.minus)
    var btnplus=ItemView.findViewById<Button>(R.id.plus)
    var price=ItemView.findViewById<TextView>(R.id.price)
    var result=ItemView.findViewById<TextView>(R.id.kilogram)
}

class CardAdapter(val cardList: ArrayList<cart>):RecyclerView.Adapter<CardViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.mycartitem,parent,false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.cartimage.setImageResource(cardList[position].image)
        holder.txtsugar.text=cardList[position].name.toString()
        holder.price.text="Price: $" +cardList[position].price.toString()
        holder.result.text=cardList[position].kilo.toString()

        holder.btnminus.setOnClickListener {
            var count:Int = holder.result.text.toString().toInt()
            count --
            holder.result.text = count.toString()
        }

        holder.btnplus.setOnClickListener {
            var countplus:Int=holder.result.text.toString().toInt()
            countplus++
            holder.result.text=countplus.toString()
        }
    }

}

