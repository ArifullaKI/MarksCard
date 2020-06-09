package com.example.android.markscard;

public class word {

    private String mSubject;
    private String mTotalMarks;
    private String mMarks;


    public word (String subject,String totalMarks,String marks){
        mSubject = subject;
        mTotalMarks = totalMarks;
        mMarks = marks;
    }

    public String getmSubject(){
        return mSubject;
    }

    public String getmTotalMarks(){
        return mTotalMarks;
    }

    public String getmMarks(){
        return mMarks;
    }


}
