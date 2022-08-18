package com.imooc.wiki.controller;

import com.imooc.wiki.Req.EbookReq;
import com.imooc.wiki.resp.CommonResp;
import com.imooc.wiki.resp.EbookResp;
import com.imooc.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Autowired
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp<List<EbookResp>> search(@RequestBody EbookReq req){
        CommonResp<List<EbookResp>> response = new CommonResp<>();
        List<EbookResp> respList =  ebookService.search(req);
        response.setContent(respList);
        return response;
    }
}
