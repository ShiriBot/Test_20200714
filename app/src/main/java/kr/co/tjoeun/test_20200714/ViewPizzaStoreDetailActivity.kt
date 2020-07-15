package kr.co.tjoeun.test_20200714

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import kotlinx.android.synthetic.main.activity_view_pizza_store_detail.*
import kr.co.tjoeun.test_20200714.datas.PizzaStore

class ViewPizzaStoreDetailActivity : BaseActivity() {

    lateinit var mPizzaStore : PizzaStore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pizza_store_detail)
        SetValues()
        SetupEvents()

    }

    override fun SetValues() {

        mPizzaStore = intent.getSerializableExtra("pizzaStore") as PizzaStore

        pizzaStoreNameTxt.text = mPizzaStore.name
        pizzaStorePhoneNumTxt.text = mPizzaStore.phoneNum
        Glide.with(mContext).load(mPizzaStore.logUrl).into(pizzaLogoDetailImg)


    }

    override fun SetupEvents() {

        callBtn.setOnClickListener {

            val pl = object : PermissionListener{
                override fun onPermissionGranted() {

                    val myUri = Uri.parse("tel:${mPizzaStore.phoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL,myUri)
                    startActivity(myIntent)

                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                    Toast.makeText(mContext,"권한 승인이 되지 않아 전화주문을 할 수 없습니다.",Toast.LENGTH_SHORT).show()
                }
            }

            TedPermission.with(mContext)
                .setPermissions(Manifest.permission.CALL_PHONE)
                .setDeniedMessage("설정에서 권한을 승인해줘야 사용가능합니다.")
                .setPermissionListener(pl)
                .check()


        }



    }


}