package com.mariam.recyclervieww

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CustomAdapter(var myList:ArrayList<Animals>) :RecyclerView.Adapter<CustomAdapter.ViewHolder> (){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val v=  LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       var infoAnimal= myList[position]
        holder.animalName.text=  infoAnimal.animalName
        holder.animalDesc.text= infoAnimal.animalDescription
        holder.animalImage.setImageResource(infoAnimal.animalImage)
    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val animalName= itemView.findViewById(R.id.name) as TextView
    val animalDesc=itemView.findViewById(R.id.desc) as TextView
     val animalImage=itemView.findViewById(R.id.image)  as CircleImageView
    }
}