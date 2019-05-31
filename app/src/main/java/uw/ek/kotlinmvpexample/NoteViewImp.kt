package uw.ek.kotlinmvpexample

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.note_layout.view.*

class NoteViewImp(layoutInflater: LayoutInflater): NoteView, View.OnClickListener{
    private var mRootView = layoutInflater.inflate(R.layout.note_layout, null)
    var noteSavedListener : NoteView.NoteSavedListener? = null
    init {
        mRootView.save_btn.setOnClickListener(this)
    }


    override fun getRootView() = mRootView

    override fun setListener(listener: NoteView.NoteSavedListener) {
        noteSavedListener = listener
    }

    override fun onClick(v: View?) {
        val note = mRootView.note_edittext.text.toString()
        Log.i("debug", "Save Button Clicked")
        noteSavedListener?.onNoteSaved(note)
    }
}