# design-patterns
设计模式示例

**创建型模式：**

工厂模式  静态方式创建对象

工厂方法模式  工厂模式的基础上增加了选择工厂的维度，需要第一步选择合适的工厂。

抽象工厂模式  产品族理解一个产品工厂负责创建产品内部一些列对象，如果各个产品是存在兼容性问题的，就要用抽象工厂模式。

单例模式     保证全局使用同一对象，一方面是安全性考虑，一方面是为了节省资源。

建造者模式   专门对付属性很多的那种类，链式写法。

原型模式    了解和 Object 类中的 clone() 方法相关的知识即可。


**结构型模式：**


代理模式  增强方法

适配器模式（类适配器、对象适配器、接口适配器）接口包装兼容

桥梁模式  解耦

装饰模式  增强类

外观模式  封装实例化过程

组合模式  描述有层次结构的数据

享元模式  特定场景缓存已创建对象，提高性能


**行为型模式：**


策略模式      将算法封装为一个个类，通过环境类任意替换调用。

观察者模式    定义对象间一对多的依赖关系，当一个对象发生改变时，所有依赖它的对象都得到通知并被自动更新

责任链模式    为请求创建一个接收者对象的单向链（每个接收者都会包含对另一个接收者的引用），请求在链上传递每一个对象根据命令进行处理。

模板方法模式  定义一个操作中的算法的骨架，将步骤延迟到子类中。

状态模式     对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为。

命令模式     将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。