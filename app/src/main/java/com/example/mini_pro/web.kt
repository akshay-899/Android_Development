package com.example.mini_pro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class web : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        val web=findViewById<WebView>(R.id.web)
        openweb(web)
    }
    private fun openweb(website:WebView){
        website.webViewClient=WebViewClient()
        website.apply {
            loadUrl("https://www.freecodecamp.org/news/learn-web-development-for-free/")
        }
    }
}