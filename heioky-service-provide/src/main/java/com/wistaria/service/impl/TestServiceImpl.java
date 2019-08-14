package com.wistaria.service.impl;

import com.wistaria.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);

    @Override
    public String getContent() {
        LOGGER.info("这个是service 层....");
        return ">>>> Service跳转成功";
    }
}
