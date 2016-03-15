package com.faravy.bitmtrainer401.listviewfrombtnclick;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by BITM Trainer 401 on 3/1/2016.
 */
public class ContactAdapter extends ArrayAdapter<Contact> {
    ArrayList<Contact> contactList;
    Context context;


    public ContactAdapter(Context context, ArrayList<Contact> contactList) {
        super(context, R.layout.row_view, contactList);
        this.contactList = contactList;
        this.context = context;
    }

    static class ViewHolder {
        TextView nameTV;
        TextView phoneTV;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.row_view, null);

            viewHolder.nameTV = (TextView) convertView.findViewById(R.id.textName);
            viewHolder.phoneTV = (TextView) convertView.findViewById(R.id.textPhoneNo);

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.nameTV.setText(contactList.get(position).getName());
        viewHolder.phoneTV.setText(contactList.get(position).getPhoneNo());

        return convertView;

    }
}
