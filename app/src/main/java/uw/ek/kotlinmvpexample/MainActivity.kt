package uw.ek.kotlinmvpexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity(), NoteView.NoteSavedListener {

    private lateinit var mNoteView: NoteView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mNoteView = NoteViewImp(layoutInflater)
        setContentView(mNoteView.getRootView())
        mNoteView.setListener(this)

    }

    override fun onNoteSaved(note: String) {
        Log.i("debug", "Saving note: $note")
        // Save your note here
        // Use content providers, room persistence libraries, whatever you wanna
        // 	do with this note, do it. The implementation doesn't matter to your
        // View and Controller

    }
}
