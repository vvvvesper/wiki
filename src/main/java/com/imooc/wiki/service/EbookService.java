package com.imooc.wiki.service;

import com.imooc.wiki.domain.Ebook;
import com.imooc.wiki.mapper.EbookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;

    public List<Ebook> search(){
        return ebookMapper.selectByExample(null);
    }
}
