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
    private final int NUMBER_OF_COLUMNS = 2;
    MyRecyclerAdapter mMyRecyclerAdapter;


    @ViewById(R.id.recycler_view)
    RecyclerView mRecyclerView;

    @AfterViews
    void updateTextView() {

        // Handle RecyclerView
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), NUMBER_OF_COLUMNS));
        mMyRecyclerAdapter = new MyRecyclerAdapter(MainActivity_.dataList);
        mRecyclerView.setAdapter(mMyRecyclerAdapter);
    }


}
