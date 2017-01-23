package com.example.ameyashanbhag.retreive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;

public class ListP extends AppCompatActivity {

    private ArrayList<User> user;
    private ArrayList<String> keys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listp);
        user = new ArrayList<>();
        keys=new ArrayList<>();
        Firebase.setAndroidContext(this);


    }

    @Override
    protected void onStart(){
        super.onStart();
        Firebase rootRef = new Firebase("https://amishw-93851.firebaseio.com/User");
                final ArrayAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1,user);
                final ListView theListView = (ListView)findViewById(R.id.theListView);
                theListView.setAdapter(adapter);


                rootRef.addChildEventListener(new ChildEventListener(){
                    public boolean doubleBackToExitPressedOnce=false;

            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                User newpatient = dataSnapshot.getValue(User.class);
                keys.add(dataSnapshot.getKey());
                //System.out.println("Age: " + newpatient.getAge());
                //keys.add(newpatient);
                user.add(newpatient);
                adapter.notifyDataSetChanged();




            }



            @Override
            public void onChildChanged(DataSnapshot snapshot, String s) {}
            @Override
            public void onChildRemoved(DataSnapshot snapshot) {}
            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {}
            @Override
            public void onCancelled(FirebaseError firebaseError) {}
        });


    }

}