package com.nandroidex.emailhelperdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nandroidex.emailhelper.EmailIntentBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EmailIntentBuilder.from(this@MainActivity)
                .to("dev.nae.me@gmail.com")
                .subject("subject")
                .body("message")
                .start()
    }
}