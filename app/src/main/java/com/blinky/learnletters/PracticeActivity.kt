package com.blinky.learnletters

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.practice_layout.*
import java.util.*

import android.widget.RelativeLayout

class PracticeActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null

    var letter_index = 0
    var case_selected = "lower"

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

    var upper_image_list = arrayListOf(
        R.drawable.upper_a,
        R.drawable.upper_b,
        R.drawable.upper_c,
        R.drawable.upper_d,
        R.drawable.upper_e,
        R.drawable.upper_f,
        R.drawable.upper_g,
        R.drawable.upper_h,
        R.drawable.upper_i,
        R.drawable.upper_j,
        R.drawable.upper_k,
        R.drawable.upper_l,
        R.drawable.upper_m,
        R.drawable.upper_n,
        R.drawable.upper_o,
        R.drawable.upper_p,
        R.drawable.upper_q,
        R.drawable.upper_r,
        R.drawable.upper_s,
        R.drawable.upper_t,
        R.drawable.upper_u,
        R.drawable.upper_v,
        R.drawable.upper_w,
        R.drawable.upper_x,
        R.drawable.upper_y,
        R.drawable.upper_z
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
        return random.nextInt(lower_image_list.count())
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.practice_layout)
        resizeImageView()
        mediaPlayer = MediaPlayer.create(this, R.raw.a)
        mediaPlayer?.setVolume(1f, 1f)
        mediaPlayer?.setOnPreparedListener {
            println("READY TO GO")
        }
    }

    fun upperArrowClicked(view: View){
        case_selected = "upper"
        resizeImageView()
    }

    fun lowerArrowClicked(view: View){
        case_selected = "lower"
        resizeImageView()
    }

     fun clickedPlay(view: View){
         mediaPlayer?.start()
    }

    fun practiceNextClicked(view: View){
        letter_index = makeLetterIndex()
        if (case_selected == "lower"){
            letterImageView.setImageResource(lower_image_list[letter_index])

        }
        else{
            letterImageView.setImageResource(upper_image_list[letter_index])
            resizeImageView()
        }
        mediaPlayer = MediaPlayer.create(this, sound_list[letter_index])
        mediaPlayer?.setVolume(1f, 1f)
        mediaPlayer?.setOnPreparedListener {
            println("READY TO GO")
        }
    }

    fun resizeImageView(){
        if (case_selected == "upper") {
            letterImageView.requestLayout()
            letterImageView.setImageResource(upper_image_list[letter_index])
            letterImageView.getLayoutParams().height = 1200
            letterImageView.getLayoutParams().width = 1200
            letterImageView.setScaleType(letterImageView.scaleType)
            letterImageView.setImageResource(upper_image_list[letter_index])

        }
        else {
            letterImageView.requestLayout()
            letterImageView.setImageResource(upper_image_list[letter_index])
            letterImageView.getLayoutParams().height = 800
            letterImageView.getLayoutParams().width = 800
            letterImageView.setScaleType(letterImageView.scaleType)
            letterImageView.setImageResource(lower_image_list[letter_index])
        }
    }

    fun practiceBackClicked(view: View){
        println("Need to go to home screen")
    }

    }

    fun practiceBackClicked(view: View) {}

