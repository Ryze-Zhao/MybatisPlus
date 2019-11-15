# Mybatis Plus结合SpringBoot学习
1.CRUD接口使用；
2.条件构造器使用；
3.分页插件使用；
4.代码生成器；
5.多数据源配置（结合dynamic-datasource-spring-boot-starter）
6.结合Druid多数据源展示

#### 项目介绍
主要是学习Mybatis Plus

#### 软件架构
软件架构说明


#### 安装教程
1. 根据git-url进行Clone
2. 导入对应模块

#### 使用说明

1.  mybatis-plus-1
    简单使用BaseMapper的demo，
        1、展示了MybatisPlus的核心功能之一Select接口使用（其他CUD操作也类似的）；
        2、展示了MybatisPlus的核心功能之一条件构造器AbstractWrapper（UpdateWrapper、QueryWrapper）等，主要用于如模糊、大小等限制，详细参考源码；
        
        
2.  mybatis-plus-2        
    分页使用
        1、展示了MybatisPlus的核心功能之一分页插件的两种使用方法；
        
        
3.  mybatis-plus-3
    代码生成器，3.0.3版本后，需要引入mybatis-plus-generator依赖,详细的配置信息，可以到网站看
    https://mp.baomidou.com/config/generator-config.html#%E5%9F%BA%E6%9C%AC%E9%85%8D%E7%BD%AE
    
    
4.  many_datasource
    结合dynamic-datasource-spring-boot-starter，进行多数据源配置
    

5.  druid_many_datasource
    上一模块结合Druid展示
    
    
    
    
#### 参与贡献
1. RyzeZhao


#### 注意
1. 如果想SpringBoot启动完成后不关闭，就需要加入以下依赖（开启Web）
      <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>


#### MyBatisPlus博客汇总
https://www.hehaozhao.top/front/articlePage/vqjugykxyv