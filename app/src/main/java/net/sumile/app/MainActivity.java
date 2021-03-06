package net.sumile.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import net.sumile.imageviewpager.activity.SumileImagePagerActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                SumileImageSelecter.chooseImg_User(MainActivity.this, 3, 2);
                ArrayList<String> urls = new ArrayList<>();
                urls.add("http://sumile.cn/logo_bird_small.png");
                urls.add("http://sumile.cn/wp-content/uploads/2016/07/tv_background_padding.png");
                urls.add("http://sumile.cn/newLogoNoBird.png");

                SumileImagePagerActivity.startActivity(MainActivity.this, 0, urls);
            }
        });
    }
}
