package com.example.viewpager;

public enum ModelCourse {

    RED(R.string.red , R.layout.view_red),
    GREEN(R.string.green , R.layout.view_green),
    BLUE(R.string.blue , R.layout.view_blue);


private int mTittleID;
private int mLayoutID;

    ModelCourse(int mTittleID, int mLayoutID) {
        this.mTittleID = mTittleID;
        this.mLayoutID = mLayoutID;
    }

    public int getmTittleID() {
        return mTittleID;
    }

    public void setmTittleID(int mTittleID) {
        this.mTittleID = mTittleID;
    }

    public int getmLayoutID() {
        return mLayoutID;
    }

    public void setmLayoutID(int mLayoutID) {
        this.mLayoutID = mLayoutID;
    }
}
