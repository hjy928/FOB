package com.example.byjczx;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ThreeActivity extends AppCompatActivity implements View.OnClickListener{

    private ArrayList<String> list;
    private ListView listView;
    private EditText editText;
    private  Button addbtn;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
       addbtn =  findViewById(R.id.addlist);
       addbtn.setOnClickListener(this);
       list = new ArrayList<>();

       listView = findViewById(R.id.foblist);
       editText = findViewById(R.id.fobedit);
       adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                list.remove(position);
                adapter.notifyDataSetChanged();
                return false;
            }
        });
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.addlist){
            Log.i("BUTTON3", "onClick: button call");
        }
        String str = editText.getText().toString();
        list.add(str);
        adapter.notifyDataSetChanged();
    }
}
