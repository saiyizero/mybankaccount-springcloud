package com.virugan.webservIfac.ap;

import com.virugan.iotype.ap.IoApZhxxhzOption;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 汇总账户信息处理接口
 * **/
@FeignClient(name = "trans-param")
public interface JoinAcctWebClient {

    //内部账户单笔查询
    @RequestMapping(value = "JoinAcctWebServ/queryAcctMsgSingle",method = RequestMethod.GET,consumes = "application/json")
    public IoApZhxxhzOption queryAcctMsgSingle(@RequestBody IoApZhxxhzOption ioApZhxxhz);
}
