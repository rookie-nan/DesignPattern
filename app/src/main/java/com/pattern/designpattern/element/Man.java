package com.pattern.designpattern.element;


import com.pattern.designpattern.visit.Visitor;

/**
 * 具体数据类:男人
 */
public class Man implements Element {

    public String name;
    public int height;
    public int weight;

    public Man(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void isVisited(Visitor visitor) {
        //this: 传入到访问者进行数据传递
        visitor.visit(this);
    }
}
