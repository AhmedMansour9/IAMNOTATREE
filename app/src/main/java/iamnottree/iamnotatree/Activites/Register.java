package iamnottree.iamnotatree.Activites;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.EditText;

import iamnottree.iamnotatree.R;

/**
 * Created by HP on 19/08/2018.
 */

public class Register extends Activity {
    EditText User_Name,Email,Phone,Password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        User_Name=findViewById(R.id.User_Name);
        Email=findViewById(R.id.Email);
        Phone=findViewById(R.id.Phone);
        Password=findViewById(R.id.Password);

    }

    public Boolean ValidUserName(){
        String User=User_Name.getText().toString().trim();
        if(User.isEmpty()||User.length()<5){
           User_Name.setError("ادخل اسم حسابك صحيح ");
            return false;
        }else if(!User.matches(("^[a-zA-Z\\s]*$"))){
            User_Name.setError("ادخل اسم حسابك صحيح ");
            return false;
        }
     return true;
    }

    private static boolean isValidEmail(String email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private Boolean ValidateEmail(){
        String EMAIL=Email.getText().toString().trim();
        if (EMAIL.isEmpty()||!isValidEmail(EMAIL)){
            Email.setError(("ادخل البريد الالكتروني "));

            return false;
        }else if(!EMAIL.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")){
            Email.setError(("ادخل البريد الالكتروني "));
            return false;
        }
        return true;
    }

    public Boolean ValidarePassword(){
        if(Phone.getText().toString().length()!=11){
            Phone.setError("ادخل رقم الموبايل صحيح");
            return false;
        }
        else {
            return true;
        }
    }
}
