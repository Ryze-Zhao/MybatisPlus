package com.zhaolearn.mybatisplus3;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


// 演示例子，执行 main 方法控制台输入模块表名回车自动生成对应项目目录中
public class MyCodeGenerator {
    //注释在后面基本不需要改，在上边的需要改
    //数据库库名
    private static String databaseName="mybatisplus";
    //数据表名,需要设置setExclude（排除这张表,全部的话就""这样）和setInclude（生成这张表）
    private static String tableName="";
    //账户
    private static String userName="root";
    //密码
    private static String passWord="mysql123";
    //父包名字，如"com.baomidou.ant"
    private static String parentName="com.zhaolearn.mybatisplus3";
    //生成的包会当前项目/src/main/java/{parentName}/{moduleName}中
    private static String moduleName=null;






    private static String ip="localhost";//数据库IP
    private static String port="3306";//数据库端口
    private static String driverName="com.mysql.cj.jdbc.Driver";//com.mysql.cj.jdbc.Driver或者com.mysql.jdbc.Driver
    private static String author="zhao";//开发人员


    public static void generator() {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
//        strategy.setInclude(tableName);
        strategy.setExclude(tableName);
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setSuperServiceClass(null);
        strategy.setSuperServiceImplClass(null);
        strategy.setSuperMapperClass(null);
         /*     strategy.setSuperEntityClass("com.baomidou.ant.common.BaseEntity");
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setSuperControllerClass("com.baomidou.ant.common.BaseController");
        strategy.setSuperEntityColumns("id");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(pc.getModuleName() + "_");*/
        mpg.setStrategy(strategy);







        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://"+ip+":"+port+"/"+databaseName+"?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8&useSSL=false");
        dsc.setDriverName(driverName);
        dsc.setUsername(userName);
        dsc.setPassword(passWord);
        mpg.setDataSource(dsc);



        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");//获得当前类全路径
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor(author);
        gc.setOpen(false);//是否打开输出目录
        mpg.setGlobalConfig(gc);



        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(moduleName);
        pc.setParent(parentName);//父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名
        mpg.setPackageInfo(pc);






        mpg.execute();
    }


}
