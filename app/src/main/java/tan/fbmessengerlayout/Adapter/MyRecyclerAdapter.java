package tan.fbmessengerlayout.Adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import tan.fbmessengerlayout.R;


public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {
    private int count1 =0 ;
    private int count2 =0 ;
    private int count3 =0 ;

    private List<Integer> dataList = new ArrayList<>();

    public MyRecyclerAdapter(List<Integer> dataList) {
        count1++;
        Log.i("TAG", "MyRecyclerAdapter:" + count1);
        this.dataList = dataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        count2++;
        Log.i("TAG", "onCreateViewHolder: "+count2);
        View contactView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        count3++;
        Log.i("TAG", "onBindViewHolder: "+count3);
        holder.imageView.setImageResource(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

         MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_item);
        }

    }


}
