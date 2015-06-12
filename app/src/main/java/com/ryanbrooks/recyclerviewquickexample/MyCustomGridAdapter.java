package com.ryanbrooks.recyclerviewquickexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Ryan Brooks on 6/12/15.
 */
public class MyCustomGridAdapter extends RecyclerView.Adapter<GridItemViewHolder> {

    private Context mContext;
    private ArrayList<String> mGridItemList; // Your list of data to populate list with
    private LayoutInflater mInflater; // LayoutInflater for creating views

    /**
     * Public constructor that takes in Context for creating LayoutInflater and ArrayList of test
     * data
     */
    public MyCustomGridAdapter(Context context, ArrayList<String> gridItemList) {
        mContext = context;
        mGridItemList = gridItemList;
        mInflater = LayoutInflater.from(context);
    }

    /**
     * This is where you create your view. Just inflate it with the layout id of the RV item and
     * the inflater we created in the constructor and return your inflated view.
     */
    @Override
    public GridItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = mInflater.inflate(R.layout.grid_item, viewGroup, false);
        return new GridItemViewHolder(view);
    }

    /**
     * This is where you actually set the data. The TextView that I created in grid_item.xml and
     * defined in GridItemViewHolder is populated with the text in the list at the passed
     * position here.
     */
    @Override
    public void onBindViewHolder(GridItemViewHolder gridItemViewHolder, int position) {
        gridItemViewHolder.itemText.setText(mGridItemList.get(position));
    }

    /**
     * The size of the RV is equivalent to the size of the list, so just return the list's size.
     */
    @Override
    public int getItemCount() {
        return mGridItemList.size();
    }
}
