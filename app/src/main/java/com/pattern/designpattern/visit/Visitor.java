package com.pattern.designpattern.visit;

import com.pattern.designpattern.element.Man;
import com.pattern.designpattern.element.Women;

/**
 * 访问者行为接口
 * 参数:具体访问对象的实例
 * 这种模式的优点是为了应付数据类中的属性几乎不会变化，但是根据属性进行的业务操作变化较多，
 * 如果要扩展对应的操作，仅仅需要实现当前接口，对属性进行个性化处理即可
 */
public interface Visitor {

    void visit(Man man);

    void visit(Women women);

}
