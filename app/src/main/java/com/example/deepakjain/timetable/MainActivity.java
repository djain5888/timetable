
package com.example.deepakjain.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView table;
    public final void tableconstruct (int temp)
    {
        ArrayList<String> t1=new ArrayList<String>();
        for(int i=1;i<=10;i++)
        {
            int val=i*temp;
            String s=Integer.toString(temp);
            String a1=s+" x"+i+" ="+val;
            t1.add((a1));
        }
        ArrayAdapter<String> a1=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,t1);
        table.setAdapter(a1);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SeekBar seek=findViewById(R.id.seekBar);
         table=findViewById(R.id.list);


        seek.setMax(20);
        seek.setProgress(10);
        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                int min =1;
                int tablevalue=1;
                if(progress<min)
                {
                seek.setProgress(min);
                }
                else
                {tablevalue=progress;}
                tableconstruct(tablevalue);
                //Log.i("value of a",Integer.toString(progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
