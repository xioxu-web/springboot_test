package com.example.demo.config;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;
@Configuration
public class DataSourceConfig{
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.driverClassName}")
    private String driverClassName;
    @Bean
    public DataSource dataSource(){
        System.out.println("注入druid！！！");
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("url");
        dataSource.setUsername("username");
        dataSource.setPassword("password");
        dataSource.setDriverClassName("driverClassName");
        dataSource.setInitialSize(2);
        dataSource.setMaxActive(20);
        dataSource.setMaxWait(60000);
        System.out.println("数据源注入成功");
        return dataSource;
    }


}
