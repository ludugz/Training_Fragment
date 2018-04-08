package tan.fbmessengerlayout.Adapter;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.TextView;

import tan.fbmessengerlayout.Fragment.FragmentOne;
import tan.fbmessengerlayout.Fragment.FragmentOne_;
import tan.fbmessengerlayout.Fragment.FragmentThree;
import tan.fbmessengerlayout.Fragment.FragmentThree_;
import tan.fbmessengerlayout.Fragment.FragmentTwo;
import tan.fbmessengerlayout.Fragment.FragmentTwo_;
import tan.fbmessengerlayout.R;


public class MyPagerAdapter extends FragmentPagerAdapter {


    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentOne_();
            case 1:
                return new FragmentTwo_();
            case 2:
                return new FragmentThree_();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "abc";
            case 1:
                return "def";
            case 2:
                return "123";
            default:
                return null;
        }
    }
}
