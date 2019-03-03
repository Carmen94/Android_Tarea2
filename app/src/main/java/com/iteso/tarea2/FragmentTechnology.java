package com.iteso.tarea2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iteso.tarea2.beans.ItemProduct;

import java.util.ArrayList;


public class FragmentTechnology extends Fragment {

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public FragmentTechnology() {}

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment__technology, container, false);
        RecyclerView recyclerView = (RecyclerView)
                view.findViewById(R.id.fragment_technology_recycler_view);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        ArrayList<ItemProduct> myDataSet = new ArrayList<ItemProduct>();
        ItemProduct micro = new ItemProduct();
        micro.setTitle(getString(R.string.microTitle));
        micro.setStore(getString(R.string.bbStore));
        micro.setLocation(getString(R.string.microLocation));
        micro.setPhone(getString(R.string.microPhone));
        micro.setImage(3);
        micro.setDescription(getString(R.string.microDescription));

        myDataSet.add(micro);
        mAdapter = new AdapterProduct(getActivity(), myDataSet);
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}