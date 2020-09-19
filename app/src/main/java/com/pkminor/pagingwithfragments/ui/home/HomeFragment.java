package com.pkminor.pagingwithfragments.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pkminor.pagingwithfragments.R;
import com.pkminor.pagingwithfragments.model.Datum;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private View root;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG","onCreate");
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Log.d("TAG","onCreateView");

        root = inflater.inflate(R.layout.fragment_home, container, false);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d("TAG","onViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("TAG","onActivityCreated");
        super.onActivityCreated(savedInstanceState);
        homeViewModel =  ViewModelProviders.of(getActivity()).get(HomeViewModel.class);
    }

    @Override
    public void onStart() {
        Log.d("TAG","onStart");
        super.onStart();

        final RecyclerView recycler_content = root.findViewById(R.id.recycler_content);
        recycler_content.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycler_content.setHasFixedSize(true);

        final HomeAdapter recycler_content_adapter = new HomeAdapter(getActivity());

        homeViewModel.getPagedListLiveData().observe(getActivity(), new Observer<PagedList<Datum>>() {
            @Override
            public void onChanged(PagedList<Datum> data) {
                Log.d("TAG","observation");
                Log.d("TAG",String.valueOf(data.size()));
                recycler_content_adapter.submitList(data);

            }
        });

        recycler_content.setAdapter(recycler_content_adapter);

    }

    @Override
    public void onDestroy() {
        Log.d("TAG","onDestroy");
        super.onDestroy();
    }
}