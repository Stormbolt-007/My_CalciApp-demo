package com.example.asus.mycalciapp_demo;

import android.speech.tts.TextToSpeech;
import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b21;
    EditText e1,e2;
    TextView t1;
    TextToSpeech ts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);
        b11=(Button)findViewById(R.id.button11);
        b12=(Button)findViewById(R.id.button12);
        b13=(Button)findViewById(R.id.button13);
        b14=(Button)findViewById(R.id.button14);
        b15=(Button)findViewById(R.id.button15);
        b16=(Button)findViewById(R.id.button16);
        b17=(Button)findViewById(R.id.button17);
        b18=(Button)findViewById(R.id.button18);
        b19=(Button)findViewById(R.id.button19);
        b21=(Button)findViewById(R.id.button21);

        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        t1=(TextView)findViewById(R.id.textView);
        ts=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(1.0f);
            }
        });

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s1=e1.getText().toString();
                        e1.setText(s1+"1");
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s1=e1.getText().toString();
                        e1.setText(s1+"2");
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s1=e1.getText().toString();
                        e1.setText(s1+"3");
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s1=e1.getText().toString();
                        e1.setText(s1+"4");
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s1=e1.getText().toString();
                        e1.setText(s1+"5");
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s1=e1.getText().toString();
                        e1.setText(s1+"6");
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s1=e1.getText().toString();
                        e1.setText(s1+"7");
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s1=e1.getText().toString();
                        e1.setText(s1+"8");
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s1=e1.getText().toString();
                        e1.setText(s1+"9");
                    }
                });
                b10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s1=e1.getText().toString();
                        e1.setText(s1+"0");
                    }
                });
                b19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s1=e1.getText().toString();
                        e1.setText(s1+".");
                    }
                });
                b21.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s1=e1.getText().toString();
                        e1.setText(s1+"00");
                    }
                });
            }
        });

        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s2=e2.getText().toString();
                        e2.setText(s2+"1");
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s2=e2.getText().toString();
                        e2.setText(s2+"2");
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s2=e2.getText().toString();
                        e2.setText(s2+"3");
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s2=e2.getText().toString();
                        e2.setText(s2+"4");
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s2=e2.getText().toString();
                        e2.setText(s2+"5");
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s2=e2.getText().toString();
                        e2.setText(s2+"6");
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s2=e2.getText().toString();
                        e2.setText(s2+"7");
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s2=e2.getText().toString();
                        e2.setText(s2+"8");
                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s2=e2.getText().toString();
                        e2.setText(s2+"9");
                    }
                });
                b10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s2=e2.getText().toString();
                        e2.setText(s2+"0");
                    }
                });
                b19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s2=e2.getText().toString();
                        e2.setText(s2+".");
                    }
                });
                b21.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s2=e2.getText().toString();
                        e2.setText(s2+"00");
                    }
                });
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                e1.setText("");
                String s2=e2.getText().toString();
                e2.setText("");
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1+f2;
                String s3= Float.toString(f3);
                t1.setText(s3);
                ts.speak("On adding we get"+s3, TextToSpeech.QUEUE_FLUSH,null);

                Toast.makeText(MainActivity.this, "The answer is : "+s3, Toast.LENGTH_SHORT).show();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float f3 = f1 - f2;
                String s3 = Float.toString(f3);
                t1.setText(s3);
                ts.speak("On subtracting we get" + s3, TextToSpeech.QUEUE_FLUSH, null);

                Toast.makeText(MainActivity.this, "The answer is : " + s3, Toast.LENGTH_SHORT).show();
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1*f2;
                String s3= Float.toString(f3);
                t1.setText(s3);
                ts.speak("On multiplying we get"+s3, TextToSpeech.QUEUE_FLUSH,null);

                Toast.makeText(MainActivity.this, "The answer is : "+s3, Toast.LENGTH_SHORT).show();
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1/f2;
                String s3= Float.toString(f3);
                t1.setText(s3);
                ts.speak("On dividing we get"+s3, TextToSpeech.QUEUE_FLUSH,null);

                Toast.makeText(MainActivity.this, "The answer is : "+s3, Toast.LENGTH_SHORT).show();
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                double i1=Float.parseFloat(s1);
                double i2=Math.sin(Math.toRadians(i1));
                String s3= Float.toString((float) i2);
                t1.setText(s3);
                ts.speak("sin theta is"+s3, TextToSpeech.QUEUE_FLUSH,null);

                Toast.makeText(MainActivity.this, "The answer is : "+s3, Toast.LENGTH_SHORT).show();
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                double i1=Float.parseFloat(s1);
                double i2=Math.cos(Math.toRadians(i1));
                String s3= Float.toString((float) i2);
                t1.setText(s3);
                ts.speak("cos theta is"+s3, TextToSpeech.QUEUE_FLUSH,null);

                Toast.makeText(MainActivity.this, "The answer is : "+s3, Toast.LENGTH_SHORT).show();
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                double i1=Float.parseFloat(s1);
                double i2=Math.tan(Math.toRadians(i1));
                String s3= Float.toString((float) i2);
                t1.setText(s3);
                ts.speak("tan theta is"+s3, TextToSpeech.QUEUE_FLUSH,null);

                Toast.makeText(MainActivity.this, "The answer is : "+s3, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
