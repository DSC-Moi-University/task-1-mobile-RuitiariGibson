package com.gibsoncodes.moidscandroid

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import androidx.recyclerview.widget.DiffUtil

data class Movies (val movieName:String, val movieThumbnail:Drawable,
val movieRatings:Double, val movieRevenue:Double) {
    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Movies>() {
            override fun areContentsTheSame(oldItem: Movies, newItem: Movies): Boolean =
                oldItem.movieName == newItem.movieName

            override fun areItemsTheSame(oldItem: Movies, newItem: Movies): Boolean =
                oldItem == newItem
        }
    }
}