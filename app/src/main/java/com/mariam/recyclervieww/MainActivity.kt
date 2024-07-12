package com.mariam.recyclervieww

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myRecyclerView:RecyclerView = findViewById(R.id.mRecyclerView)
        var myArrayList  =ArrayList<Animals>()
        myArrayList.add(Animals("Bee","Bee makes honey",R.drawable.bee))
        myArrayList.add(Animals("Elephant","Did you know that elephants can swim ?",R.drawable.elephant))
        myArrayList.add(Animals("Ant","Ants very hardworking",R.drawable.ant))
        myArrayList.add(Animals("Camel","Camels are patient",R.drawable.camel))
        myArrayList.add(Animals("Owl","baby owls are very cute",R.drawable.owl))
        myArrayList.add(Animals("Crocodile","Crocodiles are very dangerous animals",R.drawable.crocodile))
        myArrayList.add(Animals("Bear","Bears are lazy animals",R.drawable.bear))
        myArrayList.add(Animals("Duks","Duks like to swim",R.drawable.duks))
        myArrayList.add(Animals("Goat","my brother plays with the goat",R.drawable.goat))
        myArrayList.add(Animals("Kangaroo","Kangaroos are run fast ",R.drawable.kangaroo))
        myArrayList.add(Animals("octopus","the Octopus can swim and walk",R.drawable.octopus))

        myRecyclerView.layoutManager= LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        val customAdapter = CustomAdapter(myArrayList)
        myRecyclerView.adapter=customAdapter


    }
}