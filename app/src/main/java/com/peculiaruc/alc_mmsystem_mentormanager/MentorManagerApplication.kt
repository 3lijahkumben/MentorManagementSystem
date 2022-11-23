package com.peculiaruc.alc_mmsystem_mentormanager

import android.app.Application
import android.content.Intent

class MentorManagerApplication : Application(){
    val  intent = Intent(this, SignUpActivity::class.java)
    override fun startActivity(intent: Intent?) {
        super.startActivity(intent)
    }
}