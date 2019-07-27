# SpringIOC
A simple project describes the internals of SpringIOC

Spring的核心机制之一IOC


  SpringIOC的底层代码实现的基本思路
  
   1 #定义并解析Spring.XML
   
      见src目录下的Spring.xml
      
      此Project用dom4j（1.6.1版本)解析XML文档
      
   2 #定义ApplicationContext接口和其实现类ClassPathXmlApplicationContext
   
    ApplicationContext定义getBean(String id)方法
    
    在ClassPathXmlApplicationContext的构造方法中通过dom4j解析XML
    
        利用dom4j解析XML具体思路：
        
          加载XML文档遍历根标签Bean，找到属性id和class
          
          通过反射拿到类然后获得类的无参构造然后调用newInInstance()反射创建对象
          
          继续遍历标签拿到Bean的字标签property，并拿到属性name和value
          
          找到setXXX方法 格式化value参数 然后setXXX(value)将值注入对象
          
          ioc.put(id,object) 将id和对象放入Map容器
      
   3 #MainApp中 
   
      调用ClassPathXmlApplicationContext(String path)得到context上下文
      
      然后就可以根据id从ioc容器中取到对应Ban对象
      
      最后利用对象dosomething...
      
    完结
    希望对大家有帮助
          
    


