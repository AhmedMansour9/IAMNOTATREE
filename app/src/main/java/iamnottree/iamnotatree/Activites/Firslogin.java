package iamnottree.iamnotatree.Activites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import iamnottree.iamnotatree.R;

/**
 * Created by HP on 20/08/2018.
 */

public class Firslogin extends Activity {
    TextView seclogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstlogin);
        seclogin=findViewById(R.id.seclogin);
        seclogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Firslogin.this, Login.class));
            }
        });

    }
}
