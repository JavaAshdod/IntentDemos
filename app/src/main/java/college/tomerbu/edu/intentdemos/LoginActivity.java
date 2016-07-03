package college.tomerbu.edu.intentdemos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText etEmail, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
    }

    public void login(View view) {
        if (!isEmailValid() || !isPasswordValid()){return;}
        Intent intent = new Intent(this, MainActivity.class);

        //optionally pass some extra data - key value pairs
        intent.putExtra("email", etEmail.getText().toString());
        //intent.putExtra("fromWhere", getClass().getSimpleName());
        //intent.putExtra("password", etPassword.getText().toString());

        //start the activity using
        startActivity(intent);
    }

    private boolean isPasswordValid() {
        boolean isPasswordValid =  etPassword.getText().toString().length()>=6;
        if (!isPasswordValid)
            etPassword.setError(getString(R.string.et_password_error_text));
        return isPasswordValid;
    }

    private boolean isEmailValid() {
        boolean isEmailValid =  etEmail.getText().toString().contains("@");
        if (!isEmailValid){
            etEmail.setError(getString(R.string.et_email_error_text));
        }

        return isEmailValid;
    }

    public void register(View view) {

    }
}
