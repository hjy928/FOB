package com.example.byjczx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private  String TAG = "One";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fobBtn = findViewById(R.id.one);
        fobBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: FOB AAA");

                Intent  oneIntent = new Intent(MainActivity.this,OneActivity.class);
                startActivity(oneIntent);
            }
        });
        Button fobbtn3 =findViewById(R.id.three);
        fobbtn3.setOnClickListener(this);
    }

    public void onClickFobTwo(View view)
    {
        Intent  twoIntent = new Intent(this,TwoActivity.class);
        startActivity(twoIntent);
        Log.i(TAG, "onClickFobTwo:FOB BBB ");
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.three)
        {
            Intent threeIntent = new Intent(this,ThreeActivity.class);
            startActivity(threeIntent);
        }
    }
}