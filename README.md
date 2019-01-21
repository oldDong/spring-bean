# spring-bean
spring bean的生命周期

 1、实例化BeanFactoryPostProcessor
    2、执行BeanFactoryPostProcessor.postProcessBeanFactory
        可修改bean属性
    3、实例化BeanPostProcessor
    4、实例化InstantiationAwareBeanPostProcessorAdapter
    5、执行InstantiationAwareBeanProcessor的postProcessBeforeInstantiation
    6、执行Bean的构造器
    7、执行InstantiationAwareBeanPostProcessor的postProcessAfterInstatiation方法
    8、执行InstantiationAwareBeanPostProcessor的postProcessPropertyValues方法
    9、为Bean注入属性
    10、调用BeanNameAware的setBeanName方法
    11、调用BeanNameAware的setBeanFactory方法
    12、执行BeanPostProcessor的postProcessBeforeInitialization方法
    13、执行InitializingBean的afterPropertiesSet方法
    14、调用<bean>的init-method方法
    15、执行BeanPostProcessor的postProcessAfterInitialization的方法
    16、容器初始化成功，执行业务逻辑
    17、执行DisposibleBean的destory方法
    18、调用<bean>的destory-method方法
    
    Bean完整生命周期用到的组件
    
    1、Bean级别的接口
        BeanFactory、BeanNameAware、InitializingBean、DisposableBean
        
    2、容器全局后处理器接口
        BeanFactoryPostProcessor、BeanPostProcessor、InstantiationAwareBeanPostProcessor
