package com.blinky.learnletters

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.sight_sound_layout.*

class SightSoundActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sight_sound_layout)

        mediaPlayer = MediaPlayer.create(this, R.raw.letter_a)
        mediaPlayer?.setVolume(1f, 1f)
        mediaPlayer?.setOnPreparedListener {
            println("READY TO GO")
        }
    }


     fun clickedPlay(view: View){
         mediaPlayer?.start()
    }

}