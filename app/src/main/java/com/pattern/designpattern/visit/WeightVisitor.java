package com.pattern.designpattern.visit;

import com.pattern.designpattern.CallBackListener;
import com.pattern.designpattern.element.Man;
import com.pattern.designpattern.element.Women;

/**
 * 体重访问者:进行体重的逻辑判断并且输出
 * 这里的visit参数为数据类实例，获取到对应实例的数据进行业务逻辑处理
 */
public class WeightVisitor implements Visitor {
    private final CallBackListener mCallBackListener;
    private String result = "";
    private int currentIndex = 0;

    public WeightVisitor(CallBackListener callBackListener) {
        mCallBackListener = callBackListener;
    }

    @Override
    public void visit(Man man) {
        currentIndex++;
        if (man.weight < 300) {
            result = result + "男人平均体重300," + man.name + "你才" + man.weight + ",赶紧给我吃肉长膘去~~~\n";
        } else {
            result = result + "男人平均体重300,卧槽牛逼" + man.name + "都干到" + man.weight + "了\n";
        }
        isDone(currentIndex);
    }

    @Override
    public void visit(Women women) {
        currentIndex++;
        if (women.weight < 300) {
            result = result + "女人平均体重300," + women.name + "你才" + women.weight + ",赶紧给我吃肉长膘去~~~\n";
        } else {
            result = result + "女人平均体重300,卧槽牛逼" + women.name + "都干到" + women.weight + "了\n";
        }
        isDone(currentIndex);
    }

    private void isDone(int index) {
        if (index == 4) {
            mCallBackListener.OnCallBackResult(result);
        }
    }
}
