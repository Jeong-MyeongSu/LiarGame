package com.wjdaudtn.mini

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.wjdaudtn.mini.databinding.ActivityMainBinding
import com.wjdaudtn.mini.init.Companion.people

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 데이터베이스 초기화
        init.initializeDatabase(applicationContext)
        settingBinding()
    }
//    system navigation bar 안 보이게 하기
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
        if (v != null) {
            when (v.id) {
                R.id.btn_people_down -> {
                    if (people == 3) {
                        Toast.makeText(applicationContext, "최소 인원은 3명 입니다", Toast.LENGTH_SHORT).show()

                    } else {
                        people--
                        binding.peoplecount.text = people.toString()
                    }
                }

                R.id.btn_people_up -> {
                    if (people == 10) {
                        Toast.makeText(applicationContext, "최대 인원은 10명 입니다", Toast.LENGTH_SHORT).show()
                    } else {
                        people++
                        binding.peoplecount.text = people.toString()
                    }
                }

                R.id.btn_main_start -> {
                    val intent = Intent(this@MainActivity.baseContext, GenreActivity::class.java)
                    startActivity(intent)
                }

                R.id.btn_shut_down -> {
                    finish()
                }
            }
        }
    }

    private fun settingBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.peoplecount.text = people.toString()
        setContentView(binding.root)
        binding.btnPeopleDown.setOnClickListener(customOnClickListener)
        binding.btnPeopleUp.setOnClickListener(customOnClickListener)
        binding.btnMainStart.setOnClickListener(customOnClickListener)
        binding.btnShutDown.setOnClickListener(customOnClickListener)
    }
}