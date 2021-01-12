package com.example.forgot_password;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class grid_view extends AppCompatActivity {

    GridView gridView;
    int[] imgs = {R.drawable.fp, R.drawable.otp};
    String[] names = {"Forgot password","SMS"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView = findViewById(R.id.grid_view);

            CustomAdp cstap = new CustomAdp(names, imgs, this);

            gridView.setAdapter(cstap);
    }

    public class CustomAdp extends BaseAdapter{

        private final String[] imagnme;
        private final int[] imgpic;
        private final Context context;
        private final LayoutInflater layoutInflater;

        public CustomAdp(String[] imagnme, int[] imgpic, Context context) {
            this.imagnme = imagnme;
            this.imgpic = imgpic;
            this.context = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return imgpic.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {

            if (view == null){
                view = layoutInflater.inflate(R.layout.grid_view_row, parent, false);
            }

            TextView tv = view.findViewById(R.id.tv);
            ImageView imgviw = view.findViewById(R.id.imgviw);
            //ImageView imageView;

            tv.setText(imagnme[position]);
            imgviw.setImageResource(imgpic[position]);
            return view;
        }
    }
}