package com.codingproject.videoplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] mainTitle;
    private final String[] subTitle;
    private final int[] image;


    public MyListAdapter(Activity context, String[] mainTitle, String[] subTitle, int[] image) {
        super(context, R.layout.customlistview, mainTitle);
        this.context = context;
        this.mainTitle = mainTitle;
        this.subTitle = subTitle;
        this.image = image;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.customlistview, null, true);
        TextView titletext = rowView.findViewById(R.id.mainTitleText);
        TextView subTitleText = rowView.findViewById(R.id.subTitleText);
        ImageView imageFile = rowView.findViewById(R.id.imageView01);

        titletext.setText(mainTitle[position]);
        subTitleText.setText(subTitle[position]);
        imageFile.setImageResource(image[position]);

        return rowView;
    }
}
