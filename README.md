# DesignPattern
DesignPattern
整理一下23种设计模式，想起来一个搞一个。

设计模式的个人理解:
对于我们开发中经常涉及的模式，都是为了解决某一特殊并且常用的case，这里注意，还有常用两个字，比如单例，无处不在使用单例，那么我们必须在项目中实现单例，解决无用对象重复创建问题，
那么一些其他的模式呢，比如，我们为了以后的代码能更加松耦合，更加灵活易扩展，那么在架构搭建时，就会添加架构设计时想到的一些设计模式，实现设计模式很简单，那么当开发时，我们所
提前设计的设计模式应对的case没有出现，反而出现了另一种设计模式的case，但是代码已经写好，那么对于整体的RD以及后期新进的RD来说，那就得干仗了，所以呢，个人建议如果我们在开发时，如果
不使用设计模式可以解决的问题时，那就不使用设计模式，而在对应的case出现时，我们再去设计对应的设计模式，这样的代价就会小了很多。
最后，设计模式虽好，谨慎使用

行为型模式:
1.visitor Pattern 访问者模式，在数据结构基本不变的情况，同时对数据结构中的属性有不同的业务逻辑判断，也就是不同操作时，或者以后可能会对相关的操作进行扩展，这时可以使用
访问者模式，设计不同的访问者来进行业务逻辑的封装，demo中的，也可以添加身高和体重的同时判断的逻辑，这样，就可以又多了一种访问者，也就是访问者模式的优点，整理以上，访问者
模式的核心在于实例是持有访问者的实例，而被访问者方法调用时，那么调用的就是不同访问者的具体逻辑

2.command Pattern 命令模式，调用者与被调用者的解耦，demo中，是通过client-invoker-command-receiver，真正调用者经过三层封装才到了被调用者，这其中的三层就可以
各种不同的封装以及加各自的业务逻辑，以后添加某些请求命令，就增加对应的具体command实现，大大的降低耦合。
