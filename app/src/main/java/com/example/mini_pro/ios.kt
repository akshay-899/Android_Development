package com.example.mini_pro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class ios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ios)
        val ktwebview=findViewById<WebView>(R.id.iosview)
        openweb(ktwebview)
    }

    private fun openweb(ktwebview: WebView) {
            ktwebview.webViewClient= WebViewClient()
            ktwebview.apply {
                loadUrl("https://developer.apple.com/develop/")
            }
    }
}