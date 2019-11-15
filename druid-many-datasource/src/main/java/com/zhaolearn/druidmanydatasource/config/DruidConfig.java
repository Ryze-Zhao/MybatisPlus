package com.zhaolearn.druidmanydatasource.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DruidConfig {

    private static final Logger log = LoggerFactory.getLogger(DruidConfig.class);

    @Value("${spring.datasource.druid.console.loginUsername}")
    private String loginUsername;
    @Value("${spring.datasource.druid.console.loginPassword}")
    private String loginPassword;
    @Value("${spring.datasource.druid.console.resetEnable}")
    private String resetEnable;
    @Value("${spring.datasource.druid.console.sessionStatEnable}")
    private String sessionStatEnable;
    @Value("${spring.datasource.druid.console.allowIp}")
    private String allowIp;

    /**多数据源不再需要配置数据源，原因是dynamic-datasource已配置好*/
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.master")
//    public DataSource master(){
//        return new DruidDataSource();
//    }

    /**多数据源不再需要配置数据源，原因是dynamic-datasource已配置好*/
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.slave")
//    public DataSource slave(){
//        return new DruidDataSource();
//    }

    @Bean
    public ServletRegistrationBean<StatViewServlet> druidStatViewServlet(){
        log.info("init Druid Servlet Configuration ");
        //org.springframework.boot.context.embedded.ServletRegistrationBean提供类的进行注册.
        ServletRegistrationBean<StatViewServlet> servletRegistrationBean = new ServletRegistrationBean<>(new StatViewServlet(),"/druid/*");
        //添加初始化参数
        servletRegistrationBean.addInitParameter("loginUsername",loginUsername);
        servletRegistrationBean.addInitParameter("loginPassword",loginPassword);
        //是否可以重置
        servletRegistrationBean.addInitParameter("resetEnable",resetEnable);
        // 关闭session监控，该功能目前不准确也存在内存泄漏bug
        servletRegistrationBean.addInitParameter("sessionStatEnable", sessionStatEnable);
        // IP白名单 (没有配置或者为空，则允许所有访问)
        servletRegistrationBean.addInitParameter("allow", allowIp);
        // IP黑名单 (存在共同时，deny优先于allow)
        //servletRegistrationBean.addInitParameter("deny", "");
        return servletRegistrationBean;

    }
    @Bean
    public FilterRegistrationBean<WebStatFilter> filterRegistrationBean() {
        FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        filterRegistrationBean.addInitParameter("profileEnable", "true");
        return filterRegistrationBean;
    }
}