package com.example.p51;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Button relative = (Button) findViewById( R.id.relativelayout );
        Button frame = (Button) findViewById( R.id.framelayout );
        Button table = (Button) findViewById( R.id.tablelayout );
        Button linear = (Button) findViewById( R.id.linearlayout );

        linear.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity5();
            }
        } );
        table.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity4();
            }
        } );
        frame.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity3();
            }
        } );
        relative.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
        } );
    }

    public void openactivity5(){
        Intent int5= new Intent(this, MainActivity5.class);
        startActivity( int5 );
    }
    public void openactivity4(){
        Intent int4=new Intent(this, MainActivity4.class);
        startActivity( int4 );
    }
    public void openactivity3(){
        Intent int2=new Intent(this, MainActivity3.class);
        startActivity( int2 );
    }
    public void openactivity2(){
        Intent int1= new Intent(this, Activity_two.class);
        startActivity( int1 );
    }


}