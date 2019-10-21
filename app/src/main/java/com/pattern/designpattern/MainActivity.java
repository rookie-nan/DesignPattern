package com.pattern.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.pattern.designpattern.element.Element;
import com.pattern.designpattern.element.Man;
import com.pattern.designpattern.element.Women;
import com.pattern.designpattern.visit.HeightVisitor;
import com.pattern.designpattern.visit.WeightVisitor;

/**
 * 访问者模式
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener, CallBackListener {

    private ActionManager actionManager;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt_height).setOnClickListener(this);
        findViewById(R.id.bt_weight).setOnClickListener(this);
        tvResult = findViewById(R.id.tv_result);
        initData();
    }

    private void initData() {
        actionManager = new ActionManager();
        Element element1 = new Man("张三", 210, 310);
        Element element2 = new Man("李四", 182, 280);
        Element element3 = new Women("赵五", 210, 280);
        Element element4 = new Women("陈六", 185, 290);
        actionManager.addElement(element1);
        actionManager.addElement(element2);
        actionManager.addElement(element3);
        actionManager.addElement(element4);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_height:
                HeightVisitor heightVisitor = new HeightVisitor(this);
                actionManager.action(heightVisitor);
                break;
            case R.id.bt_weight:
                WeightVisitor weightVisitor = new WeightVisitor(this);
                actionManager.action(weightVisitor);
                break;
            default:
                break;
        }
    }

    @Override
    public void OnCallBackResult(String result) {
        tvResult.setText(result);
    }
}
