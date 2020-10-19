package com.gibsoncodes.moidscandroid

import android.graphics.drawable.Drawable
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("revenueFormatter")
fun bindRevenueFormatterToText(appCompatTextView:AppCompatTextView, revenue:Double){
    val finalString = "${revenue}M"
    appCompatTextView.text = finalString
}
@BindingAdapter("ratingFormatter")
fun bindRatingFormatterToText(appCompatTextView: AppCompatTextView, rating:Double){
    val ratingText = "$rating"
    appCompatTextView.text = ratingText
}
@BindingAdapter("loadThumbnail")
fun bindImageViewToThumbnail(appCompatImageView: AppCompatImageView, thumbnail:Drawable){
    Glide.with(appCompatImageView.context)
        .load(thumbnail)
        .into(appCompatImageView)
}