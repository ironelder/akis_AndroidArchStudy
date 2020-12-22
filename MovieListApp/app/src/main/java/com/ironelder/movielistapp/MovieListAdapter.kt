package com.ironelder.movielistapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ironelder.movielistapp.databinding.ItemMovieListBinding

class MovieListAdapter : RecyclerView.Adapter<MovieListAdapter.MovieListItem>() {
    private val movieList = arrayListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListItem {
        return MovieListItem(
            ItemMovieListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieListItem, position: Int) {
        holder.setData(movieList[position])
    }

    fun setData(data:List<String>){
        movieList.clear()
        movieList.addAll(data)
        notifyDataSetChanged()
    }

    class MovieListItem(private val binding: ItemMovieListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun setData(title: String) {
            binding.tvMovieTitle.text = title
        }
    }
}