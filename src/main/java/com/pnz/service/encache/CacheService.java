package com.pnz.service.encache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

public class CacheService{

    //’‚¿Ô
    @Cacheable(value = "baseCache")
    public String getTrial(String deviceId) {
      
        return "deviceId";
    }

}