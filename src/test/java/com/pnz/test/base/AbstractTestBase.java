package com.pnz.test.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public abstract class AbstractTestBase {

    protected ApplicationContext applicationContext = null;

    public AbstractTestBase() {
        this.applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    public ApplicationContext getApplicationContext() {
        Assert.isTrue(this.applicationContext != null);
        return applicationContext;
    }
}
