package com.ironelder.movielistapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MovieListAdapter : RecyclerView.Adapter<MovieListAdapter.MovieListItem>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListItem {
        return MovieListItem(LayoutInflater.from(parent.context).inflate(R.layout.item_movie_list, parent, false))
    }

    override fun getItemCount(): Int {
        return 0
    }

    override fun onBindViewHolder(holder: MovieListItem, position: Int) {
//        TODO("Not yet implemented")
    }

    class MovieListItem(view: View) : RecyclerView.ViewHolder(view){

    }
}