package com.example.root.PrjSci;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.root.PrjSci.R;

import java.util.ArrayList;
import java.util.Random;

public class Chat extends Fragment implements View.OnClickListener {

    private EditText msg_edittext;
    private String user1 = "", user2 = "";
    private Random random;
    public static ArrayList<ChatMessage> chatlist;
    public static ChatAdapter chatAdapter;
    ListView msgListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chat_layout, container, false);
        random = new Random();

        msg_edittext = (EditText) view.findViewById(R.id.messageEditText);
        msgListView = (ListView) view.findViewById(R.id.msgListView);
        ImageButton sendButton = (ImageButton) view
                .findViewById(R.id.sendMessageButton);
        sendButton.setOnClickListener(this);

        msgListView.setTranscriptMode(ListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);
        msgListView.setStackFromBottom(true);

        chatlist = new ArrayList<ChatMessage>();
        chatAdapter = new ChatAdapter(getActivity(), chatlist);
        msgListView.setAdapter(chatAdapter);

        ChatMessage chatMessage1 = new ChatMessage(user1, user2,
                "", "" + random.nextInt(1000), true);
        /////////////////////////////
        //Massa de daos de exemplo//
        ////////////////////////////
        chatMessage1.setMsgID();
        chatMessage1.body = "Olá! Tudo Bem? \n\n você 13:00:20";
        chatMessage1.Date = CommonMethods.getCurrentDate();
        chatMessage1.Time = CommonMethods.getCurrentTime();
        chatMessage1.isMine = true;
        msg_edittext.setText("");
        chatAdapter.add(chatMessage1);
        chatAdapter.notifyDataSetChanged();

        ChatMessage chatMessage2 = new ChatMessage(user1, user2,
                "", "" + random.nextInt(1000), true);

        chatMessage2.setMsgID();
        chatMessage2.body = "Olá! Sim aqui tudo bem e com vc? \n\n 13:05:23";
        chatMessage2.Date = CommonMethods.getCurrentDate();
        chatMessage2.Time = CommonMethods.getCurrentTime();
        chatMessage2.isMine = false;
        msg_edittext.setText("");
        chatAdapter.add(chatMessage2);
        chatAdapter.notifyDataSetChanged();

        ChatMessage chatMessage3 = new ChatMessage(user1, user2,
                "", "" + random.nextInt(1000), true);

        chatMessage3.setMsgID();
        chatMessage3.body = "Blz Também, podemos marcar um reunião para amnhã ás 13:00?... \n\n você 13:14:06";
        chatMessage3.Date = CommonMethods.getCurrentDate();
        chatMessage3.Time = CommonMethods.getCurrentTime();
        chatMessage3.isMine = true;
        msg_edittext.setText("");
        chatAdapter.add(chatMessage3);
        chatAdapter.notifyDataSetChanged();

        ChatMessage chatMessage4 = new ChatMessage(user1, user2,
                "", "" + random.nextInt(1000), true);

        chatMessage4.setMsgID();
        chatMessage4.body = "Sim claro que podemos, ás 13:00 certo, onde? \n\n 13:45:00";
        chatMessage4.Date = CommonMethods.getCurrentDate();
        chatMessage4.Time = CommonMethods.getCurrentTime();
        chatMessage4.isMine = false;
        msg_edittext.setText("");
        chatAdapter.add(chatMessage4);
        chatAdapter.notifyDataSetChanged();

        ChatMessage chatMessage5 = new ChatMessage(user1, user2,
                "", "" + random.nextInt(1000), true);

        chatMessage5.setMsgID();
        chatMessage5.body = "No meu escritório da empresa mesmo \n\n você 14:07:40";
        chatMessage5.Date = CommonMethods.getCurrentDate();
        chatMessage5.Time = CommonMethods.getCurrentTime();
        chatMessage5.isMine = true;
        msg_edittext.setText("");
        chatAdapter.add(chatMessage5);
        chatAdapter.notifyDataSetChanged();

        ChatMessage chatMessage6 = new ChatMessage(user1, user2,
                "", "" + random.nextInt(1000), true);

        chatMessage6.setMsgID();
        chatMessage6.body = "certo, vai mais  alguém? \n\n 14:15:09";
        chatMessage6.Date = CommonMethods.getCurrentDate();
        chatMessage6.Time = CommonMethods.getCurrentTime();
        chatMessage6.isMine = false;
        msg_edittext.setText("");
        chatAdapter.add(chatMessage6);
        chatAdapter.notifyDataSetChanged();

        ChatMessage chatMessage7 = new ChatMessage(user1, user2,
                "", "" + random.nextInt(1000), true);

        chatMessage7.setMsgID();
        chatMessage7.body = "Sim, o Pedro tb vai \n\n você 14:30:01";
        chatMessage7.Date = CommonMethods.getCurrentDate();
        chatMessage7.Time = CommonMethods.getCurrentTime();
        chatMessage7.isMine = true;
        msg_edittext.setText("");
        chatAdapter.add(chatMessage7);
        chatAdapter.notifyDataSetChanged();

        ChatMessage chatMessage8 = new ChatMessage(user1, user2,
                "", "" + random.nextInt(1000), true);

        chatMessage8.setMsgID();
        chatMessage8.body = "Ah tah, ok então, marcado \n\n 14:35:00";
        chatMessage8.Date = CommonMethods.getCurrentDate();
        chatMessage8.Time = CommonMethods.getCurrentTime();
        chatMessage8.isMine = false;
        msg_edittext.setText("");
        chatAdapter.add(chatMessage8);
        chatAdapter.notifyDataSetChanged();

        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
    }

    //Método que carrega as mensagens
    public void sendTextMessage(View v) {
        String message = msg_edittext.getEditableText().toString();
        if (!message.equalsIgnoreCase("")) {

        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sendMessageButton:
                sendTextMessage(v);

        }
    }

}