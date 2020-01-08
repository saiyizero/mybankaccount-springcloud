package com.virugan.trans;

import com.virugan.io.as7001.as7001es;
import com.virugan.io.as7001.as7001is;
import com.virugan.myUtlis.myBeanUtils;
import com.virugan.service.InsidAcctServ;
import com.virugan.tables.hxsysAsNbfhzh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 内部账户信息单笔查询
 * **/

@RestController
public class as7001 {

    @Autowired
    InsidAcctServ insideacctserv;

    @RequestMapping("/mybankaccount/as/as7001")
    public as7001es execute(as7001is is) throws Exception {

        //用输入变量初始化表实体
        hxsysAsNbfhzh asNbfhzh = myBeanUtils.initialize(is, hxsysAsNbfhzh.class);

        hxsysAsNbfhzh asNbfhzhResult = insideacctserv.queryAcctMsgSingle(asNbfhzh);

        return myBeanUtils.initialize(asNbfhzhResult, as7001es.class);
    }
}
