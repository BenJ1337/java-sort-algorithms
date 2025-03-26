package de.hacker.benjamin.service.config;

import de.hacker.benjamin.service.algorithm.intern.SelectionSortImpl;
import de.hacker.benjamin.service.intern.SortAlgorithmAlgoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {
        SortAlgorithmAlgoImpl.class,
        SelectionSortImpl.class
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