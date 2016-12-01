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

public class Calls extends Fragment {

    ListView msgListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calls_layout, container, false);

        msgListView = (ListView) view.findViewById(R.id.msgListViewCalls);
        msgListView.setTranscriptMode(ListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);
        msgListView.setStackFromBottom(false);

        String[] calls = new String[] {
                "João da Silva \n" +
                        " Ontem",
                "Maria Teresa dos Santos \n" +
                        " Ontem",
                "Ana Vicente \n" +
                        " Ontem",
                "Carlos Alberto do Santos \n" +
                        " Ontem",
                "Carla Gonçalves \n" +
                        " Ontem",
                "Pedro Dias da SIlva \n" +
                        " Ontem",
                "Anabel Villela \n" +
                        " Hoje",
                "Luis Anderson Castro \n" +
                        " Hoje",
                "Martinho dos Reis \n" +
                        " Hoje"
        };

        final List<String> callsList = new ArrayList<String>(Arrays.asList(calls));

        // Cria ArrqyAdapeter a partir do ArrayList
        final ArrayAdapter<String> callsAdapter = new ArrayAdapter<String>
                (getActivity(), android.R.layout.simple_list_item_1, callsList);

        msgListView.setAdapter(callsAdapter);

        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
    }

}