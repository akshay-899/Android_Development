package com.example.mini_pro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class kot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kot)
        supportActionBar?.hide()
        val ktwebview=findViewById<WebView>(R.id.kwebview)
        openweb(ktwebview)

    }
    private fun openweb(ktwebview:WebView){
        ktwebview.webViewClient=WebViewClient()
        ktwebview.apply {
            loadUrl("https://developer.android.com/kotlin/campaign/learn")
        }
    }
}