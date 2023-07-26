package com.example.mini_pro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class block : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_block)
        val block=findViewById<WebView>(R.id.block)
        openweb(block)
    }
    private fun openweb(chain:WebView){
        chain.webViewClient=WebViewClient()
        chain.apply {
            settings.javaScriptEnabled
            settings.supportMultipleWindows()
            loadUrl("https://soliditylang.org/")
        }
    }
}