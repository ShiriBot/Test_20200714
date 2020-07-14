package kr.co.tjoeun.test_20200714.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView
import kr.co.tjoeun.test_20200714.R
import kr.co.tjoeun.test_20200714.datas.PizzaStore

class PizzaStoreAdapter
    (val mContext:Context, val resId:Int, val mList:List<PizzaStore>)
    :ArrayAdapter<PizzaStore>(mContext,resId,mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null){
            tempRow=inf.inflate(R.layout.pizzastore_list_item,null)
        }

        val row = tempRow!!



        val data = mList[position]

        val pizzaStoreNameTxt = row.findViewById<TextView>(R.id.pizzaStoreNameTxt)
        val pizzaLogoImg = row.findViewById<CircleImageView>(R.id.pizzaLogoImg)

        pizzaStoreNameTxt.text = data.name
        Glide.with(mContext).load(data.logUrl).into(pizzaLogoImg)

        return row






    }


}