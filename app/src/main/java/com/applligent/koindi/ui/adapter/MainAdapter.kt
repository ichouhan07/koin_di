package com.applligent.koindi.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.applligent.koindi.data.model.User
import com.applligent.koindi.databinding.ItemLayoutBinding
import com.bumptech.glide.Glide

class MainAdapter (val context: Context, private var arrayList: ArrayList<User>) : RecyclerView.Adapter<MainAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder = MyViewHolder(
        ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )
    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = arrayList[position]
        holder.binding.apply {
            try {
                this.textViewUserName.text = item.name
                this.textViewUserEmail.text = item.email
                Glide.with(context)
                    .load(item.avatar)
                    .into(this.imageViewAvatar)
            }catch (e :Exception){e.printStackTrace()}
        }

    }

    override fun getItemCount(): Int = arrayList.size
    fun addData(users: List<User>) {
        arrayList = users as ArrayList<User>
    }

    class MyViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)
}
