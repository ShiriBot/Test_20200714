package kr.co.tjoeun.test_20200714.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_second.*
import kr.co.tjoeun.test_20200714.ChangeNicknameActivity
import kr.co.tjoeun.test_20200714.R

class SecondFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second,container,false)

        changeNickNameBtn.setOnClickListener {

            val myIntent = Intent(activity,ChangeNicknameActivity::class.java)
                startActivityForResult(myIntent,123)

        }
    }



}