package com.example.david.kotlinchuck.findJoke

import com.example.david.kotlinchuck.findJoke.event.FindJokeEvent

/**
 * Created by david on 28/6/17.
 */
interface FindJokePresenter {
    fun onCreate()
    fun onDestroy()
    fun findJoke(name: String, lastname: String)

    fun onEventMainThread(event: FindJokeEvent)
}