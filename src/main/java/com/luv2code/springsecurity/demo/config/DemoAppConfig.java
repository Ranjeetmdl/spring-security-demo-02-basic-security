package com.luv2code.springsecurity.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/*@Configuration :this makes it spring configuration class
 * (similar to spring xml configuration file)
 * 
 * @EnableWebMvc: this for adding support for conversion, formatting and 
 * validation support(similar to <mvc:annotation-driven/> in xml configuration)
 * 
 * @ComponentScan(basePackages="com.luv2code.springsecurity.demo"): similar to 
 *                  <context:component-scan base-package="com.luv2code.springdemo" /> in
 *                  xml configuration
 */
	 
	 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.luv2code.springsecurity.demo")
public class DemoAppConfig {
	
	/*<!-- Define Spring MVC view resolver -->
	<bean
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/view/" />
		<property name="suffix" value=".jsp" />
	</bean>
	(below method is same as this view resolver definition in spring configuration file)
	*/
	//define a view for ViewResolver
	@Bean
	public ViewResolver viewResolver(){
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

}
