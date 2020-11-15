# YSpringIOC
第八周第一次作业
1、自己手写完成高仿真版本的Spring IOC。
根据Tom老师课堂讲的手写SpringIOC后，自己进行了一定程度的改进。
1. 根据 xml 配置文件加载相关的 bean
2. 对 BeanPostProcessor 类型的 bean 提供支持
3. 对 BeanFactoryAware 类型的 bean 提供支持
4. 整合 IOC 和 AOP 两个模块，使得可以协同工作
BeanFactory 的流程
1. BeanFactory 加载 Bean 的配置文件，将读到的配置属性信息封装成 BeanDefinition 对象
2. 将封装好的 BeanDefinition 对象注册到 BeanDefinition 容器中
3. 注册 BeanPostProcessor 相关实现类到 BeanPostProcessor 容器中
4. BeanFactory 进入就绪状态
5. 外部调用 BeanFactory 的 getBean(String name) 方法，BeanFactory 着手实例化相应的 bean
6. 重复步骤 3 和 4，直至 BeanFactory 被销毁
