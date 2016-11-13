package com.example.android.miwok.Models;

/**
 * Created by MFQ on 11/12/16.
 */

public class Word {


    private String mEnglishWord;
    private String mMiwokWord;

    public Word(String englishWord, String MiwokWord) {
        mEnglishWord = englishWord;
        mMiwokWord = MiwokWord;
    }


    public String getEnglishWord() {
        return mEnglishWord;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }
}
