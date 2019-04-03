package com.guide.android.infintiecycleviewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CycleAdapter extends PagerAdapter {
    Context context;

    List<Movie> movieList;

    public CycleAdapter(Context context, List<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
    }

    @Override
    public int getCount() {
        return movieList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_item,container,false);

        ImageView movieImage = (ImageView)view.findViewById(R.id.image_movie);
        TextView movieTitle= (TextView)view.findViewById(R.id.movie_title);
        TextView movieDesc= (TextView)view.findViewById(R.id.movie_desc);
        FloatingActionButton actionButton = (FloatingActionButton)view.findViewById(R.id.btn_fav);

        movieImage.setImageResource(movieList.get(position).getImageMovie());
        movieTitle.setText(movieList.get(position).getTitle());
        movieDesc.setText(movieList.get(position).getDescription());


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,""+movieList.get(position).getTitle(),Toast.LENGTH_SHORT)
                        .show();
            }
        });

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Button clicked",Toast.LENGTH_SHORT)
                        .show();
            }
        });

        container.addView(view);
        return view;
    }
}
