package com.example.mini_pro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class machine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_machine)
        val ktwebview = findViewById<WebView>(R.id.machine)
        openweb(ktwebview)
    }

    private fun openweb(ktwebview: WebView) {
        ktwebview.webViewClient = WebViewClient()
        ktwebview.apply {
            loadUrl("https://scikit-learn.org/stable/")
        }
    }
}