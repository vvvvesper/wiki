package com.imooc.wiki.service;

import com.imooc.wiki.domain.Demo;
import com.imooc.wiki.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> search(){
        return demoMapper.selectByExample(null);
    }
}
