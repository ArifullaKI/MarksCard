package com.example.android.markscard;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class mustafa extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arif);

        ArrayList<word> data = new ArrayList<word>();
        data.add(new word("Maths","100","50"));
        data.add(new word("English","100","74"));
        data.add(new word("Science","100","85"));
        data.add(new word("Social","100","58"));
        data.add(new word("Computer Science","100","48"));

        wordAdaptor dataAdaptor = new wordAdaptor(this,data);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(dataAdaptor);


    }


}
