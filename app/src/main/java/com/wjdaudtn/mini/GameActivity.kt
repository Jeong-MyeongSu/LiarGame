package com.wjdaudtn.mini

import android.app.Activity
import android.content.Context
import android.media.AudioManager
import android.media.ToneGenerator
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import android.util.Log
import android.view.SoundEffectConstants
import android.view.View
import android.widget.ImageView
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.wjdaudtn.mini.init.Companion.checkNum
import com.wjdaudtn.mini.init.Companion.people
import com.wjdaudtn.mini.init.Companion.count
import com.wjdaudtn.mini.databinding.ActivityGameBinding
import kotlin.random.Random

class GameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGameBinding
    private var isPassFragmentVisible: Boolean = true
    private var randomValue: Int = 0
    private lateinit var keyword: String
    private lateinit var mVibrator: Vibrator
    private lateinit var mToneGenerator: ToneGenerator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        randomValue = Random.nextInt(1, people+1)
        keyword = getRandomKeyword(checkNum)
        Log.d("randomValue", "$randomValue")
        Log.d("keyword", keyword)

        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showPassFragment()

        binding.fragmentContainer.setOnClickListener(customOnClickListener)

        onBackPressedDispatcher.addCallback(this, onBackPressedCallback)
    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            window.decorView.systemUiVisibility = (
                    View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                            or View.SYSTEM_UI_FLAG_FULLSCREEN
                            or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    )
        }
    }

    private val customOnClickListener: View.OnClickListener = View.OnClickListener { v ->
        when (v.id) {
            R.id.fragmentContainer -> {
                if (count < people) {
                    switchScreen()
                } else if (count == people) {
                    showLastFragment()
                    count++
                    Log.d("count","$count")
                } else {
                    // 라이어가 몇번째 사람 인지 보여 주고 라이어가 맞추는 시간 주고 그리고 게임을 다시 시작 할지 물어 보는 Fragment
                }
            }
        }
    }

    private fun showPassFragment() {
        val passFragment = PassFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, passFragment)
            .commit()
    }

    private fun showPartFragment() {
        val partFragment = PartFragment.newInstance(count, randomValue, keyword)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, partFragment)
            .commit()
    }

    private fun showLastFragment() {
        val lastFragment = LastFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, lastFragment)
            .commit()
    }

    private fun switchScreen() {
        if (isPassFragmentVisible) {
            count++
            showPartFragment()
            Log.d("count", "$count")
        } else {
            showPassFragment()
        }
        isPassFragmentVisible = !isPassFragmentVisible
    }

    private fun getRandomKeyword(checkNum: Int): String {
        return when (checkNum) {
            1 -> init.mFBDataDao.getDataAll().random().word
            2 -> init.mFB2DataDao.getDataAll().random().word
            3 -> init.mSingerDataDao.getDataAll().random().word
            4 -> init.mStuffDataDao.getDataAll().random().word
            5 -> init.mActorDataDao.getDataAll().random().word
            6 -> init.mPlaceDataDao.getDataAll().random().word
            7 -> init.mAnimalDataDao.getDataAll().random().word
            8 -> init.mFamousDataDao.getDataAll().random().word
            9 -> init.mOldDataDao.getDataAll().random().word
            10 -> init.mManagerDataDao.getDataAll().random().word
            11 -> init.mSportsDataDao.getDataAll().random().word
            12 -> init.mFreeDataDao.getDataAll().random().word
            else -> "키워드 없음"
        }
    }

    private fun getVibrateManger(): Vibrator{
        val vibrator  = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val vibratorManager =  this.getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager
            vibratorManager.defaultVibrator;
        } else {
            getSystemService(VIBRATOR_SERVICE) as Vibrator
        }
        return vibrator
    }

    private val onBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            Log.d("onBackPressedCallback","뒤로가기")
            setResult(Activity.RESULT_OK, intent)
            count = 0
            checkNum = 0
            mVibrator = getVibrateManger()
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                mVibrator.vibrate(
                    VibrationEffect.createOneShot(
                        100_0,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                mVibrator.vibrate(100_0)
            }
            // 소리 재생을 위한 AudioManager 확인
            val audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
            val volume = audioManager.getStreamVolume(AudioManager.STREAM_NOTIFICATION)

            // 소리가 들리지 않으면 볼륨을 확인하여 조정
            if (volume == 0) {
                audioManager.setStreamVolume(
                    AudioManager.STREAM_NOTIFICATION,
                    audioManager.getStreamMaxVolume(AudioManager.STREAM_NOTIFICATION),
                    0
                )
            }
            mToneGenerator = ToneGenerator(AudioManager.STREAM_NOTIFICATION, 100)
            mToneGenerator.startTone(ToneGenerator.TONE_PROP_BEEP, 200)
            finish()
        }
    }
}