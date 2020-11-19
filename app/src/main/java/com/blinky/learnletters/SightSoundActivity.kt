package com.blinky.learnletters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SightSoundActivity : AppCompatActivity() {

    Button playButton = (Button) this.findViewById(R.id.playBtn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sight_sound_layout)
    }
}