package com.blinky.learnletters

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.practice_layout.*
import java.util.*

class PracticeActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null

    var letter_index = 1

    var lower_image_list = arrayListOf(
        R.drawable.lower_a,
        R.drawable.lower_b,
        R.drawable.lower_c,
        R.drawable.lower_d,
        R.drawable.lower_e,
        R.drawable.lower_f,
        R.drawable.lower_g,
        R.drawable.lower_h,
        R.drawable.lower_i,
        R.drawable.lower_j,
        R.drawable.lower_k,
        R.drawable.lower_l,
        R.drawable.lower_m,
        R.drawable.lower_n,
        R.drawable.lower_o,
        R.drawable.lower_p,
        R.drawable.lower_q,
        R.drawable.lower_r,
        R.drawable.lower_s,
        R.drawable.lower_t,
        R.drawable.lower_u,
        R.drawable.lower_v,
        R.drawable.lower_w,
        R.drawable.lower_x,
        R.drawable.lower_y,
        R.drawable.lower_z
    )

    var sound_list = arrayListOf(
        R.raw.a,
        R.raw.b,
        R.raw.c,
        R.raw.d,
        R.raw.e,
        R.raw.f,
        R.raw.g,
        R.raw.h,
        R.raw.i,
        R.raw.j,
        R.raw.k,
        R.raw.l,
        R.raw.m,
        R.raw.n,
        R.raw.o,
        R.raw.p,
        R.raw.q,
        R.raw.r,
        R.raw.s,
        R.raw.t,
        R.raw.u,
        R.raw.v,
        R.raw.w,
        R.raw.x,
        R.raw.y,
        R.raw.z
    )

    fun makeLetterIndex():Int {
        val random = Random()
        val letterIndex = random.nextInt(lower_image_list.count())
        return letterIndex
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.practice_layout)

        mediaPlayer = MediaPlayer.create(this, R.raw.a)
        mediaPlayer?.setVolume(1f, 1f)
        mediaPlayer?.setOnPreparedListener {
            println("READY TO GO")
        }
    }


     fun clickedPlay(view: View){
         mediaPlayer?.start()
    }

    fun practiceNextClicked(view: View){
        var letterIndex = makeLetterIndex()
        letterImageView.setImageResource(lower_image_list[letterIndex])
        mediaPlayer = MediaPlayer.create(this, sound_list[letterIndex])
        mediaPlayer?.setVolume(1f, 1f)
        mediaPlayer?.setOnPreparedListener {
            println("READY TO GO")
        }

    fun practiceBackClicked(view: View){
        println("Need to go to home screen")
    }

    }

    fun practiceBackClicked(view: View) {}

}