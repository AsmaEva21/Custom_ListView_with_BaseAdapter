package com.asmaeva.custom_listview_with_baseadapterassignment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView txttitle , txtLocation, txtDescription, txtTimeDate, txtDate;
    ImageView imgView,imgView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

// Retrieve the image resource ID passed from MainActivity
       /* int imageResource = getIntent().getIntExtra("imageResource", R.drawable.img_13);

        // Find the ImageView in activity_main2 layout
        ImageView iconImageView = findViewById(R.id.imgView1);

        // Set the image resource to the ImageView
        iconImageView.setImageResource(imageResource);*/

        txtDescription = findViewById(R.id.txtDescription);
        txtTimeDate = findViewById(R.id.txtTimeDate);
        //txtDate = findViewById(R.id.txtDate);
        txtLocation = findViewById(R.id.txtLocation);
        txttitle = findViewById(R.id.txtDistrict);
        imgView = findViewById(R.id.imgView);
        // Find the ImageView in activity_main2 layout



        Intent intent = getIntent();
        String description = intent.getStringExtra("description");
        String timedate = intent.getStringExtra("timedate");
       // String date = intent.getStringExtra("date");
        String location = intent.getStringExtra("location");
        String title = intent.getStringExtra("title ");
        int imageId = intent.getIntExtra("imageId", 0);






        txtDescription.setText(description);
        txtTimeDate.setText(timedate);
        //txtDate.setText(date);
        txtLocation.setText(location);
        txttitle .setText(title );
        imgView.setImageResource(imageId);

    }
}
