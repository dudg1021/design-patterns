# design-patterns
设计模式示例

创建型模式：

工厂模式  静态方式创建对象

工厂方法模式  工厂模式的基础上增加了选择工厂的维度，需要第一步选择合适的工厂。

抽象工厂模式  产品族理解一个产品工厂负责创建产品内部一些列对象，如果各个产品是存在兼容性问题的，就要用抽象工厂模式。

单例模式     保证全局使用同一对象，一方面是安全性考虑，一方面是为了节省资源。

建造者模式   专门对付属性很多的那种类，链式写法。

原型模式    了解和 Object 类中的 clone() 方法相关的知识即可。


结构型模式：


代理模式  增强方法

适配器模式（类适配器、对象适配器、接口适配器）接口包装兼容

桥梁模式  解耦

装饰模式  增强类

外观模式  封装实例化过程

组合模式  描述有层次结构的数据

享元模式  特定场景缓存已创建对象，提高性能

