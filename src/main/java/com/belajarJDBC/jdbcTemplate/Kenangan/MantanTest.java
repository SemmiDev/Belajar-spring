package com.belajarJDBC.jdbcTemplate.Kenangan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config-context.xml")
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class
})
public class MantanTest {

    @Qualifier("mantan1")
    @Autowired
    private Mantan mantan1;

    @Qualifier("mantan2")
    @Autowired
    private Mantan mantan2;

    @Qualifier("mantan3")
    @Autowired
    private Mantan mantan3;

    @Qualifier("mantan4")
    @Autowired
    private Mantan mantan4;

    private static Logger LOGGER = LoggerFactory.getLogger(MantanTest.class);
    @Test
    public void testMantan1() throws Exception {
        assertEquals(mantan1.getNama(), "mantan1");
        assertEquals(mantan1.getLevelCantik(), "10");
        LOGGER.debug("test mantan pertama");
    }

    @Test
    public void testMantan2() throws Exception {
        assertEquals(mantan2.getNama(), "mantan2");
        assertEquals(mantan2.getLevelCantik(), "10");
        LOGGER.debug("test mantan kedua");
    }

    @Test
    public void testMantan3() throws Exception {
        assertEquals(mantan3.getNama(), "mantan3");
        assertEquals(mantan3.getLevelCantik(), "10");
        LOGGER.debug("test mantan ketiga");
    }

    @Test
    public void testMantan4() throws Exception {
        assertEquals(mantan4.getNama(), "mantan4");
        assertEquals(mantan4.getLevelCantik(), "10");
        LOGGER.debug("test mantan empat");
    }
}