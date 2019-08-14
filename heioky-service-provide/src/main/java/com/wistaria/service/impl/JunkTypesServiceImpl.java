package com.wistaria.service.impl;

import com.wistaria.dao.JunkTypesModelMapper;
import com.wistaria.model.JunkTypesModel;
import com.wistaria.service.JunkTypesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JunkTypesServiceImpl implements JunkTypesService {
    @Resource
    private JunkTypesModelMapper typesModelMapper;

    @Override
    public List<JunkTypesModel> findList() {
        return typesModelMapper.findList();
    }
}
