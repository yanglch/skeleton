package org.example.skeleton.common.dal.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.ha.PropertiesUtils;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;

import java.util.Properties;

@Configuration
@MapperScan(basePackages = "org.example.skeleton.common.dal.dao")
public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        return sqlSessionFactoryBean;
    }


    @Bean(destroyMethod = "close")
    public DruidDataSource dataSource()throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
        Properties properties = new Properties();
        properties.load(ResourcePatternUtils.getResourcePatternResolver(null).getResource("classpath:mybatis.properties").getInputStream());
        dataSource.configFromPropety(properties);
        return dataSource;
    }


}
