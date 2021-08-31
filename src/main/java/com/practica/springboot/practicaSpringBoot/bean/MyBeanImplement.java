package com.practica.springboot.practicaSpringBoot.bean;

public class MyBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("H O L A  esto es desde la config propia del bean");
    }
}
