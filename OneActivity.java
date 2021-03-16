package com.example.byjczx;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OneActivity extends AppCompatActivity implements View.OnClickListener {
    private  String TAG="test";
    EditText useredit,pwdedit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Button btnuserroot = findViewById(R.id.userroot);
        btnuserroot.setOnClickListener(this);

        useredit =findViewById(R.id.user);
        pwdedit = findViewById(R.id.pwd);
        }

    @Override
    public void onClick(View v) {

        String username = useredit.getText().toString();
        String pwd =pwdedit.getText().toString();
        switch (v.getId())
        {
            case R.id.userroot:
               if(username.isEmpty()|pwd.isEmpty())
               {
                   Log.i(TAG, " implements  onClick: 用户名或密码为空");
                   return;
               }
               if(username.equals("admin")&&pwd.equals("123"))
                   {
                       Log.i(TAG, " implements  onClick: OKOKOK");
                   }else{
                       Log.i(TAG, " implements  onClick: 用户名或密码为错误！！");
                   }

                break;
        }
    }
}
