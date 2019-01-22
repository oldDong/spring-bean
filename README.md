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
        BeanFactoryAware
            设置BeanFactory
            
        BeanNameAware
            设置BeanName
            
        InitializingBean
            在bean属性设置完成后调用（beanFactory，beanName）
            
        DisposableBean
            容器关闭后，调用destory()，在<bean/>的destory-method之前被调用
            
    2、容器全局后处理器接口
        BeanFactoryPostProcessor
            spring hook函数，管理bean工厂内的所有BeanDefinition（未实例化），可以随心所欲地修改属性
            
        BeanPostProcessor
            对bean属性进行更改，bean实例化后，init-method前后
            在<bean/>的init-method之前执行postProcessBeforeInitialization
            在<bean/>的init-method之后执行postProcessAfterInitialization
            
        InstantiationAwareBeanPostProcessor
            对bean属性进行更改，bean实例化前后
            在bean实例化之前调用postProcessBeforeInstantiation
            在bean实例化之后调用postProcessAfterInstantiation
            
