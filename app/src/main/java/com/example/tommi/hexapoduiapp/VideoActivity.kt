package com.example.tommi.hexapoduiapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_data.*
import android.widget.VideoView



class VideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        val videoView = findViewById(R.id.robotVideoView) as VideoView
        //MediaController mediaController = new MediaController(this);
        // mediaController.setAnchorView(videoView);
        //videoView.setMediaController(mediaController);

        videoView.setVideoPath("https://www.ebookfrenzy.com/android_book/movie.mp4")

        videoView.start()
    }
}
