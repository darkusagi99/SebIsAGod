package com.gmail.darkusagi99.sebisagod

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private var tts : TextToSpeech? = null
    private var ttsId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tts = TextToSpeech(applicationContext) { status ->
            if (status != TextToSpeech.ERROR) {
                setTextToSpeechLanguage()
            }
        }

        findViewById<Button>(R.id.SedBtn).setOnClickListener {
            tts!!.speak("Seb est un Dieu", TextToSpeech.QUEUE_FLUSH, null, ttsId.toString())
            ttsId++
        }

        findViewById<Button>(R.id.SatrBtn).setOnClickListener {
            tts!!.speak("Seb a toujours raison", TextToSpeech.QUEUE_FLUSH, null, ttsId.toString())
            ttsId++
        }

    }

    private fun setTextToSpeechLanguage() {
        val language: Locale = Locale.FRENCH
        val result  = tts?.setLanguage(language)
        // pitch voice to 100%
        tts?.setPitch(1F)
        if (result == TextToSpeech.LANG_MISSING_DATA) {
            Toast.makeText(this, "Missing language data", Toast.LENGTH_SHORT).show()
            return
        } else if (result == TextToSpeech.LANG_NOT_SUPPORTED) {
            Toast.makeText(this, "Language not supported", Toast.LENGTH_SHORT).show()
            return
        } else {
            Toast.makeText(this, "Langue FRANCAIS", Toast.LENGTH_SHORT).show()
            return
        }
    }

}