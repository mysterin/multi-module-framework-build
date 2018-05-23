package com.xxbb.service.impl;

import com.xxbb.dao.FrameworkInfoDao;
import com.xxbb.model.FrameworkInfo;
import com.xxbb.service.MainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("mainService")
public class MainServiceImpl implements MainService {
    private static final Logger logger = LoggerFactory.getLogger(MainService.class);

    @Autowired
    private FrameworkInfoDao frameworkInfoDao;

    @Override
    public FrameworkInfo getFrameworkInfoById(Long id) {
        logger.info("id: {}", id);
        return frameworkInfoDao.findById(id);
    }
}
