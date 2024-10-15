package com.wjdaudtn.mini

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.wjdaudtn.mini.init.Companion.checkNum
import com.wjdaudtn.mini.databinding.ActivityGenreBinding

class GenreActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGenreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        settingBinding()
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

    private val customOnClickListener: OnClickListener = OnClickListener { v ->
        when (v.id) {
            R.id.btn_genre1 -> {
                checkNum = checkRadio(1, checkNum)
            }

            R.id.btn_genre2 -> {
                checkNum = checkRadio(2, checkNum)
            }

            R.id.btn_genre3 -> {
                checkNum = checkRadio(3, checkNum)
            }

            R.id.btn_genre4 -> {
                checkNum = checkRadio(4, checkNum)
            }

            R.id.btn_genre5 -> {
                checkNum = checkRadio(5, checkNum)
            }

            R.id.btn_genre6 -> {
                checkNum = checkRadio(6, checkNum)
            }

            R.id.btn_genre7 -> {
                checkNum = checkRadio(7, checkNum)
            }

            R.id.btn_genre8 -> {
                checkNum = checkRadio(8, checkNum)
            }

            R.id.btn_genre9 -> {
                checkNum = checkRadio(9, checkNum)
            }

            R.id.btn_genre10 -> {
                checkNum = checkRadio(10, checkNum)
            }

            R.id.btn_genre11 -> {
                checkNum = checkRadio(11, checkNum)
            }

            R.id.btn_genre12 -> {
                checkNum = checkRadio(12, checkNum)
            }

            R.id.btn_genre_start -> {
                if(checkNum == 0){
                    Toast.makeText(applicationContext,"장르를 선택 하세요", Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(this@GenreActivity, GameActivity::class.java)
                    startActivity(intent)
                    finish()
                }

            }
            R.id.btn_back -> {
                onBackPressedDispatcher.onBackPressed()
            }
        }
    }

    private fun checkRadio(num: Int, previous: Int): Int {
        when (num) {
            1 -> {
                binding.btnGenre1.setBackgroundColor(Color.parseColor("#0A122A"))
            }

            2 -> {
                binding.btnGenre2.setBackgroundColor(Color.parseColor("#0A122A"))
            }

            3 -> {
                binding.btnGenre3.setBackgroundColor(Color.parseColor("#0A122A"))
            }

            4 -> {
                binding.btnGenre4.setBackgroundColor(Color.parseColor("#0A122A"))
            }

            5 -> {
                binding.btnGenre5.setBackgroundColor(Color.parseColor("#0A122A"))
            }

            6 -> {
                binding.btnGenre6.setBackgroundColor(Color.parseColor("#0A122A"))
            }

            7 -> {
                binding.btnGenre7.setBackgroundColor(Color.parseColor("#0A122A"))
            }

            8 -> {
                binding.btnGenre8.setBackgroundColor(Color.parseColor("#0A122A"))
            }

            9 -> {
                binding.btnGenre9.setBackgroundColor(Color.parseColor("#0A122A"))
            }

            10 -> {
                binding.btnGenre10.setBackgroundColor(Color.parseColor("#0A122A"))
            }

            11 -> {
                binding.btnGenre11.setBackgroundColor(Color.parseColor("#0A122A"))
            }

            12 -> {
                binding.btnGenre12.setBackgroundColor(Color.parseColor("#0A122A"))
            }

        }
        when (previous) {
            1 -> {
                binding.btnGenre1.setBackgroundColor(Color.parseColor("#0B615E"))
            }

            2 -> {
                binding.btnGenre2.setBackgroundColor(Color.parseColor("#0B615E"))
            }

            3 -> {
                binding.btnGenre3.setBackgroundColor(Color.parseColor("#0B615E"))
            }

            4 -> {
                binding.btnGenre4.setBackgroundColor(Color.parseColor("#0B615E"))
            }

            5 -> {
                binding.btnGenre5.setBackgroundColor(Color.parseColor("#0B615E"))
            }

            6 -> {
                binding.btnGenre6.setBackgroundColor(Color.parseColor("#0B615E"))
            }

            7 -> {
                binding.btnGenre7.setBackgroundColor(Color.parseColor("#0B615E"))
            }

            8 -> {
                binding.btnGenre8.setBackgroundColor(Color.parseColor("#0B615E"))
            }

            9 -> {
                binding.btnGenre9.setBackgroundColor(Color.parseColor("#0B615E"))
            }

            10 -> {
                binding.btnGenre10.setBackgroundColor(Color.parseColor("#0B615E"))
            }

            11 -> {
                binding.btnGenre11.setBackgroundColor(Color.parseColor("#0B615E"))
            }

            12 -> {
                binding.btnGenre12.setBackgroundColor(Color.parseColor("#0B615E"))
            }

        }
        return num
    }
    private fun settingBinding(){
        binding = ActivityGenreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGenre1.setOnClickListener(customOnClickListener)
        binding.btnGenre2.setOnClickListener(customOnClickListener)
        binding.btnGenre3.setOnClickListener(customOnClickListener)
        binding.btnGenre4.setOnClickListener(customOnClickListener)
        binding.btnGenre5.setOnClickListener(customOnClickListener)
        binding.btnGenre6.setOnClickListener(customOnClickListener)
        binding.btnGenre7.setOnClickListener(customOnClickListener)
        binding.btnGenre8.setOnClickListener(customOnClickListener)
        binding.btnGenre9.setOnClickListener(customOnClickListener)
        binding.btnGenre10.setOnClickListener(customOnClickListener)
        binding.btnGenre11.setOnClickListener(customOnClickListener)
        binding.btnGenre12.setOnClickListener(customOnClickListener)
        binding.btnGenreStart.setOnClickListener(customOnClickListener)

        binding.btnBack.setOnClickListener(customOnClickListener)
    }
}