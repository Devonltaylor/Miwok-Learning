package com.example.android.miwok;

public class Word {

    // Default translation for word
    private String mDefaultTranslation;

    // Miwok translation for word
    private String mMiwokTranslation;

    // Image for Miwok word
    private int mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     *
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceId is the drawable resource ID for the image
     */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get default translation of the word.
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get default translation of the word.
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Return the image resource ID of the word
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }
}

