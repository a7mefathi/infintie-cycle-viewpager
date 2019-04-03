package com.guide.android.infintiecycleviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    HorizontalInfiniteCycleViewPager viewPager;
    List<Movie> movieList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        viewPager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.view_pager);
        CycleAdapter adapter=  new CycleAdapter(this,movieList);
        viewPager.setAdapter(adapter);

    }

    private void initData() {


        movieList.add(new Movie("Auqa man",getString(R.string.movie_is_wonderful),R.drawable.back_to_school_pink_4d6ef37d_5733_4065_9897_045b70961c60));
        movieList.add(new Movie("jony wick",getString(R.string.movie_is_wonderful),R.drawable.london));
        movieList.add(new Movie("ahmed fathi",getString(R.string.movie_is_wonderful),R.drawable.abstra));


    }
}
