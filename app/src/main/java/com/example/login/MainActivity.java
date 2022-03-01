package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState){
        EditText etPassword,etUsername;
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //创建初始化对象
            etUsername = findViewById(R.id.editId1);
            etPassword = findViewById(R.id.editId2);
            Button btnLogin = findViewById(R.id.button);
            TextView txtView1=findViewById(R.id.textView1);
            TextView txtView2=findViewById(R.id.textView2);
            //事件监听
            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });
            txtView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            txtView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //获取输入的用户名和密码
                    String username = etUsername.getText().toString();
                    String password = etPassword.getText().toString();
                    //检查用户名或密码是否为空
                    if(TextUtils.isEmpty(username)||TextUtils.isEmpty(password)){
                        Toast.makeText(MainActivity.this,"用户名或密码不能为空",Toast.LENGTH_SHORT).show();
                    }else{  //弹框显示输入的用户名和密码字符串
                        Toast.makeText(MainActivity.this,"用户名："+username+"，密码："+password,Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
