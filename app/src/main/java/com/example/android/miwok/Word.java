package com.example.android.miwok;

public class Word {

    // Default translation for word
    private String mDefaultTranslation;

    // Miwok translation for word
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
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
}

