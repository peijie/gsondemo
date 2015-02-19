package com.mountainwind.gsondemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.mountainwind.BusinessObject.JsonObject;
import com.mountainwind.messagepackdemo.R;

import java.util.HashMap;
import java.util.List;


public class InfoDisplayActivity extends ActionBarActivity {

//    List<String> listDataHeader;
//    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_display);

        Intent intent = getIntent();

        String data = intent.getStringExtra("test");

        Gson gson = new Gson();
        JsonObject obj = gson.fromJson(data, JsonObject.class);

        TextView txt = (TextView)findViewById(R.id.textView);

        txt.setVerticalScrollBarEnabled(true);

        txt.setText(obj.toString());



//        listDataHeader = obj.getMessages();
//
//        listDataChild = new HashMap<String, List<String>>();
//
//        listDataChild.put(listDataHeader.get(0), obj.getFirstObject().getMessages());
//        listDataChild.put(listDataHeader.get(1), obj.getFirstObject().getMessages());
//        listDataChild.put(listDataHeader.get(2), obj.getFirstObject().getMessages());

//        ExpandableListView expListView = (ExpandableListView)findViewById(R.id.expandableListView);
//
//        ExpandableListAdapter adapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

//        expListView.setAdapter(adapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_info_display, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
