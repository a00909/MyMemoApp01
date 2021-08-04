package com.example.mymemoapp01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CardView cardView;
    ArrayList<CardView> cards;
    LinearLayout mainLinearLayout;
    //ListView listView;
    String[] values = new String[]{
            "蘋果",
            "香蕉",
            "葡萄",
            "水梨"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //cardView = (CardView) findViewById(R.id.cv1);

        mainLinearLayout = (LinearLayout) findViewById(R.id.mainLinearLayout);
        //cards = new ArrayList<CardView>();

        androidx.appcompat.widget.Toolbar myToolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        /*
        listView = (ListView) findViewById(R.id.list);
        ListAdapter adapter = new ArrayAdapter<>(this , android.R.layout.simple_list_item_1 ,values);
        listView.setAdapter(adapter);
        */
    }

    public void addNewCard(View view) {
        CardView newCard = new CardView(this);

        {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    400

            );
            params.setMargins(10, 10, 10, 0);
            params.gravity = Gravity.CENTER;

            newCard.setLayoutParams(params);
            newCard.setBackgroundColor(Color.parseColor("#333333"));
            newCard.setRadius(4);
        }

        {

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT
            );

            TextView newCardText = new TextView(this);
            newCardText.setLayoutParams(params);
            newCardText.setGravity(Gravity.CENTER);
            newCardText.setText("Text");
            newCardText.setTextColor(Color.parseColor("#FFFFFF"));
            newCardText.setTextSize(72);

            newCard.addView(newCardText);
        }


        //cards.add(newCard);
        mainLinearLayout.addView(newCard);
    }
}