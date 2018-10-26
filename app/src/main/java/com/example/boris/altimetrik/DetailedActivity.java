package com.example.boris.altimetrik;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetailedActivity extends AppCompatActivity {
    TextView title, description, donors;
    ImageView imageView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
        Intent intent = getIntent();
        title = findViewById(R.id.detailed_item_tv_title);
        description = findViewById(R.id.detailed_item_tv_description);
        donors = findViewById(R.id.detailed_item_tv_donors);
        imageView = findViewById(R.id.detailed_item_image);

        button = findViewById(R.id.detailed_button_donate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DetailedActivity.this);
                builder.setTitle("How much you want to donate");

                // Set up the input
                final EditText input = new EditText(DetailedActivity.this);
                // Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
                input.setInputType(InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);

                // Set up the buttons
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        int money = Integer.parseInt(input.getText().toString());
                        Snackbar.make(input, "Replace with your own action", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();
            }
        });

        title.setText(intent.getStringExtra("title"));
        description.setText("Description: " + intent.getStringExtra("description"));
        donors.setText("Donors needed: " + intent.getStringExtra("donors"));
        Picasso.get()
                .load(intent.getStringExtra("poster_path"))
                .into(imageView);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
