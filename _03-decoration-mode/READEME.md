## 装饰模式

装饰模式（Decorator），动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。

### 结构图

![image-20231023233429938](https://cdn.jsdelivr.net/gh/vincent-nicky/image_store/blog/image-20231023233429938.png)

Component是定义一个对象接口，可以给这些对象动态地添加职责。ConcreteComponent是定义了一个具体的对象，也可以给这个对象添加一些职 责 。Decorator，装饰抽象类，继承了Component ，从 外 类 来 扩 展 Component类的功能，但对于Component来说，是无须知道Decorator的存在的。至于ConcreteDecorator就是具体的装饰对象，起到给Component添加职责的功能。

```java
//Component类
abstract class Component {
    public abstract void Operation();
}
```

```java
//ConcreteComponent类
class ConcreteComponent extends Component {
    public void Operation() {
        System.out.println("具体对象的实际操作");
    }
}
```

```java
//Decorator类
abstract class Decorator extends Component {
    protected Component component;
    //装饰一个Component对象
    public void SetComponent(Component component) {
        this.component = component;
    }
    //重写Operation()，实际调用component的Operation方法
    public void Operation() {
        if (component != null) {
            component.Operation();
        }
    }
}
```

```java
//ConcreteDecoratorA类
class ConcreteDecoratorA extends Decorator {
    private String addedState;//本类独有子段，以区别于ConcreteDecoratorB类
    public void Operation() {
        super.Operation();//首先运行了原有Component的Operation()
        this.addedState = "具体装饰对象A的独有操作";//再执行本类独有功能
        System.out.println(this.addedState);

    }
}
```

```java
//ConcreteDecoratorB类
class ConcreteDecoratorB extends Decorator {
    public void Operation() {
        super.Operation();//首先运行了原有Component的Operation()
        this.AddedBehavior();//再执行本类独有功能
    }
    //本类独有方法，以区别于ConcreteDecoratorA类
    private void AddedBehavior() { 
    	System.out.println("具体装饰对象B的独有操作");
    }
}
```

```java
public class Test {
	public static void main(String[] args){
		ConcreteComponent c = new ConcreteComponent();
    	ConcreteDecoratorA d1 = new ConcreteDecoratorA();
    	ConcreteDecoratorB d2 = new ConcreteDecoratorB();
    	d1.SetComponent(c);	//首先用d1来包装c
    	d2.SetComponent(d1);//再用有来包装d1
    	d2.Operation();   	//最终执行d2的Operation()
	}
}
```

装饰模式是利用`SetComponent`来对对象进行包装的。这样每个装饰对象的实现就和如何使用这个对象分离开了，每个装饰对象只关心自己的功能，不需要关心如何被添加到对象链当中。用刚才的例子来说就是，我们完全可以先穿外裤，再穿内裤，而不一定要先内后外。

![image-20231023234314755](https://cdn.jsdelivr.net/gh/vincent-nicky/image_store/blog/image-20231023234314755.png)

如果只有一个`ConcreteComponent`类而没有抽象的`Component`类，那么`Decorator`类可以是`ConcreteComponent`的一个子类。同样道理，如果只有一个`ConcreteDecorator`类，那么就没有必要建立 一个单独的`Decorator`类，而可以把`Decorator`和`ConcreteDecorator`的责任合并成一个类。

### 举例1

![image-20231023234533118](https://cdn.jsdelivr.net/gh/vincent-nicky/image_store/blog/image-20231023234533118.png)

### 举例2 - 商场收银程序再升级

![image-20231024001658644](https://cdn.jsdelivr.net/gh/vincent-nicky/image_store/blog/image-20231024001658644.png)

![image-20231024001807277](https://cdn.jsdelivr.net/gh/vincent-nicky/image_store/blog/image-20231024001807277.png)

### 总结

装饰模式是为已有功能动态地添加更多功能的一种方式

当系统需要新功能的时候，是向旧的类中添加新的代码。这些新加的代码通常装饰了原有类的核心职责或主要行为，比如用西装或嘻哈服来装饰人，但这种做法的问题在于，它们在主类中加入了新的字段，新的方法和新的逻辑，从而增加了主类的复杂度，就像你起初的那个'人'类，而这些新加入的东西仅仅是为了满足一些只在某种特定情况下才会执行的特殊行为的需要。而装饰模式却提供了一个非常好的解决方案，它把每个要装饰的功能放在单独的类中，并让这个 类包装它所要装饰的对象，因此，当需要执行特殊行为时，客户代码就可以在运行时根据需要有选择地、按顺序地使用装饰功能包装对象了。

装饰模式的优点是，把类中的装饰功能从类中搬移去除，这样可以简化原有的类。

是有效地把类的核心职责和装饰功能区分开了。而且可以去除相关类中重复的装饰逻辑。

