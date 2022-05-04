package com.example.myapplication

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings

/*
Это Сервис одним из главных плюсов сервисов является независимость от представления
сервисы часто используются например в медиаплеерах
конкретно этот сервис проигрывает рингтон
 */
class MyService : Service() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)
        mediaPlayer.isLooping = true
        mediaPlayer.start()
        return START_STICKY
    }

    override fun onDestroy() {
        mediaPlayer.stop()
    }
}