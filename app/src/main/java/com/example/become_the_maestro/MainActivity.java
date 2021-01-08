package com.example.become_the_maestro;

import androidx.appcompat.app.AppCompatActivity;

import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private SoundPool soundPool;

    private int c3,c3sharp,d3,d3sharp,e3,f3,f3sharp,g3,g3sharp,a3,a3sharp,b3;
    private int c4,c4sharp,d4,d4sharp,e4,f4,f4sharp,g4,g4sharp,a4,a4sharp,b4;
    private int c5,c5sharp,d5,d5sharp,e5,f5,f5sharp,g5,g5sharp,a5,a5sharp,b5;
    private int c6,c6sharp,d6,d6sharp,e6,f6,f6sharp,g6,g6sharp,a6,a6sharp,b6;
    private int c7,c7sharp,d7,d7sharp,e7,f7,f7sharp,g7,g7sharp,a7,a7sharp,b7;


    private HorizontalScrollView scrollView;

    private Button buttonC3;
    private Button buttonC3sharp;

    private Button buttonD3;
    private Button buttonD3sharp;

    private Button buttonE3;

    private Button buttonF3;
    private Button buttonF3sharp;

    private Button buttonG3;
    private Button buttonG3sharp;

    private Button buttonA3;
    private Button buttonA3sharp;

    private Button buttonB3;

    private Button buttonC4;
    private Button buttonC4sharp;

    private Button buttonD4;
    private Button buttonD4sharp;

    private Button buttonE4;

    private Button buttonF4;
    private Button buttonF4sharp;

    private Button buttonG4;
    private Button buttonG4sharp;

    private Button buttonA4;
    private Button buttonA4sharp;

    private Button buttonB4;

    private Button buttonC5;
    private Button buttonC5sharp;

    private Button buttonD5;
    private Button buttonD5sharp;

    private Button buttonE5;

    private Button buttonF5;
    private Button buttonF5sharp;

    private Button buttonG5;
    private Button buttonG5sharp;

    private Button buttonA5;
    private Button buttonA5sharp;

    private Button buttonB5;

    private Button buttonC6;
    private Button buttonC6sharp;

    private Button buttonD6;
    private Button buttonD6sharp;

    private Button buttonE6;

    private Button buttonF6;
    private Button buttonF6sharp;

    private Button buttonG6;
    private Button buttonG6sharp;

    private Button buttonA6;
    private Button buttonA6sharp;

    private Button buttonB6;

    private Button buttonC7;
    private Button buttonC7sharp;

    private Button buttonD7;
    private Button buttonD7sharp;

    private Button buttonE7;

    private Button buttonF7;
    private Button buttonF7sharp;

    private Button buttonG7;
    private Button buttonG7sharp;

    private Button buttonA7;
    private Button buttonA7sharp;

    private Button buttonB7;

    // variables for textviews

    private TextView tc3;
    private TextView td3;
    private TextView te3;
    private TextView tf3;
    private TextView tg3;
    private TextView ta3;
    private TextView tb3;

    private TextView tc4;
    private TextView td4;
    private TextView te4;
    private TextView tf4;
    private TextView tg4;
    private TextView ta4;
    private TextView tb4;

    private TextView tc5;
    private TextView td5;
    private TextView te5;
    private TextView tf5;
    private TextView tg5;
    private TextView ta5;
    private TextView tb5;

    private TextView tc6;
    private TextView td6;
    private TextView te6;
    private TextView tf6;
    private TextView tg6;
    private TextView ta6;
    private TextView tb6;

    private TextView tc7;
    private TextView td7;
    private TextView te7;
    private TextView tf7;
    private TextView tg7;
    private TextView ta7;
    private TextView tb7;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Init scroll view
        scrollView = findViewById(R.id.scrollView);

        // Method for all PianoKey buttons
        initializeAllPianoKeys();

        // Method for all TextViews
        initializeTextViewLabelesOnPianoKeys();

        // code fore soundpool

        soundPool = new SoundPool.Builder()
                .setMaxStreams(6)
                .build();

        c3 = soundPool.load(this,R.raw.c3,1);
        c3sharp = soundPool.load(this,R.raw.c3sharp,1);
        d3 = soundPool.load(this,R.raw.d3,1);
        d3sharp = soundPool.load(this,R.raw.d3sharp,1);
        e3 = soundPool.load(this,R.raw.e3,1);
        f3 = soundPool.load(this,R.raw.f3,1);
        f3sharp = soundPool.load(this,R.raw.f3sharp,1);
        g3 = soundPool.load(this,R.raw.g3,1);
        g3sharp = soundPool.load(this,R.raw.g3sharp,1);
        a3 = soundPool.load(this,R.raw.a3,1);
        a3sharp = soundPool.load(this,R.raw.a3sharp,1);
        b3 = soundPool.load(this,R.raw.b3,1);

        c4 = soundPool.load(this,R.raw.c4,1);
        c4sharp = soundPool.load(this,R.raw.c4sharp,1);
        d4 = soundPool.load(this,R.raw.d4,1);
        d4sharp = soundPool.load(this,R.raw.d4sharp,1);
        e4 = soundPool.load(this,R.raw.e4,1);
        f4 = soundPool.load(this,R.raw.f4,1);
        f4sharp = soundPool.load(this,R.raw.f4sharp,1);
        g4 = soundPool.load(this,R.raw.g4,1);
        g4sharp = soundPool.load(this,R.raw.g4sharp,1);
        a4 = soundPool.load(this,R.raw.a4,1);
        a4sharp = soundPool.load(this,R.raw.a4sharp,1);
        b4 = soundPool.load(this,R.raw.b4,1);

        c5 = soundPool.load(this,R.raw.c5,1);
        c5sharp = soundPool.load(this,R.raw.c5sharp,1);
        d5 = soundPool.load(this,R.raw.d5,1);
        d5sharp = soundPool.load(this,R.raw.d5sharp,1);
        e5 = soundPool.load(this,R.raw.e5,1);
        f5 = soundPool.load(this,R.raw.f5,1);
        f5sharp = soundPool.load(this,R.raw.f5sharp,1);
        g5 = soundPool.load(this,R.raw.g5,1);
        g5sharp = soundPool.load(this,R.raw.g5sharp,1);
        a5 = soundPool.load(this,R.raw.a5,1);
        a5sharp = soundPool.load(this,R.raw.a5sharp,1);
        b5 = soundPool.load(this,R.raw.b5,1);

        c6 = soundPool.load(this,R.raw.c6,1);
        c6sharp = soundPool.load(this,R.raw.c6sharp,1);
        d6 = soundPool.load(this,R.raw.d6,1);
        d6sharp = soundPool.load(this,R.raw.d6sharp,1);
        e6 = soundPool.load(this,R.raw.e6,1);
        f6 = soundPool.load(this,R.raw.f6,1);
        f6sharp = soundPool.load(this,R.raw.f6sharp,1);
        g6 = soundPool.load(this,R.raw.g6,1);
        g6sharp = soundPool.load(this,R.raw.g6sharp,1);
        a6 = soundPool.load(this,R.raw.a6,1);
        a6sharp = soundPool.load(this,R.raw.a6sharp,1);
        b6 = soundPool.load(this,R.raw.b6,1);

        c7 = soundPool.load(this,R.raw.c7,1);
        c7sharp = soundPool.load(this,R.raw.c7sharp,1);
        d7 = soundPool.load(this,R.raw.d7,1);
        d7sharp = soundPool.load(this,R.raw.d7sharp,1);
        e7 = soundPool.load(this,R.raw.e7,1);
        f7 = soundPool.load(this,R.raw.f7,1);
        f7sharp = soundPool.load(this,R.raw.f7sharp,1);
        g7 = soundPool.load(this,R.raw.g7,1);
        g7sharp = soundPool.load(this,R.raw.g7sharp,1);
        a7 = soundPool.load(this,R.raw.a7,1);
        a7sharp = soundPool.load(this,R.raw.a7sharp,1);
        b7 = soundPool.load(this,R.raw.b7,1);





    }

    void initializeTextViewLabelesOnPianoKeys(){
        tc3 = (TextView) findViewById(R.id.tc3);
        tc3.setOnClickListener(this);
        td3 = (TextView) findViewById(R.id.td3);
        td3.setOnClickListener(this);
        te3 = (TextView) findViewById(R.id.te3);
        te3.setOnClickListener(this);
        tf3 = (TextView) findViewById(R.id.tf3);
        tf3.setOnClickListener(this);
        tg3 = (TextView) findViewById(R.id.tg3);
        tg3.setOnClickListener(this);
        ta3 = (TextView) findViewById(R.id.ta3);
        ta3.setOnClickListener(this);
        tb3 = (TextView) findViewById(R.id.tb3);
        tb3.setOnClickListener(this);

        tc4 = (TextView) findViewById(R.id.tc4);
        tc4.setOnClickListener(this);
        td4 = (TextView) findViewById(R.id.td4);
        td4.setOnClickListener(this);
        te4 = (TextView) findViewById(R.id.te4);
        te4.setOnClickListener(this);
        tf4 = (TextView) findViewById(R.id.tf4);
        tf4.setOnClickListener(this);
        tg4 = (TextView) findViewById(R.id.tg4);
        tg4.setOnClickListener(this);
        ta4 = (TextView) findViewById(R.id.ta4);
        ta4.setOnClickListener(this);
        tb4 = (TextView) findViewById(R.id.tb4);
        tb4.setOnClickListener(this);

        tc5 = (TextView) findViewById(R.id.tc5);
        tc5.setOnClickListener(this);
        td5 = (TextView) findViewById(R.id.td5);
        td5.setOnClickListener(this);
        te5 = (TextView) findViewById(R.id.te5);
        te5.setOnClickListener(this);
        tf5 = (TextView) findViewById(R.id.tf5);
        tf5.setOnClickListener(this);
        tg5 = (TextView) findViewById(R.id.tg5);
        tg5.setOnClickListener(this);
        ta5 = (TextView) findViewById(R.id.ta5);
        ta5.setOnClickListener(this);
        tb5 = (TextView) findViewById(R.id.tb5);
        tb5.setOnClickListener(this);

        tc6 = (TextView) findViewById(R.id.tc6);
        tc6.setOnClickListener(this);
        td6 = (TextView) findViewById(R.id.td6);
        td6.setOnClickListener(this);
        te6 = (TextView) findViewById(R.id.te6);
        te6.setOnClickListener(this);
        tf6 = (TextView) findViewById(R.id.tf6);
        tf6.setOnClickListener(this);
        tg6 = (TextView) findViewById(R.id.tg6);
        tg6.setOnClickListener(this);
        ta6 = (TextView) findViewById(R.id.ta6);
        ta6.setOnClickListener(this);
        tb6 = (TextView) findViewById(R.id.tb6);
        tb6.setOnClickListener(this);

        tc7 = (TextView) findViewById(R.id.tc7);
        tc7.setOnClickListener(this);
        td7 = (TextView) findViewById(R.id.td7);
        td7.setOnClickListener(this);
        te7 = (TextView) findViewById(R.id.te7);
        te7.setOnClickListener(this);
        tf7 = (TextView) findViewById(R.id.tf7);
        tf7.setOnClickListener(this);
        tg7 = (TextView) findViewById(R.id.tg7);
        tg7.setOnClickListener(this);
        ta7 = (TextView) findViewById(R.id.ta7);
        ta7.setOnClickListener(this);
        tb7 = (TextView) findViewById(R.id.tb7);
        tb7.setOnClickListener(this);
    }

    void initializeAllPianoKeys(){
        buttonC3 =(Button) findViewById(R.id.p1);
        buttonC3.setOnClickListener(this);
        buttonC3sharp = (Button) findViewById(R.id.b1);
        buttonC3sharp.setOnClickListener(this);
        buttonD3 =(Button) findViewById(R.id.p2);
        buttonD3.setOnClickListener(this);
        buttonD3sharp = (Button) findViewById(R.id.b2);
        buttonD3sharp.setOnClickListener(this);
        buttonE3 =(Button) findViewById(R.id.p3);
        buttonE3.setOnClickListener(this);
        buttonF3 =(Button) findViewById(R.id.p4);
        buttonF3.setOnClickListener(this);
        buttonF3sharp = (Button) findViewById(R.id.b3);
        buttonF3sharp.setOnClickListener(this);
        buttonG3 =(Button) findViewById(R.id.p5);
        buttonG3.setOnClickListener(this);
        buttonG3sharp = (Button) findViewById(R.id.b4);
        buttonG3sharp.setOnClickListener(this);
        buttonA3 =(Button) findViewById(R.id.p6);
        buttonA3.setOnClickListener(this);
        buttonA3sharp = (Button) findViewById(R.id.b5);
        buttonA3sharp.setOnClickListener(this);
        buttonB3 =(Button) findViewById(R.id.p7);
        buttonB3.setOnClickListener(this);

        buttonC4 =(Button) findViewById(R.id.p8);
        buttonC4.setOnClickListener(this);
        buttonC4sharp = (Button) findViewById(R.id.b6);
        buttonC4sharp.setOnClickListener(this);
        buttonD4 =(Button) findViewById(R.id.p9);
        buttonD4.setOnClickListener(this);
        buttonD4sharp = (Button) findViewById(R.id.b7);
        buttonD4sharp.setOnClickListener(this);
        buttonE4 =(Button) findViewById(R.id.p10);
        buttonE4.setOnClickListener(this);
        buttonF4 =(Button) findViewById(R.id.p11);
        buttonF4.setOnClickListener(this);
        buttonF4sharp = (Button) findViewById(R.id.b8);
        buttonF4sharp.setOnClickListener(this);
        buttonG4 =(Button) findViewById(R.id.p12);
        buttonG4.setOnClickListener(this);
        buttonG4sharp = (Button) findViewById(R.id.b9);
        buttonG4sharp.setOnClickListener(this);
        buttonA4 =(Button) findViewById(R.id.p13);
        buttonA4.setOnClickListener(this);
        buttonA4sharp = (Button) findViewById(R.id.b10);
        buttonA4sharp.setOnClickListener(this);
        buttonB4 =(Button) findViewById(R.id.p14);
        buttonB4.setOnClickListener(this);

        buttonC5 =(Button) findViewById(R.id.p15);
        buttonC5.setOnClickListener(this);
        buttonC5sharp = (Button) findViewById(R.id.b11);
        buttonC5sharp.setOnClickListener(this);
        buttonD5 =(Button) findViewById(R.id.p16);
        buttonD5.setOnClickListener(this);
        buttonD5sharp = (Button) findViewById(R.id.b12);
        buttonD5sharp.setOnClickListener(this);
        buttonE5 =(Button) findViewById(R.id.p17);
        buttonE5.setOnClickListener(this);
        buttonF5 =(Button) findViewById(R.id.p18);
        buttonF5.setOnClickListener(this);
        buttonF5sharp = (Button) findViewById(R.id.b13);
        buttonF5sharp.setOnClickListener(this);
        buttonG5 =(Button) findViewById(R.id.p19);
        buttonG5.setOnClickListener(this);
        buttonG5sharp = (Button) findViewById(R.id.b14);
        buttonG5sharp.setOnClickListener(this);
        buttonA5 =(Button) findViewById(R.id.p20);
        buttonA5.setOnClickListener(this);
        buttonA5sharp = (Button) findViewById(R.id.b15);
        buttonA5sharp.setOnClickListener(this);
        buttonB5 =(Button) findViewById(R.id.p21);
        buttonB5.setOnClickListener(this);

        buttonC6 =(Button) findViewById(R.id.p22);
        buttonC6.setOnClickListener(this);
        buttonC6sharp = (Button) findViewById(R.id.b16);
        buttonC6sharp.setOnClickListener(this);
        buttonD6 =(Button) findViewById(R.id.p23);
        buttonD6.setOnClickListener(this);
        buttonD6sharp = (Button) findViewById(R.id.b17);
        buttonD6sharp.setOnClickListener(this);
        buttonE6 =(Button) findViewById(R.id.p24);
        buttonE6.setOnClickListener(this);
        buttonF6 =(Button) findViewById(R.id.p25);
        buttonF6.setOnClickListener(this);
        buttonF6sharp = (Button) findViewById(R.id.b18);
        buttonF6sharp.setOnClickListener(this);
        buttonG6 =(Button) findViewById(R.id.p26);
        buttonG6.setOnClickListener(this);
        buttonG6sharp = (Button) findViewById(R.id.b19);
        buttonG6sharp.setOnClickListener(this);
        buttonA6 =(Button) findViewById(R.id.p27);
        buttonA6.setOnClickListener(this);
        buttonA6sharp = (Button) findViewById(R.id.b20);
        buttonA6sharp.setOnClickListener(this);
        buttonB6 =(Button) findViewById(R.id.p28);
        buttonB6.setOnClickListener(this);

        buttonC7 =(Button) findViewById(R.id.p29);
        buttonC7.setOnClickListener(this);
        buttonC7sharp = (Button) findViewById(R.id.b21);
        buttonC7sharp.setOnClickListener(this);
        buttonD7 =(Button) findViewById(R.id.p30);
        buttonD7.setOnClickListener(this);
        buttonD7sharp = (Button) findViewById(R.id.b22);
        buttonD7sharp.setOnClickListener(this);
        buttonE7 =(Button) findViewById(R.id.p31);
        buttonE7.setOnClickListener(this);
        buttonF7 =(Button) findViewById(R.id.p32);
        buttonF7.setOnClickListener(this);
        buttonF7sharp = (Button) findViewById(R.id.b23);
        buttonF7sharp.setOnClickListener(this);
        buttonG7 =(Button) findViewById(R.id.p33);
        buttonG7.setOnClickListener(this);
        buttonG7sharp = (Button) findViewById(R.id.b24);
        buttonG7sharp.setOnClickListener(this);
        buttonA7 =(Button) findViewById(R.id.p34);
        buttonA7.setOnClickListener(this);
        buttonA7sharp = (Button) findViewById(R.id.b25);
        buttonA7sharp.setOnClickListener(this);
        buttonB7 =(Button) findViewById(R.id.p35);
        buttonB7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.tc3:
            case R.id.p1:
                soundPool.play(c3,1,1,0,0,1);
                break;

            case R.id.b1:
                soundPool.play(c3sharp,1,1,0,0,1);
                break;

            case R.id.p2:
                soundPool.play(d3,1,1,0,0,1);
                break;

            case R.id.b2:
                soundPool.play(d3sharp,1,1,0,0,1);
                break;

            case R.id.p3:
                soundPool.play(e3,1,1,0,0,1);
                break;

            case R.id.p4:
                soundPool.play(f3,1,1,0,0,1);
                break;

            case R.id.b3:
                soundPool.play(f3sharp,1,1,0,0,1);
                break;

            case R.id.p5:
                soundPool.play(g3,1,1,0,0,1);
                break;

            case R.id.b4:
                soundPool.play(g3sharp,1,1,0,0,1);
                break;

            case R.id.p6:
                soundPool.play(a3,1,1,0,0,1);
                break;

            case R.id.b5:
                soundPool.play(a3sharp,1,1,0,0,1);
                break;

            case R.id.p7:
                soundPool.play(b3,1,1,0,0,1);
                break;

            case R.id.p8:
                soundPool.play(c4,1,1,0,0,1);
                break;

            case R.id.b6:
                soundPool.play(c4sharp,1,1,0,0,1);
                break;

            case R.id.p9:
                soundPool.play(d4,1,1,0,0,1);
                break;

            case R.id.b7:
                soundPool.play(d4sharp,1,1,0,0,1);
                break;

            case R.id.p10:
                soundPool.play(e4,1,1,0,0,1);
                break;

            case R.id.p11:
                soundPool.play(f4,1,1,0,0,1);
                break;

            case R.id.b8:
                soundPool.play(f4sharp,1,1,0,0,1);
                break;

            case R.id.p12:
                soundPool.play(g4,1,1,0,0,1);
                break;

            case R.id.b9:
                soundPool.play(g4sharp,1,1,0,0,1);
                break;

            case R.id.p13:
                soundPool.play(a4,1,1,0,0,1);
                break;

            case R.id.b10:
                soundPool.play(a4sharp,1,1,0,0,1);
                break;

            case R.id.p14:
                soundPool.play(b4,1,1,0,0,1);
                break;

            case R.id.p15:
                soundPool.play(c5,1,1,0,0,1);
                break;

            case R.id.b11:
                soundPool.play(c5sharp,1,1,0,0,1);
                break;

            case R.id.p16:
                soundPool.play(d5,1,1,0,0,1);
                break;

            case R.id.b12:
                soundPool.play(d5sharp,1,1,0,0,1);
                break;

            case R.id.p17:
                soundPool.play(e5,1,1,0,0,1);
                break;

            case R.id.p18:
                soundPool.play(f5,1,1,0,0,1);
                break;

            case R.id.b13:
                soundPool.play(f5sharp,1,1,0,0,1);
                break;

            case R.id.p19:
                soundPool.play(g5,1,1,0,0,1);
                break;

            case R.id.b14:
                soundPool.play(g5sharp,1,1,0,0,1);
                break;

            case R.id.p20:
                soundPool.play(a5,1,1,0,0,1);
                break;

            case R.id.b15:
                soundPool.play(a5sharp,1,1,0,0,1);
                break;

            case R.id.p21:
                soundPool.play(b5,1,1,0,0,1);
                break;

            case R.id.p22:
                soundPool.play(c6,1,1,0,0,1);
                break;

            case R.id.b16:
                soundPool.play(c6sharp,1,1,0,0,1);
                break;

            case R.id.p23:
                soundPool.play(d6,1,1,0,0,1);
                break;

            case R.id.b17:
                soundPool.play(d6sharp,1,1,0,0,1);
                break;

            case R.id.p24:
                soundPool.play(e6,1,1,0,0,1);
                break;

            case R.id.p25:
                soundPool.play(f6,1,1,0,0,1);
                break;

            case R.id.b18:
                soundPool.play(f6sharp,1,1,0,0,1);
                break;

            case R.id.p26:
                soundPool.play(g6,1,1,0,0,1);
                break;

            case R.id.b19:
                soundPool.play(g6sharp,1,1,0,0,1);
                break;

            case R.id.p27:
                soundPool.play(a6,1,1,0,0,1);
                break;

            case R.id.b20:
                soundPool.play(a6sharp,1,1,0,0,1);
                break;

            case R.id.p28:
                soundPool.play(b6,1,1,0,0,1);
                break;

            case R.id.p29:
                soundPool.play(c7,1,1,0,0,1);
                break;

            case R.id.b21:
                soundPool.play(c7sharp,1,1,0,0,1);
                break;

            case R.id.p30:
                soundPool.play(d7,1,1,0,0,1);
                break;

            case R.id.b22:
                soundPool.play(d7sharp,1,1,0,0,1);
                break;

            case R.id.p31:
                soundPool.play(e7,1,1,0,0,1);
                break;

            case R.id.p32:
                soundPool.play(f7,1,1,0,0,1);
                break;

            case R.id.b23:
                soundPool.play(f7sharp,1,1,0,0,1);
                break;

            case R.id.p33:
                soundPool.play(g7,1,1,0,0,1);
                break;

            case R.id.b24:
                soundPool.play(g7sharp,1,1,0,0,1);
                break;

            case R.id.p34:
                soundPool.play(a7,1,1,0,0,1);
                break;

            case R.id.b25:
                soundPool.play(a7sharp,1,1,0,0,1);
                break;

            case R.id.p35:
                soundPool.play(b7,1,1,0,0,1);
                break;


        }

    }
}