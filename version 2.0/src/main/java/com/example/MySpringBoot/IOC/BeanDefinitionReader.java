package com.example.MySpringBoot.IOC;

import java.io.FileNotFoundException;

public interface BeanDefinitionReader {

    public void loadBeanDefinitions(String location) throws Exception;

}
