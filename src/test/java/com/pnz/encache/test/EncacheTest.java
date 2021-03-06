package com.pnz.encache.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pnz.service.encache.CacheService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
public class EncacheTest /*extends AbstractTestBase*/{

    @Autowired
    private CacheService cacheService;

    public EncacheTest() {
    }

    @Test
    public void testEncache() {
        cacheService.putTrial(5);
        for (int i = 0; i < 10; i++) {
            System.out.println(cacheService.getTrial(5));
        }
    }

    /**
     * Getter method for property <tt>cacheService</tt>.
     * 
     * @return property value of cacheService
     */
    public CacheService getCacheService() {
        return cacheService;
    }

    /**
     * Setter method for property <tt>cacheService</tt>.
     * 
     * @param cacheService value to be assigned to property cacheService
     */
    public void setCacheService(CacheService cacheService) {
        this.cacheService = cacheService;
    }
}
