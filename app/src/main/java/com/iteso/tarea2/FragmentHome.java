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


public class FragmentHome extends Fragment {

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public FragmentHome() {}

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = (RecyclerView)
                view.findViewById(R.id.fragment_home_recycler_view);
// Use this setting to improve performance if you know that changes
// in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
// Use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        ArrayList<ItemProduct> myDataSet = new ArrayList<ItemProduct>();
        ItemProduct fridge = new ItemProduct();
        fridge.setTitle(getString(R.string.fridgeTitle));
        fridge.setStore(getString(R.string.bbStore));
        fridge.setLocation(getString(R.string.fridgeLocation));
        fridge.setPhone(getString(R.string.fridgePhone));
        fridge.setImage(2);
        fridge.setDescription(getString(R.string.fridgeDescription));

        myDataSet.add(fridge);

        mAdapter = new AdapterProduct(getActivity(), myDataSet);
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}