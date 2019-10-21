package com.pattern.designpattern.visit;

import com.pattern.designpattern.CallBackListener;
import com.pattern.designpattern.element.Man;
import com.pattern.designpattern.element.Women;

/**
 * 身高访问者:进行身高的逻辑判断并且输出
 * 这里的visit参数为数据类实例，获取到对应实例的数据进行业务逻辑处理
 */
public class HeightVisitor implements Visitor {

    private final CallBackListener mCallBackListener;
    private String result = "";
    private int currentIndex = 0;

    public HeightVisitor(CallBackListener callBackListener) {
        mCallBackListener = callBackListener;
    }

    @Override
    public void visit(Man man) {
        currentIndex++;
        if (man.height < 200) {
            result = result + "男人平均身高200," + man.name + "你才" + man.height + ",赶紧给我吃大骨头长个去~~~\n";
        } else {
            result = result + "男人平均身高200,卧槽牛逼" + man.name + "都干到" + man.height + "了\n";
        }
        isDone(currentIndex);
    }

    @Override
    public void visit(Women women) {
        currentIndex++;
        if (women.height < 200) {
            result = result + "女人平均身高200," + women.name + "你才" + women.height + ",赶紧给我吃大骨头长个去~~~\n";
        } else {
            result = result + "女人平均身高200,卧槽牛逼" + women.name + "都干到" + women.height + "了\n";
        }
        isDone(currentIndex);
    }

    private void isDone(int index) {
        if (index == 4) {
            mCallBackListener.OnCallBackResult(result);
        }
    }
}
