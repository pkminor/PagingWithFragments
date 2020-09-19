package com.pkminor.pagingwithfragments.ui.home;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.paging.PagedList;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.pkminor.pagingwithfragments.R;
import com.pkminor.pagingwithfragments.model.Datum;

public class HomeAdapter  extends PagedListAdapter<Datum,HomeAdapter.HomeViewHolder> {

    private Context context;

    public HomeAdapter(Context context) {
        super(DIFF_CALLBACK);
        this.context =  context;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_list_item,parent,false);
        return new HomeViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        Datum data = getItem(position);
        Log.d("TAG BIND ",String.valueOf(position));

        if(data!=null){  holder.bindTo(data); }
    }

    @Override
    public void submitList(@Nullable PagedList<Datum> pagedList) {
        super.submitList(pagedList);
        Log.d("TAG", "Submitted "+pagedList.size());
    }

    private static DiffUtil.ItemCallback<Datum> DIFF_CALLBACK =
            new DiffUtil.ItemCallback<Datum>() {
                @Override
                public boolean areItemsTheSame(@NonNull Datum oldItem, @NonNull Datum newItem) {
                    return oldItem.getId() == newItem.getId();
                }

                @Override
                public boolean areContentsTheSame(@NonNull Datum oldItem, @NonNull Datum newItem) {
                    return oldItem.getId().equals(newItem.getId());
                }
            };

    class HomeViewHolder extends RecyclerView.ViewHolder {
        private ImageView image_profile;
        private TextView text_name;
        private TextView text_title;
        private Context context;

        public HomeViewHolder(@NonNull View itemView, Context c) {
            super(itemView);
            this.context =  c;

            image_profile = itemView.findViewById(R.id.image_profile);
            text_name = itemView.findViewById(R.id.text_name);
            text_title = itemView.findViewById(R.id.text_title);
        }

        public void bindTo(Datum data){
            Glide.with(context).load(R.mipmap.avatar_profile).into(image_profile);
            text_name.setText(context.getString(R.string.name,data.getFirstname(),data.getSecondname(),data.getSurname()));
            text_title.setText(data.getTitle());
        }
    }
}
