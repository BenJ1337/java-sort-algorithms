package de.hacker.benjamin.service.config;

import de.hacker.benjamin.service.algorithm.intern.SelectionSortServiceImpl;
import de.hacker.benjamin.service.intern.SortAlgorithmServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {
        SortAlgorithmServiceImpl.class,
        SelectionSortServiceImpl.class
})
public class ServiceConfiguration implements ApplicationContextAware {
    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        context = applicationContext;
    }

    public static <T> T getBean(Class<T> beanClass) {
        return context.getBean(beanClass);
    }
}