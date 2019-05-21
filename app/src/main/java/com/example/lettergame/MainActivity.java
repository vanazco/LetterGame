package com.example.lettergame;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Letter a,e,i,o,u,empty,empty2;
    Handler handler;
    boolean animation_started = true;
    boolean firstLetter = false;
    ImageView image;
    MediaPlayer[] mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //random para elegir el layout que saldrá
        final int random = (int) (Math.random() * 3 + 1);

        //Inicializamos algunas variables
        empty = new Letter();
        handler = new Handler();
        empty2 = new Letter();
        a = new Letter();
        e = new Letter();
        i = new Letter();
        o = new Letter();
        u = new Letter();
        mp = new MediaPlayer[3];

        mp[1] = MediaPlayer.create(MainActivity.this,R.raw.error_sound);
        mp[2] = MediaPlayer.create(MainActivity.this,R.raw.win_effect);

        //cargamos layout en función del random
        if(random == 1){
            setContentView(R.layout.activity_main);
            empty.img = findViewById(R.id.emptyLetter2);
        }else if( random == 2){
            setContentView(R.layout.activity_main2);
            empty.img = findViewById(R.id.emptyLetter);
        }else{
            setContentView(R.layout.activity_main3);
            empty.img = findViewById(R.id.emptyLetter2);
            empty2.img = findViewById(R.id.emptyLetter3);
        }

        //Asignamos las vocales
        a.img = findViewById(R.id.letterA);
        e.img = findViewById(R.id.letterE);
        i.img = findViewById(R.id.letterI);
        o.img = findViewById(R.id.letterO);
        u.img = findViewById(R.id.letterU);
        image = findViewById(R.id.imageView);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(random == 1){
                    mp[0] = MediaPlayer.create(MainActivity.this,R.raw.cat_sound);
                    mp[0].start();
                }else if(random == 2){
                    mp[0] = MediaPlayer.create(MainActivity.this,R.raw.bear_sound);
                    mp[0].start();
                }else{
                    mp[0] = MediaPlayer.create(MainActivity.this,R.raw.koala_sound);
                    mp[0].start();
                }
            }
        });

        //Definimos los Listeners
        a.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Asignamos el valor de X y Y de las vocales ocultas
                empty.x = empty.img.getLeft();
                empty.y = empty.img.getTop();
                if(random > 2){
                    empty2.x = empty2.img.getLeft();
                    empty2.y = empty2.img.getTop();
                    if(animation_started && !firstLetter){
                        moveLetter(a,empty.x,empty.y);
                        animation_started = false;
                    }else if(animation_started){
                        moveLetter(a,empty2.x,empty2.y);
                        animation_started = false;
                    }
                }else if(animation_started){
                    moveLetter(a,empty.x,empty.y);
                    animation_started = false;
                }

                a.x = a.img.getLeft();
                a.y = a.img.getTop();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(!a.correct && !firstLetter)
                            restorePosition(a,a.x,a.y);
                    }
                },2000);
            }
        });

        e.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empty.x = empty.img.getLeft();
                empty.y = empty.img.getTop();
                if(random > 2){
                    empty2.x = empty2.img.getLeft();
                    empty2.y = empty2.img.getTop();
                    if(animation_started && !firstLetter){
                        moveLetter(e,empty.x,empty.y);
                        animation_started = false;
                    }else if(animation_started){
                        moveLetter(e,empty2.x,empty2.y);
                        animation_started = false;
                    }
                }else if(animation_started){
                    moveLetter(e,empty.x,empty.y);
                    animation_started = false;
                }
                e.x = e.img.getLeft();
                e.y = e.img.getTop();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(!e.correct)
                            restorePosition(e,e.x,e.y);
                    }
                },2000);
            }
        });

        i.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empty.x = empty.img.getLeft();
                empty.y = empty.img.getTop();
                if(random > 2){
                    empty2.x = empty2.img.getLeft();
                    empty2.y = empty2.img.getTop();
                    if(animation_started && !firstLetter){
                        moveLetter(i,empty.x,empty.y);
                        animation_started = false;
                    }else if(animation_started){
                        moveLetter(i,empty2.x,empty2.y);
                        animation_started = false;
                    }
                }else if(animation_started){
                    moveLetter(i,empty.x,empty.y);
                    animation_started =false;
                }
                i.x = i.img.getLeft();
                i.y = i.img.getTop();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(!i.correct)
                            restorePosition(i,i.x,i.y);
                    }
                },2000);
            }
        });

        o.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empty.x = empty.img.getLeft();
                empty.y = empty.img.getTop();
                if(random > 2){
                    empty2.x = empty2.img.getLeft();
                    empty2.y = empty2.img.getTop();
                    if(animation_started && !firstLetter){
                        moveLetter(o,empty.x,empty.y);
                        animation_started = false;
                    }else if(animation_started){
                        moveLetter(o,empty2.x,empty2.y);
                        animation_started = false;
                    }
                }else if(animation_started){
                    moveLetter(o,empty.x,empty.y);
                    animation_started =false;
                }
                o.x = o.img.getLeft();
                o.y = o.img.getTop();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(!o.correct)
                            restorePosition(o,o.x,o.y);
                    }
                },2000);
            }
        });

        u.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empty.x = empty.img.getLeft();
                empty.y = empty.img.getTop();
                if(random > 2){
                    empty2.x = empty2.img.getLeft();
                    empty2.y = empty2.img.getTop();
                    if(animation_started && !firstLetter){
                        moveLetter(u,empty.x,empty.y);
                        animation_started = false;
                    }else if(animation_started){
                        moveLetter(u,empty2.x,empty2.y);
                        animation_started = false;
                    }
                }else if(animation_started){
                    moveLetter(u,empty.x,empty.y);
                    animation_started= false;
                }
                u.x = u.img.getLeft();
                u.y = u.img.getTop();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(!u.correct)
                            restorePosition(u,u.x,u.y);
                    }
                },2000);
            }
        });
    }

    public void moveLetter(final Letter letter, Integer x, Integer y) {
        //Creamos las animaciones
        ObjectAnimator moveX = ObjectAnimator.ofFloat(letter.img,"x", x);
        ObjectAnimator moveY = ObjectAnimator.ofFloat(letter.img,"y",y);
        //Los juntamos en un AnimatorSet
        AnimatorSet as = new AnimatorSet();
        as.playTogether(moveX,moveY);
        as.setDuration(2000);
        as.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation, boolean isReverse) {
                //Comprobamos si la imagen de la letra es igual a la oculta
                if(letter.img.getBackground().getConstantState() == empty.img.getBackground().getConstantState()){
                    letter.correct = true;
                    firstLetter = true;
                    mp[2].start();
                }else{
                    letter.correct = false;
                }
            }
        });
        as.start();
    }

    //Animacion de vuelta
    public void restorePosition(final Letter letter, Integer x, Integer y){
        ObjectAnimator moveX = ObjectAnimator.ofFloat(letter.img,"x", x);
        ObjectAnimator moveY = ObjectAnimator.ofFloat(letter.img,"y",y);
        AnimatorSet as = new AnimatorSet();
        as.playTogether(moveX,moveY);
        as.setDuration(2000);
        as.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
                mp[1].start();
                animation_started = true;
            }

            @Override
            public void onAnimationEnd(Animator animation, boolean isReverse) {
                letter.correct = false;
            }
        });
        as.start();
    }
}
