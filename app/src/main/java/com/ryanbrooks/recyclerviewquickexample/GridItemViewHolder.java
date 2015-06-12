package com.ryanbrooks.recyclerviewquickexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Ryan Brooks on 6/12/15.
 *
 * Find your views for the RecyclerView item here.
 */
public class GridItemViewHolder extends RecyclerView.ViewHolder {

    TextView itemText;

    public GridItemViewHolder(View itemView) {
        super(itemView);
        itemText = (TextView) itemView.findViewById(R.id.grid_item_text); // Find the textview
    }
}
