package com.example.android.markscard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class wordAdaptor extends ArrayAdapter {
    public wordAdaptor(Context context, ArrayList<word> data){ super(context,0,data);}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
     View listItemView = convertView;
     if(listItemView == null){
         listItemView = LayoutInflater.from(getContext()).inflate(
                 R.layout.list_item, parent, false);
        word local_word = (word) getItem(position);


         TextView subject = (TextView) listItemView.findViewById(R.id.subjectTextView);

         subject.setText(local_word.getmSubject());

         TextView totalMarks = (TextView) listItemView.findViewById(R.id.total_marks);

         totalMarks.setText(local_word.getmTotalMarks());

         TextView marks = (TextView) listItemView.findViewById(R.id.marks_achived);

         totalMarks.setText(local_word.getmMarks());
     }

        return listItemView;
    }
}
