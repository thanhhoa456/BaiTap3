package com.example.loginregistrationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class IntroActivity extends AppCompatActivity {

    TextView tv;
    EditText etEmail, etPassword;
    ImageView send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //fullsceen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intro);
        tv = (TextView) findViewById(R.id.tvRegister);
        send = findViewById(R.id.btnLogin);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IntroActivity.this, SignUpActivity.class);
                startActivity(intent);            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy nội dung của email và password
                final String email = etEmail.getText().toString().trim();
                final String password = etPassword.getText().toString().trim();

                // Kiểm tra nếu email hoặc password rỗng
                if(email.isEmpty() || password.isEmpty()){
                    Toast.makeText(IntroActivity.this, "Vui lòng nhập đầy đủ Email và Password", Toast.LENGTH_SHORT).show();
                } else {
                    // Nếu đã nhập, chuyển trang
                    Intent intent = new Intent(IntroActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });


    }
}