package tan.fbmessengerlayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import java.util.ArrayList;
import java.util.List;
import tan.fbmessengerlayout.Adapter.MyPagerAdapter;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

   public static List<Integer> dataList = new ArrayList<>();

    @ViewById(R.id.view_pager)
    ViewPager mViewPager;

    @ViewById(R.id.tab_layout)
    TabLayout mTabLayout;

    @ViewById(R.id.tool_bar)
    Toolbar mToolBar;


    @AfterViews
    void updateFragment() {
        // Handle Toolbar
        setSupportActionBar(mToolBar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // Update DataList for FragmentOne
        updateDataList();
        // Handle ViewPager
        PagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(pagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);



    }

    private void updateDataList() {
        dataList.add(R.drawable.album_name_1);
        dataList.add(R.drawable.album_name_3);
        dataList.add(R.drawable.album_name_4);
        dataList.add(R.drawable.album_name_5);
        dataList.add(R.drawable.album_name_6);
        dataList.add(R.drawable.album_name_7);
        dataList.add(R.drawable.album_name_8);
    }
}
