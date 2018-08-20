package iamnottree.iamnotatree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import iamnottree.iamnotatree.Activites.Firslogin;

public class MainActivity extends AppCompatActivity {
    TextView Register,Textlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Register=findViewById(R.id.TextRegister);
        Textlogin=findViewById(R.id.Textlogin);

        Go_to_Register();
        Go_to_Login();


    }
    public void Go_to_Register(){
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, iamnottree.iamnotatree.Activites.Register.class));
            }
        });
    }
    public void Go_to_Login(){
        Textlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Firslogin.class));
            }
        });
    }
}
