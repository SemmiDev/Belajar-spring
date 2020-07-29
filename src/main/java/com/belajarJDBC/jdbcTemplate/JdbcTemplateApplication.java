package com.belajarJDBC.jdbcTemplate;
import com.belajarJDBC.jdbcTemplate.Kenangan.Mantan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(JdbcTemplateApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-context.xml");
		Mantan mantan1 = (Mantan) context.getBean("mantan1");
		Mantan mantan2 = (Mantan) context.getBean("mantan2");
		Mantan mantan3 = (Mantan) context.getBean("mantan3");
		Mantan mantan4 = (Mantan) context.getBean("mantan4");

		LOGGER.debug("cek mantan pertama : {}", mantan1.toString());
		LOGGER.debug("cek mantan pertama : {}", mantan2.toString());
		LOGGER.debug("cek mantan pertama : {}", mantan3.toString());
		LOGGER.debug("cek mantan pertama : {}", mantan4.toString());
	}
}