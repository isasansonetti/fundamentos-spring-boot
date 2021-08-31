package com.practica.springboot.practicaSpringBoot;

import com.practica.springboot.practicaSpringBoot.bean.MyBean;
import com.practica.springboot.practicaSpringBoot.bean.MyBeanWithDependency;
import com.practica.springboot.practicaSpringBoot.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaSpringBootApplication implements CommandLineRunner {

	private ComponentDependency componentDependency1;
	private ComponentDependency componentDependency2;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;

	@Autowired
	public PracticaSpringBootApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, @Qualifier("componentImplement") ComponentDependency componentDependency1, MyBean myBean, MyBeanWithDependency myBeanWithDependency){
		this.componentDependency2 = componentDependency;
		this.componentDependency1 = componentDependency1;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(PracticaSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency2.saludar();
		componentDependency1.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
	}
}
