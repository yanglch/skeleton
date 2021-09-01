package org.example.skeleton.common.dal.config;

import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@MapperScan(basePackages = "org.example.skeleton.common.dal.dao")
public class MybatisConfig {

//    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        return sqlSessionFactoryBean;
    }


//    @Bean(destroyMethod = "close")
//    public DruidDataSource dataSource()throws Exception {
//        DruidDataSource dataSource = new DruidDataSource();
//        Properties properties = new Properties();
//        properties.load(ResourcePatternUtils.getResourcePatternResolver(null).getResource("classpath:mybatis.properties").getInputStream());
//        dataSource.configFromPropety(properties);
//        return dataSource;
//    }

    @Bean
    public DataSource dataSource() throws Exception {
        HikariDataSource dataSource = new HikariDataSource();
        Properties properties = new Properties();
        properties.load(ResourcePatternUtils.getResourcePatternResolver(null).getResource("classpath:mybatis.properties").getInputStream());
        dataSource.setJdbcUrl(properties.getProperty("druid.url"));
        dataSource.setDriverClassName(properties.getProperty("druid.driver-class-name"));
        dataSource.setUsername(properties.getProperty("druid.username"));
        dataSource.setPassword(properties.getProperty("druid.password"));
        return dataSource;
    }


}
