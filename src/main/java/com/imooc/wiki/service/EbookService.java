package com.imooc.wiki.service;

import com.imooc.wiki.Req.EbookReq;
import com.imooc.wiki.domain.Ebook;
import com.imooc.wiki.domain.EbookExample;
import com.imooc.wiki.mapper.EbookMapper;
import com.imooc.wiki.resp.EbookResp;
import com.imooc.wiki.util.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;

    public List<EbookResp> search(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

//        List<EbookResp> ebookRespList = new ArrayList<>();
//        for (Ebook ebook : ebookList) {
//            // EbookResp ebookResp = new EbookResp();
//            // BeanUtils.copyProperties(ebook,ebookResp);
//            // 单体复制
//            EbookResp ebookResp = CopyUtil.copy(ebook,EbookResp.class);
//            ebookRespList.add(ebookResp);
//        }
        List<EbookResp> ebookRespList = CopyUtil.copyList(ebookList,EbookResp.class);
        return ebookRespList;
    }
}
