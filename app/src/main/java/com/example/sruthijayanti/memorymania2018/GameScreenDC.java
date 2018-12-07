package com.example.sruthijayanti.memorymania2018;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.media.MediaPlayer;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;


public class GameScreenDC extends AppCompatActivity {

    private Button button;
    private MediaPlayer dcTheme;

    ImageView iv_11, iv_12, iv_13, iv_14, iv_15, iv_16, iv_17, iv_18, iv_19, iv_20, iv_21, iv_22;

    //array for images
    Integer[] cardsArray = {301, 302, 303, 304, 305, 406, 401, 402, 403, 404, 405, 406};

    //images
    int image301, image302, image303, image304, image305, image306,
            image401, image402, image403, image404, image405, image406;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    private static final long START_TIME_IN_MILLIS = 40000;

    private TextView TextViewCountDown;
    private Button startButton;
    private CountDownTimer countDownTimer;
    private boolean timerRunning;
    private long timeLeftInMillis = START_TIME_IN_MILLIS;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen_dc);

        TextViewCountDown = findViewById(R.id.text_view_countdown);
        startButton = findViewById(R.id.button2);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timerRunning) {
                    startButton.setVisibility(View.INVISIBLE);
                } else {
                    startTimer();
                }
            }
        });

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainScreen();
            }
        });



        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);
        iv_15 = (ImageView) findViewById(R.id.iv_15);
        iv_16 = (ImageView) findViewById(R.id.iv_16);
        iv_17 = (ImageView) findViewById(R.id.iv_17);
        iv_18 = (ImageView) findViewById(R.id.iv_18);
        iv_19 = (ImageView) findViewById(R.id.iv_19);
        iv_20 = (ImageView) findViewById(R.id.iv_20);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_15.setTag("4");
        iv_16.setTag("5");
        iv_17.setTag("6");
        iv_18.setTag("7");
        iv_19.setTag("8");
        iv_20.setTag("9");
        iv_21.setTag("10");
        iv_22.setTag("11");

        //loads card images
        loadCardImages();

        //shuffle images
        Collections.shuffle(Arrays.asList(cardsArray));

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                checkMatch(iv_11, theCard);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                checkMatch(iv_12, theCard);
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                checkMatch(iv_13, theCard);
            }
        });

        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                checkMatch(iv_14, theCard);
            }
        });

        iv_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                checkMatch(iv_15, theCard);
            }
        });

        iv_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                checkMatch(iv_16, theCard);
            }
        });

        iv_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                checkMatch(iv_17, theCard);
            }
        });

        iv_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                checkMatch(iv_18, theCard);
            }
        });

        iv_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                checkMatch(iv_19, theCard);
            }
        });

        iv_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                checkMatch(iv_20, theCard);
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                checkMatch(iv_21, theCard);
            }
        });

        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                checkMatch(iv_22, theCard);
            }
        });

    }


    private void checkMatch(ImageView iv, int card) {
        //set correct image to imageview
        if (cardsArray[card] == 301) {
            iv.setImageResource(image301);
        } else if (cardsArray[card] == 302) {
            iv.setImageResource(image302);
        } else if (cardsArray[card] == 303) {
            iv.setImageResource(image303);
        } else if (cardsArray[card] == 304) {
            iv.setImageResource(image304);
        } else if (cardsArray[card] == 305) {
            iv.setImageResource(image305);
        } else if (cardsArray[card] == 306) {
            iv.setImageResource(image306);
        } else if (cardsArray[card] == 401) {
            iv.setImageResource(image401);
        } else if (cardsArray[card] == 402) {
            iv.setImageResource(image402);
        } else if (cardsArray[card] == 403) {
            iv.setImageResource(image403);
        } else if (cardsArray[card] == 404) {
            iv.setImageResource(image404);
        } else if (cardsArray[card] == 405) {
            iv.setImageResource(image405);
        } else if (cardsArray[card] == 406) {
            iv.setImageResource(image406);
        }

        //check which image is selected and save to temp var
        if (cardNumber == 1) {
            firstCard = cardsArray[card];
            if (firstCard > 400) {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        } else if (cardNumber == 2) {
            secondCard = cardsArray[card];
            if (secondCard > 400) {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_15.setEnabled(false);
            iv_16.setEnabled(false);
            iv_17.setEnabled(false);
            iv_18.setEnabled(false);
            iv_19.setEnabled(false);
            iv_20.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check if selected images are equal
                    calculate();
                }
            }, 1000);
        }
    }

    private void calculate() {
        //if images are equal, remove them
        if (firstCard == secondCard) {
            if (clickedFirst == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                iv_15.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                iv_16.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 6) {
                iv_17.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 7) {
                iv_18.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 8) {
                iv_19.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 9) {
                iv_20.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 10) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 11) {
                iv_22.setVisibility(View.INVISIBLE);
            }

            if (clickedSecond == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 4) {
                iv_15.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 5) {
                iv_16.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 6) {
                iv_17.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 7) {
                iv_18.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 8) {
                iv_19.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 9) {
                iv_20.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 10) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 11) {
                iv_22.setVisibility(View.INVISIBLE);
            }
        } else {
            iv_11.setImageResource(R.drawable.dcbackimage);
            iv_12.setImageResource(R.drawable.dcbackimage);
            iv_13.setImageResource(R.drawable.dcbackimage);
            iv_14.setImageResource(R.drawable.dcbackimage);
            iv_15.setImageResource(R.drawable.dcbackimage);
            iv_16.setImageResource(R.drawable.dcbackimage);
            iv_17.setImageResource(R.drawable.dcbackimage);
            iv_18.setImageResource(R.drawable.dcbackimage);
            iv_19.setImageResource(R.drawable.dcbackimage);
            iv_20.setImageResource(R.drawable.dcbackimage);
            iv_21.setImageResource(R.drawable.dcbackimage);
            iv_22.setImageResource(R.drawable.dcbackimage);
        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_15.setEnabled(true);
        iv_16.setEnabled(true);
        iv_17.setEnabled(true);
        iv_18.setEnabled(true);
        iv_19.setEnabled(true);
        iv_20.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);

        //check if game is over
        checkOver();

    }

    private void checkOver() {
        if (iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_15.getVisibility() == View.INVISIBLE &&
                iv_16.getVisibility() == View.INVISIBLE &&
                iv_17.getVisibility() == View.INVISIBLE &&
                iv_18.getVisibility() == View.INVISIBLE &&
                iv_19.getVisibility() == View.INVISIBLE &&
                iv_20.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE) {

            countDownTimer.cancel();
            timerRunning = false;


            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(GameScreenDC.this);
            alertDialogBuilder
                    .setMessage("You have completed this (Challen)ge!")
                    .setCancelable(false)
                    .setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), GameScreenDC.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void loadCardImages() {
        image301 = R.drawable.image301;
        image302 = R.drawable.image302;
        image303 = R.drawable.image303;
        image304 = R.drawable.image304;
        image305 = R.drawable.image305;
        image306 = R.drawable.image306;
        image401 = R.drawable.image401;
        image402 = R.drawable.image402;
        image403 = R.drawable.image403;
        image404 = R.drawable.image404;
        image405 = R.drawable.image405;
        image406 = R.drawable.image406;
    }
    public void openMainScreen() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    private void startTimer() {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timerRunning = false;
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(GameScreenDC.this);
                alertDialogBuilder
                        .setMessage("Sorry! You failed the (Challen)ge!")
                        .setCancelable(false)
                        .setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getApplicationContext(), GameScreenDC.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        }.start();

        timerRunning = true;
        startButton.setVisibility(View.INVISIBLE);
    }

   private void updateCountDownText() {
        int minutes = (int) (timeLeftInMillis / 1000) / 60;
        int seconds = (int) (timeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        TextViewCountDown.setText(timeLeftFormatted);
   }
}
