package maitreya.checkprime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv=(TextView)findViewById(R.id.textView);
        Button b0=(Button)findViewById(R.id.b0);
        Button b1=(Button)findViewById(R.id.b1);
        Button b2=(Button)findViewById(R.id.b2);
        Button b3=(Button)findViewById(R.id.b3);
        Button b4=(Button)findViewById(R.id.b4);
        Button b5=(Button)findViewById(R.id.b5);
        Button b6=(Button)findViewById(R.id.b6);
        Button b7=(Button)findViewById(R.id.b7);
        Button b8=(Button)findViewById(R.id.b8);
        Button b9=(Button)findViewById(R.id.b9);
        Button del=(Button)findViewById(R.id.del);
        Button back=(Button)findViewById(R.id.bb);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n = n / 10;
                tv.setText((n == 0) ? "" : "" + n);
                checkPrime();
            }
        });
        del.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                n=0;
                tv.setText("");
                TextView fin=(TextView)findViewById(R.id.f);
                fin.setText("");
                Toast.makeText(MainActivity.this,"Cleared All",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primary(0,tv);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primary(1,tv);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primary(2,tv);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primary(3,tv);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primary(4,tv);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primary(5,tv);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primary(6,tv);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primary(7,tv);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primary(8,tv);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primary(9,tv);
            }
        });



    }
    void primary(int x, TextView tv) {
        if((n==214748364 && x>7) || n>214748364)
        {
            Toast.makeText(MainActivity.this,"Can not check numbers greater than 2147483647",Toast.LENGTH_LONG).show();
            return;
        }
        n=n*10+x;
        tv.setText(""+n);
        checkPrime();
    }
    void checkPrime() {

        TextView fin=(TextView)findViewById(R.id.f);
        if(n==0) {
            fin.setText("");
            return;
        }
        if(n==1) {
            fin.setText("UNIQUE");
            return;
        }
        for(int i=2;i<=n/2;i++) if(n%i==0) {
            fin.setText("NOT PRIME");
            return;
        }
        fin.setText("PRIME");
    }
}