package com.gibsoncodes.moidscandroid

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gibsoncodes.moidscandroid.databinding.MovieItemsBinding

class MovieAdapter:ListAdapter<Movies, MovieAdapter.MoviesViewHolder>(Movies.diffUtil) {
    inner class MoviesViewHolder(val binding:MovieItemsBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(movies: Movies){
            binding.movies = movies
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding = DataBindingUtil.inflate<MovieItemsBinding>(LayoutInflater.from(parent.context),
        R.layout.movie_items, parent, false)
        return  MoviesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bind(currentList[position])
    }
}