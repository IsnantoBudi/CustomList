package com.gmail.isnantobudi0.customlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class list extends AppCompatActivity {
    ListView list;
    //TODO 1. membuat array untuk menampung data yang akan ditampilkan di list
    String[] maintitle ={
            "isnanto","bagas",
            "ganesha","agus",
            "lukas",
    };
    String[] subtitle ={
            "isnantobudi0@gmail.com","bagasantuk@gmail.com",
            "ganeshabintang@gmail.com","agustri@gmail.com",
            "lukastyas@gmail.com",
    };
    Integer[] imgid={
            R.drawable.facebook,R.drawable.instagram,
            R.drawable.twitter,R.drawable.whatsapp,
            R.drawable.youtube
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter((ListAdapter) adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
// TODO 2. menempatkan data dari array ke tampilan
                if(position == 0) {
//code specific to first list item
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 1) {
//code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 2) {
                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {
                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
