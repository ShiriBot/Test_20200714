package kr.co.tjoeun.test_20200714

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_change_nickname.*

class ChangeNicknameActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_nickname)
        SetValues()
        SetupEvents()

    }

    override fun SetValues() {

    }

    override fun SetupEvents() {

        changeNickNameClearBtn.setOnClickListener {
            val resultIntent : Intent()
            resultIntent.putExtra("nickName",changeNickNameEdt.text)
            setResult(Activity.RESULT_OK,resultIntent)
            finish()


        }

    }


}