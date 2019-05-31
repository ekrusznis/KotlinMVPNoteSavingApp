package uw.ek.kotlinmvpexample

import android.view.View

interface NoteView{

    fun getRootView() : View

    interface NoteSavedListener{
        fun onNoteSaved(note: String)
    }
    fun setListener(listener: NoteSavedListener)
}