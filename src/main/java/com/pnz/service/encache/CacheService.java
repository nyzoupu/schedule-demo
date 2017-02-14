package com.pnz.service.encache;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

public class CacheService{

    //’‚¿Ô
    @Cacheable(value = "baseCache" /*,key="#param"*/)
    public int getTrial(int param) {
        Long timestamp = System.currentTimeMillis();  
        return param;
    }

    @CachePut(value = "baseCache" /*,key="#param"*/)
    public int putTrial(int param) {
        Long timestamp = System.currentTimeMillis();  
        return param+1;
    }
}