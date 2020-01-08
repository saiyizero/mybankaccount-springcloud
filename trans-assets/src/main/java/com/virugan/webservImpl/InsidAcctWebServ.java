package com.virugan.webservImpl;

import com.virugan.iotype.as.IoAsNbfhzhQuery;
import com.virugan.myUtlis.myBeanUtils;
import com.virugan.service.InsidAcctServ;
import com.virugan.tables.hxsysAsNbfhzh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/InsidAcctWebServ/")
public class InsidAcctWebServ {

    @Autowired
    InsidAcctServ insidacctserv;

    //内部账户信息单笔查询组件
    @RequestMapping("queryAcctMsgSingle")
    public IoAsNbfhzhQuery queryAcctMsgSingle(@RequestBody IoAsNbfhzhQuery ioasnbfhzh) throws Exception {

        hxsysAsNbfhzh asNbfhzh = myBeanUtils.initialize(ioasnbfhzh, hxsysAsNbfhzh.class);

        hxsysAsNbfhzh nbfhzhResult = insidacctserv.queryAcctMsgSingle(asNbfhzh);

        return myBeanUtils.initialize(asNbfhzh, IoAsNbfhzhQuery.class);
    }

}
