package com.virugan.webservIfac.as;

import com.virugan.iotype.as.IoAsNbfhzhQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 内部账户信息处理接口
 * **/
@FeignClient(name = "trans-assets")
public interface InsidAcctWebClient {

    //内部账户单笔查询
    @RequestMapping(value = "InsidAcctWebServ/queryAcctMsgSingle",method = RequestMethod.GET,consumes = "application/json")
    public IoAsNbfhzhQuery queryAcctMsgSingle(@RequestBody IoAsNbfhzhQuery hxsysasnbfhzh);
}
