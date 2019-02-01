package com.zhaolearn.mybatisplus3;




import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;


// 演示例子，执行 main 方法控制台输入模块表名回车自动生成对应项目目录中
public class MyCodeGenerator {
    //注释在后面基本不需要改，在上边的需要改
    //数据库库名
    private static String databaseName="mybatisplus";
    //要生成的数据表名

    //账户
    private static String userName="root";
    //密码
    private static String passWord="mysql123";
    //生成的包会当前项目/src/main/java/moduleName中
    private static String moduleName="test";
    //父包名字，如"com.baomidou.ant"
    private static String parentName="com.zhaolearn.mybatisplus3";





    private static String ip="localhost";//数据库IP
    private static String port="3306";//数据库端口
    private static String driverName="com.mysql.cj.jdbc.Driver";//com.mysql.cj.jdbc.Driver或者com.mysql.jdbc.Driver
    private static String author="zhao";//开发人员


    public static void generator() {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

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








        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        // String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名
                return projectPath + "/src/main/resources/mapper/" + pc.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });

        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        // templateConfig.setEntity("templates/entity2.java");
        // templateConfig.setService();
        // templateConfig.setController();

        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

       // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setSuperEntityClass("com.baomidou.ant.common.BaseEntity");
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setSuperControllerClass("com.baomidou.ant.common.BaseController");
        strategy.setInclude("user");
        strategy.setSuperEntityColumns("id");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(pc.getModuleName() + "_");
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }


}
