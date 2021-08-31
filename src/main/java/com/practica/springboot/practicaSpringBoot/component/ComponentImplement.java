package com.practica.springboot.practicaSpringBoot.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.printf("Holaaaaa este es el componente 1");
    }
}
