package com.pattern.designpattern;

import com.pattern.designpattern.element.Element;
import com.pattern.designpattern.visit.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 业务执行者
 */
public class ActionManager {
    public List<Element> list = new ArrayList<>();

    public void addElement(Element element) {
        list.add(element);
    }

    public void action(Visitor visitor) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).isVisited(visitor);
        }
    }
}
