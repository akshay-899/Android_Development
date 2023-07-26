package com.example.mini_pro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class web3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web3)
        val web3=findViewById<WebView>(R.id.web3)
        openweb(web3)
    }
    private fun openweb(tech:WebView){
        tech.webViewClient= WebViewClient()
        tech.apply {
            settings.javaScriptEnabled
            settings.supportMultipleWindows()
            loadUrl("https://learnweb3.io/")
        }
    }
}