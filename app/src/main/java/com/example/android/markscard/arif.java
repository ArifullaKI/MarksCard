package com.example.android.markscard;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class arif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arif);

        ArrayList<word> data = new ArrayList<word>();
        data.add(new word("Maths","100","50"));
        data.add(new word("English","100","50"));
        data.add(new word("Computer Science","100","50"));
        data.add(new word("Science","100","78"));
        data.add(new word("Social","100","42"));

        wordAdaptor dataAdaptor = new wordAdaptor(this,data);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(dataAdaptor);


        }

    }

