package com.ironelder.movielistapp

import androidx.fragment.app.Fragment

class MovieListFragment : Fragment(R.layout.fragment_movie_list) {
    private val authKey = "e17c2715face752d9ed1a2a0054aa7d6"
    private val baseUrl = "https://api.themoviedb.org/3/"
    private val testUrl = "https://api.themoviedb.org/3/movie/popular?api_key=e17c2715face752d9ed1a2a0054aa7d6"
}