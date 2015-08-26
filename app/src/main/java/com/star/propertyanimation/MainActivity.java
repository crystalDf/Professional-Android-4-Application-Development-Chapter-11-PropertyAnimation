package com.star.propertyanimation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView tmntleo = (ImageView) findViewById(R.id.tmntleo);

        ObjectAnimator moveIn = ObjectAnimator.ofFloat(tmntleo, "translationX", -500f, 0f);
        ObjectAnimator rotate = ObjectAnimator.ofFloat(tmntleo, "rotation", 0f, 360f);
        ObjectAnimator fadeInOut = ObjectAnimator.ofFloat(tmntleo, "alpha", 1f, 0f, 1f);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(rotate).with(fadeInOut).after(moveIn);
        animatorSet.setDuration(5000);
        animatorSet.start();

        ImageView tmntraph = (ImageView) findViewById(R.id.tmntraph);

        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.animator_file);
        animator.setTarget(tmntraph);
        animator.start();

    }


}
