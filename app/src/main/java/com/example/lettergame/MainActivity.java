package com.example.lettergame;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Letter a,e,i,o,u,empty,empty2;
    Handler handler;
    boolean animation_started = true;
    boolean firstLetter = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final int random = (int) (Math.random() * 3 + 3);
        empty = new Letter();
        handler = new Handler();
        if(random == 1){
            setContentView(R.layout.activity_main);
            empty.img = findViewById(R.id.emptyLetter2);
        }else if( random == 2){
            setContentView(R.layout.activity_main2);
            empty.img = findViewById(R.id.emptyLetter);
        }else{
            setContentView(R.layout.activity_main3);
            empty2 = new Letter();
            empty.img = findViewById(R.id.emptyLetter2);
            empty2.img = findViewById(R.id.emptyLetter3);
        }

        a = new Letter();
        e = new Letter();
        i = new Letter();
        o = new Letter();
        u = new Letter();

        a.img = findViewById(R.id.letterA);
        e.img = findViewById(R.id.letterE);
        i.img = findViewById(R.id.letterI);
        o.img = findViewById(R.id.letterO);
        u.img = findViewById(R.id.letterU);

        a.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empty.x = empty.img.getLeft();
                empty.y = empty.img.getTop();
                Toast.makeText(MainActivity.this,Integer.toString(random),Toast.LENGTH_SHORT).show();
                if(random == 3){
                    empty2.x = empty2.img.getLeft();
                    empty2.x = empty2.img.getTop();
                    if(animation_started && !firstLetter){
                        moveLetter(a,empty.x,empty.y);
                        animation_started = false;
                    }else{
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
                        if(!a.correct)
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
                if(random == 3){
                    empty2.x = empty2.img.getLeft();
                    empty2.x = empty2.img.getTop();
                    if(animation_started && !firstLetter){
                        moveLetter(e,empty.x,empty.y);
                        animation_started = false;
                    }else{
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
                if(random == 3){
                    empty2.x = empty2.img.getLeft();
                    empty2.x = empty2.img.getTop();
                    if(animation_started && !firstLetter){
                        moveLetter(i,empty.x,empty.y);
                        animation_started = false;
                    }else{
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
                if(random == 3){
                    empty2.x = empty2.img.getLeft();
                    empty2.x = empty2.img.getTop();
                    if(animation_started && !firstLetter){
                        moveLetter(o,empty.x,empty.y);
                        animation_started = false;
                    }else{
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
                if(random == 3){
                    empty2.x = empty2.img.getLeft();
                    empty2.x = empty2.img.getTop();
                    if(animation_started && !firstLetter){
                        moveLetter(u,empty.x,empty.y);
                        animation_started = false;
                    }else{
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
        ObjectAnimator moveX = ObjectAnimator.ofFloat(letter.img,"x", x);
        ObjectAnimator moveY = ObjectAnimator.ofFloat(letter.img,"y",y);
        AnimatorSet as = new AnimatorSet();
        as.playTogether(moveX,moveY);
        as.setDuration(2000);
        as.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation, boolean isReverse) {
                if(letter.img.getBackground().getConstantState() == empty.img.getBackground().getConstantState()){
                    letter.correct = true;
                    firstLetter = true;
                }else{
                    letter.correct = false;
                }
            }
        });
        as.start();
    }

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
