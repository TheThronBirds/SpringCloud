package discoveryerueka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 包名称discoveryerueka
 * 类名称EruekaServerApplication
 * 类描述 TODO
 * 创建人luzejin
 * 创建时间2018/11/5 14:39
 **/

@SpringBootApplication(exclude=
        {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableEurekaServer
public class EruekaServerApplication {
    public static void main(String args[]){
        SpringApplication.run(EruekaServerApplication.class,args);
    }
}
