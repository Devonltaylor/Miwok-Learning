package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Creates an array list of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","epe", R.drawable.number_one));
        words.add(new Word("mother","eta", R.drawable.number_two));
        words.add(new Word("son","ansi", R.drawable.number_three));
        words.add(new Word("daughter","tune", R.drawable.number_four));
        words.add(new Word("older brother","taachi", R.drawable.number_five));
        words.add(new Word("younger brother","chalitti", R.drawable.number_six));
        words.add(new Word("older sister","tete", R.drawable.number_seven ));
        words.add(new Word("younger sister","kolliti", R.drawable.number_eight ));
        words.add(new Word("grandmother","ama", R.drawable.number_nine ));
        words.add(new Word("grandfather","paapa", R.drawable.number_ten));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.

        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
