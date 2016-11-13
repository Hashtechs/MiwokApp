/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok.activites;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.miwok.R;
import com.example.android.miwok.adapter.DummyAdapter;

public class NumbersActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        LinearLayoutManager layoutManger =  new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManger);
        recyclerView.setAdapter(new DummyAdapter(this));


    }
}


//    ArrayList<Word> words = new ArrayList<Word>();
//words.add(new Word("one","lutti",R.drawable.number_one));
//        words.add(new Word("two","otiiko",R.drawable.number_two));
//        words.add(new Word("three","tolookosu",R.drawable.number_three));
//        words.add(new Word("four","oyyisa",R.drawable.number_four));
//        words.add(new Word("five","massokka",R.drawable.number_five));
//        words.add(new Word("six","temmokka",R.drawable.number_six));
//        words.add(new Word("seven","kenekaku",R.drawable.number_seven));
//        words.add(new Word("eight","kawinta",R.drawable.number_eight));
//        words.add(new Word("nine","wo’e",R.drawable.number_nine));
//        words.add(new Word("ten","na’aacha",R.drawable.number_ten));