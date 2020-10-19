package com.gibsoncodes.moidscandroid

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("rvAdapter")
fun bindAdapter(rv:RecyclerView, adapter:RecyclerView.Adapter<*>){
    rv.adapter=adapter
}

@BindingAdapter("moviesList")
fun bindMoviesList(rv:RecyclerView, list:List<Movies>?){
    list?.let{
        (rv.adapter as MovieAdapter).submitList(it)
    }
}