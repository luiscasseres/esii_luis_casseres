package com.example.root.PrjSci;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.root.PrjSci.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Contact extends Fragment {


    public static ArrayList<ChatMessage> chatlist;

    ListView msgListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contact_layout, container, false);

        msgListView = (ListView) view.findViewById(R.id.msgListViewContact);
        msgListView.setTranscriptMode(ListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);
        msgListView.setStackFromBottom(true);

        String[] contact = new String[] {
                "Cape Gooseberry",
                "Capuli cherry"
        };

        final List<String> constactList = new ArrayList<String>(Arrays.asList(contact));

        // Create an ArrayAdapter from List
        final ArrayAdapter<String> contactAdapter = new ArrayAdapter<String>
                (getActivity(), android.R.layout.simple_list_item_1, constactList);

        msgListView.setAdapter(contactAdapter);

        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
    }

}