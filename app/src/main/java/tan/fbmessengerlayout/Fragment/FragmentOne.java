package tan.fbmessengerlayout.Fragment;

import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import tan.fbmessengerlayout.Adapter.MyRecyclerAdapter;
import tan.fbmessengerlayout.MainActivity_;
import tan.fbmessengerlayout.R;

@EFragment(R.layout.fragment_one)
public class FragmentOne extends Fragment {
    List<Integer> dataList = new ArrayList<>();
    private final int NUMBER_OF_COLUMNS = 2;
    MyRecyclerAdapter mMyRecyclerAdapter;

    @ViewById(R.id.tv_fr_one)
    TextView textView;

    @ViewById(R.id.recycler_view)
    RecyclerView mRecyclerView;

    @AfterViews
    void updateTextView() {
        textView.setText("Fragment One");

        // Handle RecyclerView
        updateDataList();
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), NUMBER_OF_COLUMNS));
        mMyRecyclerAdapter = new MyRecyclerAdapter(dataList);
        mRecyclerView.setAdapter(mMyRecyclerAdapter);
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
