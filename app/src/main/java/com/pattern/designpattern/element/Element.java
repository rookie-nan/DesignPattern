package com.pattern.designpattern.element;

import com.pattern.designpattern.visit.Visitor;


/**
 * 对象行为接口，接收访问者实例
 */
public interface Element {

    void isVisited(Visitor visitor);

}
