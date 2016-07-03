package college.tomerbu.edu.intentdemos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvUserName = (TextView) findViewById(R.id.tvUserName);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("email");
        if (userName!=null){
            tvUserName.setText("Hello, " + userName);
        }
    }
}
