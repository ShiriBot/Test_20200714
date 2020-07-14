package kr.co.tjoeun.test_20200714

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.test_20200714.adapters.MainViewPagerAdapter

class MainActivity : BaseActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SetValues()
        SetupEvents()
    }

    override fun SetValues() {

    }

    override fun SetupEvents() {

        mvpa = MainViewPagerAdapter(supportFragmentManager)
        viewPager.adapter=mvpa

        tabLayout.setupWithViewPager(viewPager)

    }


}