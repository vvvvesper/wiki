package com.imooc.wiki.Req;

import lombok.Data;

@Data
public class EbookReq {
    private Long id;
    private String name;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}