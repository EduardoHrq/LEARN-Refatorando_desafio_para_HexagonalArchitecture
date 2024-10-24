package br.com.gubee.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.concurrent.TimeUnit;

@Configuration
public class JdbcConfiguration {
    @Bean
    public DataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();

        dataSource.setDriverClassName(org.postgresql.Driver.class.getName());
        dataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        dataSource.setUsername("gubee");
        dataSource.setPassword("gubee");
        dataSource.setMaximumPoolSize(getMaxPoolSize());
        dataSource.setConnectionTimeout(TimeUnit.SECONDS.toMillis(5L));
        dataSource.setSchema("interview_service");
        return dataSource;
    }


    private int getMaxPoolSize() {
        return (Runtime.getRuntime().availableProcessors() * 2) + 1;
    }

}
