package tan.fbmessengerlayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import tan.fbmessengerlayout.Adapter.MyPagerAdapter;
import tan.fbmessengerlayout.Adapter.MyRecyclerAdapter;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {


    @ViewById(R.id.view_pager)
    ViewPager mViewPager;

    @ViewById(R.id.tab_layout)
    TabLayout mTabLayout;


    @AfterViews
    void updateFragment(){
        // Handle ViewPager
        PagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(pagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);


    }

}
