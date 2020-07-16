package com.example.jeux_memoire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class principale extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnHelp;
    Button btnAboutBack;



    Button btnApprendre;

    RelativeLayout rlContentSetting,rlContenthelp;

    Animation animDown ;
    Animation animUp ;



    boolean isClicked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principale);
        btnHelp = (ImageButton)findViewById(R.id.helpBtn);
        btnAboutBack = (Button)findViewById(R.id.btnAboutBack);





        btnApprendre = (Button)findViewById(R.id.apprendre);

        rlContentSetting = (RelativeLayout)findViewById(R.id.ltSettings);
        rlContenthelp = (RelativeLayout)findViewById(R.id.ltAbout);


        animDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.in);
        animUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.out);



        btnHelp.setOnClickListener(this);
        btnAboutBack.setOnClickListener(this);




        btnApprendre.setOnClickListener(this);




        //1

    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        isClicked = false;
        super.onResume();
    }

    /* (non-Javadoc)
     * @see android.view.View.OnClickListener#onClick(android.view.View)
     */
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        if (isClicked) {
            return;
        }else{
            isClicked = true;
        }


        rlContentSetting.clearAnimation();
    if (v==btnApprendre ) {
            Intent i = new Intent( getApplicationContext(), Jouer.class);
            startActivity(i);
            isClicked = false;
        }
        else if (v==btnHelp ) {

            rlContenthelp.setVisibility(View.VISIBLE);
            animDown.setAnimationListener(new Animation.AnimationListener() {

                @Override
                public void onAnimationStart(Animation animation) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    // TODO Auto-generated method stub
                    isClicked = false;
                }
            });
            rlContenthelp.startAnimation(animDown);
        }else if (v==btnAboutBack ) {
            animUp.setAnimationListener(new Animation.AnimationListener() {

                @Override
                public void onAnimationStart(Animation animation) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    // TODO Auto-generated method stub
                    rlContenthelp.setVisibility(View.GONE);
                    isClicked = false;
                }
            });
            rlContenthelp.startAnimation(animUp);
        }
    }


}
