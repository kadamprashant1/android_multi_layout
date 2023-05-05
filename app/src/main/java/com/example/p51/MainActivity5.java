package com.example.p51;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main5 );
        Button btn3=(Button)findViewById( R.id.button5 ) ;
        btn3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5=new Intent(MainActivity5.this, MainActivity.class);
                startActivity( int5 );
            }
        } );
    }
}