package com.example.mad_practical_7_22172012027

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class YouTube_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_you_tube)
    }
    fun intYoutubePlayer(){
        val youtubeId = "fJn9B64Znrk"
        val youtubeWebView = findViewById<WebView>(R.id.WebView)
        val webSettings: WebSettings = youtubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        youtubeWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")

    }
}