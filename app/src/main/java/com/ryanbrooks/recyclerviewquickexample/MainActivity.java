package com.ryanbrooks.recyclerviewquickexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MyCustomGridAdapter mCustomGridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.main_recyclerview); // Find view
        mCustomGridAdapter = new MyCustomGridAdapter(this, generateTestItems(20)); // Create adapter
        mRecyclerView.setAdapter(mCustomGridAdapter); // Set adapter to RV
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 4)); // 4 - the number of columns
    }

    /**
     * Creates an ArrayList of test strings for populating the RV.
     */
    private ArrayList<String> generateTestItems(int itemNumber) {
        ArrayList<String> testItemList = new ArrayList<>();
        for (int i = 0; i < itemNumber; i++) {
            String testItem = "This is item " + i;
            testItemList.add(testItem);
        }
        return testItemList;
    }
}
