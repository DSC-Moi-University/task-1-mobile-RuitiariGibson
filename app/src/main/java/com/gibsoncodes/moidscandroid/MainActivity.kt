package com.gibsoncodes.moidscandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.gibsoncodes.moidscandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val appViewModel:MoviesViewModel by viewModels()
    private val moviesAdapter:MovieAdapter by lazy { MovieAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this@MainActivity,
        R.layout.activity_main)

        binding.apply {
            lifecycleOwner=this@MainActivity
            viewModel = appViewModel
            adapter=moviesAdapter
            this.moveRecyclerView.apply{
                val layoutManager = LinearLayoutManager(this@MainActivity)
                layoutManager.orientation = LinearLayoutManager.VERTICAL
                this.layoutManager = layoutManager
            }
        }
        val drawable = ResourcesCompat.getDrawable(resources, R.drawable.test_pic_1, null)
        Glide.with(this@MainActivity)
            .load(drawable)
            .into(binding.mainImage)
    }
}