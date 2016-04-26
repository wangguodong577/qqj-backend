package com.qqj.weixin.wrapper;

import com.qqj.weixin.domain.WeixinPic;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by wangguodong on 16/4/26.
 */
@Getter
@Setter
public class WeixinPicWrapper {

    public static final String default7NiuDomain = "http://7xtddo.com2.z0.glb.clouddn.com/";

    private Long id;

    private String url;

    //个人图片编号
    private Short type;

    private Date createTime;

    public WeixinPicWrapper(WeixinPic weixinPic) {
        this.id = weixinPic.getId();
        this.url = default7NiuDomain + weixinPic.getQiNiuHash();
        this.type = weixinPic.getType();
        this.createTime = weixinPic.getCreateTime();
    }

}
