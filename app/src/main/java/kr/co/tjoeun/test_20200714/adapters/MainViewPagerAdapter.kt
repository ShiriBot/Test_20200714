package kr.co.tjoeun.test_20200714.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.test_20200714.fragment.FirstFragment
import kr.co.tjoeun.test_20200714.fragment.SecondFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0->"피자 주문"
            else->"내 정보 설정"
        }
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            else -> SecondFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}