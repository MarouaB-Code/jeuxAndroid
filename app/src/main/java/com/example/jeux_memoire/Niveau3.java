package com.example.jeux_memoire;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class Niveau3 extends AppCompatActivity {
    TextView tv_p1, tv_p2;
    ImageView iv_1, iv_2,iv_3, iv_4,iv_5, iv_6,iv_7, iv_8,iv_9, iv_10,iv_11, iv_12;


    Integer[] cardArray= {101,102,103,104,105,106, 201,202,203,204,205,206};

    int image101, image102, image103 , image104, image105, image106,
            image201, image202, image203 , image204, image205, image206;

    int firstCard, secondCard;
    int clikedfirst, clikedsecond;
    int cardnumber=1;
    int turn= 1;

    int CPuPoint =0; int PlayerPoint=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveau3);

        tv_p1= findViewById(R.id.tv_p1);
        tv_p2= findViewById(R.id.tv_p2);

        iv_1= findViewById(R.id.imageView10);
        iv_2= findViewById(R.id.imageView11);
        iv_3= findViewById(R.id.imageView12);
        iv_4= findViewById(R.id.imageV4);
        iv_5= findViewById(R.id.imageV5);
        iv_6= findViewById(R.id.imageV6);
        iv_7= findViewById(R.id.imageV7);
        iv_8= findViewById(R.id.imageV8);
        iv_9= findViewById(R.id.imageV9);
        iv_10= findViewById(R.id.imageV10);
        iv_11= findViewById(R.id.imageV11);
        iv_12= findViewById(R.id.imageV12);


        iv_1.setTag("0");
        iv_2.setTag("1");
        iv_3.setTag("2");
        iv_4.setTag("3");
        iv_5.setTag("4");
        iv_6.setTag("5");
        iv_7.setTag("6");
        iv_8.setTag("7");
        iv_9.setTag("8");
        iv_10.setTag("9");
        iv_11.setTag("10");
        iv_12.setTag("11");

        frontOfCardRessource();
        Collections.shuffle(Arrays.asList(cardArray));
        tv_p2.setTextColor(Color.GRAY);

        iv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard= Integer.parseInt((String)  view.getTag());
                doStuff(iv_1,theCard);

            }
        });

        iv_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard= Integer.parseInt((String)  view.getTag());
                doStuff(iv_2,theCard);
            }
        });

        iv_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard= Integer.parseInt((String)  view.getTag());
                doStuff(iv_3,theCard);
            }
        });
        iv_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard= Integer.parseInt((String)  view.getTag());
                doStuff(iv_4,theCard);
            }
        });
        iv_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard= Integer.parseInt((String)  view.getTag());
                doStuff(iv_5,theCard);
            }
        });
        iv_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard= Integer.parseInt((String)  view.getTag());
                doStuff(iv_6,theCard);
            }
        });
        iv_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard= Integer.parseInt((String)  view.getTag());
                doStuff(iv_7,theCard);
            }
        });
        iv_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard= Integer.parseInt((String)  view.getTag());
                doStuff(iv_8,theCard);
            }
        });
        iv_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard= Integer.parseInt((String)  view.getTag());
                doStuff(iv_9,theCard);
            }
        });
        iv_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard= Integer.parseInt((String)  view.getTag());
                doStuff(iv_10,theCard);
            }
        });
        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard= Integer.parseInt((String)  view.getTag());
                doStuff(iv_11,theCard);
            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard= Integer.parseInt((String)  view.getTag());
                doStuff(iv_12,theCard);
            }
        });

    }

    private void doStuff(ImageView iv, int card) {

        if (cardArray[card] == 101) {
            iv.setImageResource(image101);
        } else if (cardArray[card] == 102) {
            iv.setImageResource(image102);
        } else if (cardArray[card] == 103) {
            iv.setImageResource(image103);
        } else if (cardArray[card] == 104) {
            iv.setImageResource(image104);
        } else if (cardArray[card] == 105) {
            iv.setImageResource(image105);
        } else if (cardArray[card] == 106) {
            iv.setImageResource(image106);
        } else if (cardArray[card] == 201) {
            iv.setImageResource(image201);
        } else if (cardArray[card] == 202) {
            iv.setImageResource(image202);
        } else if (cardArray[card] == 203) {
            iv.setImageResource(image203);
        } else if (cardArray[card] == 204) {
            iv.setImageResource(image204);
        } else if (cardArray[card] == 205) {
            iv.setImageResource(image205);
        } else if (cardArray[card] == 206) {
            iv.setImageResource(image206);
        }

        if (cardnumber == 1) {
            firstCard = cardArray[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }

            cardnumber = 2;
            clikedfirst = card;
            iv.setEnabled(false);

        } else if (cardnumber == 2) {
            secondCard = cardArray[card];
            if (secondCard > 200) {
                secondCard = secondCard - 100;
            }

            cardnumber = 1;
            clikedsecond = card;
            iv_1.setEnabled(false);
            iv_2.setEnabled(false);
            iv_3.setEnabled(false);
            iv_4.setEnabled(false);
            iv_5.setEnabled(false);
            iv_6.setEnabled(false);
            iv_7.setEnabled(false);
            iv_8.setEnabled(false);
            iv_9.setEnabled(false);
            iv_10.setEnabled(false);
            iv_11.setEnabled(false);
            iv_12.setEnabled(false);

            Handler handler =new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 1000);
        }
    }

    private  void calculate() {

        if (firstCard == secondCard) {
            if (clikedfirst == 0) {
                iv_1.setVisibility(View.INVISIBLE);
            } else if (clikedfirst == 1) {
                iv_2.setVisibility(View.INVISIBLE);
            } else if (clikedfirst == 2) {
                iv_3.setVisibility(View.INVISIBLE);
            } else if (clikedfirst == 3) {
                iv_4.setVisibility(View.INVISIBLE);
            } else if (clikedfirst == 4) {
                iv_5.setVisibility(View.INVISIBLE);
            } else if (clikedfirst == 5) {
                iv_6.setVisibility(View.INVISIBLE);
            } else if (clikedfirst == 6) {
                iv_7.setVisibility(View.INVISIBLE);
            } else if (clikedfirst == 7) {
                iv_8.setVisibility(View.INVISIBLE);
            } else if (clikedfirst == 8) {
                iv_9.setVisibility(View.INVISIBLE);
            } else if (clikedfirst == 9) {
                iv_10.setVisibility(View.INVISIBLE);
            } else if (clikedfirst == 10) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clikedfirst == 11) {
                iv_12.setVisibility(View.INVISIBLE);
            }


            if (clikedsecond == 0) {
                iv_1.setVisibility(View.INVISIBLE);
            } else if (clikedsecond == 1) {
                iv_2.setVisibility(View.INVISIBLE);
            } else if (clikedsecond == 2) {
                iv_3.setVisibility(View.INVISIBLE);
            } else if (clikedsecond == 3) {
                iv_4.setVisibility(View.INVISIBLE);
            } else if (clikedsecond == 4) {
                iv_5.setVisibility(View.INVISIBLE);
            } else if (clikedsecond == 5) {
                iv_6.setVisibility(View.INVISIBLE);
            } else if (clikedsecond == 6) {
                iv_7.setVisibility(View.INVISIBLE);
            } else if (clikedsecond == 7) {
                iv_8.setVisibility(View.INVISIBLE);
            } else if (clikedsecond == 8) {
                iv_9.setVisibility(View.INVISIBLE);
            } else if (clikedsecond == 9) {
                iv_10.setVisibility(View.INVISIBLE);
            } else if (clikedsecond == 10) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clikedsecond == 11) {
                iv_12.setVisibility(View.INVISIBLE);
            }

            if(turn==1){
                PlayerPoint++;
                tv_p1.setText("Joueur N°1:" +PlayerPoint);
            } else if(turn==2){
                CPuPoint++;
                tv_p2.setText("Joueur N°2:" +CPuPoint);
            }

        } else {
            iv_1.setImageResource(R.drawable.inte);
            iv_2.setImageResource(R.drawable.inte);
            iv_3.setImageResource(R.drawable.inte);
            iv_4.setImageResource(R.drawable.inte);
            iv_5.setImageResource(R.drawable.inte);
            iv_6.setImageResource(R.drawable.inte);
            iv_7.setImageResource(R.drawable.inte);
            iv_8.setImageResource(R.drawable.inte);
            iv_9.setImageResource(R.drawable.inte);
            iv_10.setImageResource(R.drawable.inte);
            iv_11.setImageResource(R.drawable.inte);
            iv_12.setImageResource(R.drawable.inte);

            if(turn ==1){
                turn=2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            }else if (turn==2){
                turn=1;
                tv_p2.setTextColor(Color.GRAY);
                tv_p1.setTextColor(Color.BLACK);
            }
        }

        iv_1.setEnabled(true);
        iv_2.setEnabled(true);
        iv_3.setEnabled(true);
        iv_4.setEnabled(true);
        iv_5.setEnabled(true);
        iv_6.setEnabled(true);
        iv_7.setEnabled(true);
        iv_8.setEnabled(true);
        iv_9.setEnabled(true);
        iv_10.setEnabled(true);
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);

        checkEnd();
    }

    private void checkEnd(){

        if (iv_1.getVisibility()== View.INVISIBLE &&
                iv_1.getVisibility()== View.INVISIBLE &&
                iv_2.getVisibility()== View.INVISIBLE &&
                iv_3.getVisibility()== View.INVISIBLE &&
                iv_4.getVisibility()== View.INVISIBLE &&
                iv_5.getVisibility()== View.INVISIBLE &&
                iv_6.getVisibility()== View.INVISIBLE &&
                iv_7.getVisibility()== View.INVISIBLE &&
                iv_8.getVisibility()== View.INVISIBLE &&
                iv_9.getVisibility()== View.INVISIBLE &&
                iv_10.getVisibility()== View.INVISIBLE &&
                iv_11.getVisibility()== View.INVISIBLE &&
                iv_12.getVisibility()== View.INVISIBLE ){


            AlertDialog.Builder AlertdialogBuild= new AlertDialog.Builder(Niveau3.this);
            AlertdialogBuild.setCancelable(false);
            AlertdialogBuild.setTitle("TERMINER..!!!");
            AlertdialogBuild.setIcon(R.drawable.inte);
            AlertdialogBuild.setMessage("Le score du Joueur N°1:" +PlayerPoint + "  /6                Le joueur N° 2:"+ CPuPoint+"  /6");
            AlertdialogBuild.setPositiveButton("REJOUER", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent= new Intent(getApplicationContext(), Niveau3.class);
                    startActivity(intent);
                    finish();


                }
            })
                    .setNegativeButton("QUIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent= new Intent(getApplicationContext(),principale.class);
                            startActivity(intent);
                        }
                    });
            AlertDialog alertDialog= AlertdialogBuild.create();
            alertDialog.show();
        }
    }

    private void frontOfCardRessource() {
        image101= R.drawable.img17;
        image102=R.drawable.img16;
        image103=R.drawable.img20;
        image104= R.drawable.img8;
        image105=R.drawable.img2;
        image106=R.drawable.img5;

        image201= R.drawable.img17;
        image202=R.drawable.img16;
        image203=R.drawable.img20;
        image204= R.drawable.img8;
        image205=R.drawable.img2;
        image206=R.drawable.img5;

    }
}