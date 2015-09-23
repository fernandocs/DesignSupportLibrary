package com.fernandocs.designsupportlibrarydemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fernandocs.designsupportlibrarydemo.R;

public class ListFragment extends Fragment {

    private RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRecyclerView = (RecyclerView) inflater.inflate(R.layout.list_fragment, container, false);
        return mRecyclerView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


//
//        LinearLayoutManager linearLayoutManager
//                = new LinearLayoutManager(
//                                getActivity(), // Context
//                                LinearLayoutManager.VERTICAL, // Orientation
//                                false); // Reverse
//

//        GridLayoutManager gridLayoutManager
//                = new GridLayoutManager(
//                            getActivity(), // Context
//                            2, // Number of columns
//                            GridLayoutManager.VERTICAL, // Orientation
//                            false); // Reverse


        StaggeredGridLayoutManager sGridLayoutManager
                = new StaggeredGridLayoutManager(
                            3, // Number of columns
                            StaggeredGridLayoutManager.VERTICAL); // Orientation
        sGridLayoutManager.setGapStrategy(
                StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS);


        mRecyclerView.setLayoutManager(new LinearLayoutManager(mRecyclerView.getContext()));
        //mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false));
        //mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager());
        mRecyclerView.setAdapter(new RecyclerViewAdapter(getActivity()));
    }
}
