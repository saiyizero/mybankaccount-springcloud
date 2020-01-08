package com.virugan.webservImpl;

import com.virugan.iotype.ap.IoApZhxxhzOption;
import com.virugan.myTemple.myCacheTemple;
import com.virugan.myUtlis.myBeanUtils;
import com.virugan.tables.ap.hxsysApZhxxhz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 汇总账户信息处理接口
 * **/
@RestController
@RequestMapping("/JoinAcctWebServ/")
public class JoinAcctWebServ {
    @Autowired
    myCacheTemple mycachetemple;

    //汇总账户信息单笔缓存查询
    @RequestMapping("queryAcctMsgSingle")
    public IoApZhxxhzOption queryAcctMsgSingle(@RequestBody IoApZhxxhzOption ioApZhxxhz) throws Exception {

        hxsysApZhxxhz apZhxxhz = myBeanUtils.initialize(ioApZhxxhz, hxsysApZhxxhz.class);
        hxsysApZhxxhz apZhxxhzResult = mycachetemple.selectByPrimaryKey(apZhxxhz);

        return myBeanUtils.initialize(apZhxxhzResult,IoApZhxxhzOption.class);
    }
}
