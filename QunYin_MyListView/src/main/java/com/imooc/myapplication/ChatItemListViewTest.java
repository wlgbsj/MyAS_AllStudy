package com.imooc.myapplication;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ChatItemListViewTest extends Activity {

    private ListView mListView;
    private List<ChatItemListViewBean> data;
    private ChatItemListViewAdapter chatItemListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_item_main);

        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ChatItemListViewAdapter", "onClick");
                ChatItemListViewBean bean6 = new ChatItemListViewBean();
                bean6.setType(0);
                bean6.setIcon(BitmapFactory.decodeResource(getResources(),
                        R.drawable.in_icon));
                bean6.setText("See you");
                data.add(bean6);

                chatItemListViewAdapter.notifyDataSetChanged();
            }
        });

        mListView = (ListView) findViewById(R.id.listView_chat);
        ChatItemListViewBean bean1 = new ChatItemListViewBean();
        bean1.setType(0);
        bean1.setIcon(BitmapFactory.decodeResource(getResources(),
                R.drawable.in_icon));
        bean1.setText("Hello how are you?" +
                "Hello how are you?" +
                "Hello how are you?");

        ChatItemListViewBean bean2 = new ChatItemListViewBean();
        bean2.setType(1);
        bean2.setIcon(BitmapFactory.decodeResource(getResources(),
                R.drawable.ic_launcher));
        bean2.setText("Fine thank you, and you?");

        ChatItemListViewBean bean3 = new ChatItemListViewBean();
        bean3.setType(0);
        bean3.setIcon(BitmapFactory.decodeResource(getResources(),
                R.drawable.in_icon));
        bean3.setText("I am fine too");

        ChatItemListViewBean bean4 = new ChatItemListViewBean();
        bean4.setType(1);
        bean4.setIcon(BitmapFactory.decodeResource(getResources(),
                R.drawable.ic_launcher));
        bean4.setText("Bye bye");

        ChatItemListViewBean bean5 = new ChatItemListViewBean();
        bean5.setType(0);
        bean5.setIcon(BitmapFactory.decodeResource(getResources(),
                R.drawable.in_icon));
        bean5.setText("See you");



        data = new ArrayList<ChatItemListViewBean>();
        data.add(bean1);
        data.add(bean2);
        data.add(bean3);
        data.add(bean4);
        data.add(bean5);
        chatItemListViewAdapter = new ChatItemListViewAdapter(this, data);
        mListView.setAdapter(chatItemListViewAdapter);

    }
}
