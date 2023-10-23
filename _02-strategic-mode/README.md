## 策略模式

策略模式是一种定义一系列算法的方法， 从概念上来看，所有这些算法完成的都是相同的工作，只是实现不同，它可以以相同的方式调用所有的算法，减少了各种算法类与使用算法类之间的耦合。

策略模式的Strategy类层次为Context定义了一系列的可供重用的算法或行为。继承有助于析取出这些算法中的公共功能。对于打折、返利或者其他的算法，其实都是对实际商品收费的一种计算方式，通过继承，可以得到它们的公共功能。例如这个公共的功能就是获得计算费用的结果GetResult，这使得算法间有了抽象的父类。CashSuper。

另外一个策略模式的优点是简化了单元测试，因为每个算法都有自己的类，可以通过自己的接口单独测试。每个算法可保证它没有错误，修改其中任一个时也不会影响其他的算法。

在最开始编程时，不得不在客户端的代码中为了判断用哪一个算法计算而用了switch条件 分支，这也是正常的。因为，当不 同的行为堆砌在一个类中时，就很难避免使用条件语句来选择合适的行为。 将这些行为封装在一个个独立的Strategy类中，可以在使用这些行为的类中消除条件语句。就商场收银系统的例子而言，在客户端的代码中就消除条件语句，避免了大量的判断。

策略模式就是用来封装算法的，但在实践中，我们发现可以用它来封装几乎任何类型的规则，只要在分析过程中听到需要在不同时间应用不同的业务规则，就可以考虑使用策略模式处理这种变化的可能性。

在基本的策略模式中，选择所用具体实现的职责由客户端对象承担，并转给策略模式的Context对象。这本身并没有解除客户端需要选择判断的压力，而策略模式与简单工厂模式结合后，选择具体实现的职责也可以由Context来承担，这就最大化地减轻了客户端的职责。

结合反射技术可获得更大的收益。

### 基本结构图

![image-20231023202013487](https://cdn.jsdelivr.net/gh/vincent-nicky/image_store/blog/image-20231023202013487.png)



![image-20231023202616358](https://cdn.jsdelivr.net/gh/vincent-nicky/image_store/blog/image-20231023202616358.png)

### 与简单工厂模式的对比

![image-20231023205339630](https://cdn.jsdelivr.net/gh/vincent-nicky/image_store/blog/image-20231023205339630.png)

简单工厂模式我需要让客户端认识两个类，CashSuper 和CashFactory，而策略模式与简单工厂结合的用法，客户端就只需要认识一 个类CashContext就可以了。耦合更加降低。

![image-20231023205418923](https://cdn.jsdelivr.net/gh/vincent-nicky/image_store/blog/image-20231023205418923.png)

我们在客户端实例化的是CashContext的对象，调用的是CashContext的方法GetResult，这使得具体的收费算法彻底地与客户端分离。连算法的父类CashSuper都不让客户端认识了。