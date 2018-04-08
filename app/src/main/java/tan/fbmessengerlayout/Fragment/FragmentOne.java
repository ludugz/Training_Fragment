package tan.fbmessengerlayout.Fragment;

import android.support.v4.app.Fragment;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import tan.fbmessengerlayout.R;

@EFragment(R.layout.fragment_one)
public class FragmentOne extends Fragment {

    @ViewById(R.id.tv_fr_one)
    TextView textView;
    @AfterViews
    void updateTextView(){
        textView.setText("Fragment One");
    }


}
