package com.faravy.bitmtrainer401.listviewfrombtnclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText nameET;
    EditText phoneNOET;
    ListView listView;
    String name;
    String phoneNo;
    ArrayList<Contact> contactList;
    ContactAdapter adapter;
    Contact contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameET = (EditText) findViewById(R.id.nameEdittext);
        phoneNOET = (EditText) findViewById(R.id.phoneEditText);
        listView = (ListView) findViewById(R.id.listView);
        contactList = new ArrayList<>();


    }

    public void creatList(View view) {

        name = nameET.getText().toString();
        phoneNo = phoneNOET.getText().toString();
        contact = new Contact();
        contact.setName(name);
        contact.setPhoneNo(phoneNo);

        contactList.add(contact);
        Toast.makeText(getApplicationContext(), contact.getName(), Toast.LENGTH_LONG).show();

        adapter = new ContactAdapter(this, contactList);

        listView.setAdapter(adapter);

       /* listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                contactList.remove(position);
                adapter.notifyDataSetChanged();

            }
        });*/

    }

}
