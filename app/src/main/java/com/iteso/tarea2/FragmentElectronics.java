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


public class FragmentElectronics extends Fragment {

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public FragmentElectronics() {}

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_electronics, container, false);
        RecyclerView recyclerView = (RecyclerView)
                view.findViewById(R.id.fragment_electronics_recycler_view);
// Use this setting to improve performance if you know that changes
// in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
// Use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        ArrayList<ItemProduct> myDataSet = new ArrayList<ItemProduct>();
        ItemProduct macbook = new ItemProduct();
        macbook.setTitle(getString(R.string.macbookTitle));
        macbook.setStore(getString(R.string.bbStore));
        macbook.setLocation(getString(R.string.macbookLocation));
        macbook.setPhone(getString(R.string.macbookPhone));
        macbook.setImage(0);
        macbook.setDescription(getString(R.string.macbookDescription));

        ItemProduct allienware = new ItemProduct();
        allienware.setTitle(getString(R.string.allienwareTitle));
        allienware.setStore(getString(R.string.bbStore));
        allienware.setLocation(getString(R.string.allienwareLocation));
        allienware.setPhone(getString(R.string.allienwarePhone));
        allienware.setImage(1);
        allienware.setDescription(getString(R.string.allienwareDescription));

        myDataSet.add(macbook);
        myDataSet.add(allienware);
        mAdapter = new AdapterProduct(getActivity(), myDataSet);
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}