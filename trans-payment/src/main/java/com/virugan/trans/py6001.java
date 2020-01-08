package com.virugan.trans;


import com.virugan.comtype.queryAcctContext;
import com.virugan.io.py6001.py6001es;
import com.virugan.io.py6001.py6001is;
import com.virugan.myUtlis.myBeanUtils;
import com.virugan.service.payIntrOfficeServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 交易账户信息查询
 */
@RestController
public class py6001 {

    @Autowired
    payIntrOfficeServ payintrofficserv;

    @RequestMapping("/mybankaccount/py/py6001")
    public py6001es execute(py6001is is) throws Exception {

        queryAcctContext payctx = myBeanUtils.initialize(is, queryAcctContext.class);
        queryAcctContext acctmsgresult = payintrofficserv.queryTransAcct(payctx);
        return myBeanUtils.initialize(acctmsgresult, py6001es.class);
    }
}
