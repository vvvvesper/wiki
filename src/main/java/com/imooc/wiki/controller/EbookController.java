package com.imooc.wiki.controller;

import com.imooc.wiki.domain.Ebook;
import com.imooc.wiki.resp.CommonResp;
import com.imooc.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Autowired
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp<List<Ebook>> search(){
        CommonResp<List<Ebook>> response = new CommonResp<>();
        List<Ebook> list =  ebookService.search();
        response.setContent(list);
        return response;
    }
}
