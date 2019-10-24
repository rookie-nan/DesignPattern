package com.pattern.command;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CustomCallBack {

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt_invoke).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Receiver receiver = new Receiver();
                Invoker invoker = new Invoker(MainActivity.this);
                invoker.setCommand(new CustomCommand(receiver));
                invoker.invoke();
            }
        });
        tvResult = findViewById(R.id.tv_result);
    }

    @Override
    public void printSomeThing() {
        tvResult.setText("经过业务逻辑后，输出");
    }
}
