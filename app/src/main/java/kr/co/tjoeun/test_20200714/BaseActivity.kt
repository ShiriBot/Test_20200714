package kr.co.tjoeun.test_20200714

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext=this

    abstract fun SetValues()
    abstract fun SetupEvents()

}