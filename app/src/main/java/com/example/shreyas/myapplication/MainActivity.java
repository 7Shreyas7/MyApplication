package com.example.shreyas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bookButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookButton = (Button) findViewById(R.id.book_button);

        BookButtonClickListener();
    }

    private void BookButtonClickListener()
    {
        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Book my Ticket", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void ClickClickClick(View view) {
        Toast.makeText(MainActivity.this, "Book my Ticket", Toast.LENGTH_SHORT).show();
    }
}
