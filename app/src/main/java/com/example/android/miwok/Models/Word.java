package com.example.android.miwok.Models;

/**
 * Created by MFQ on 11/12/16.
 */

public class Word {


    private String mEnglishWord;
    private String mMiwokWord;
    private int mImgId;

    public Word(String englishWord, String MiwokWord, int imgId) {
        mEnglishWord = englishWord;
        mMiwokWord = MiwokWord;
        mImgId = imgId;
    }


    public String getEnglishWord() {
        return mEnglishWord;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public int getImgId() {
        return mImgId;
    }
}
