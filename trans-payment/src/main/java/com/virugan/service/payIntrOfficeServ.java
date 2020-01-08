package com.virugan.service;

import com.virugan.comtype.paymentContext;
import com.virugan.comtype.queryAcctContext;
import com.virugan.tables.hxsysPyHnzzdj;

import java.util.List;

/**
 * 行内转账相关组件
 * **/
public interface payIntrOfficeServ {

    //法人内转账
    public boolean transSameFaredma(paymentContext paymentcontext) throws Exception;

    //行内转账明细查询
    public List queryTransDetails(hxsysPyHnzzdj hxsyspyhnzzdj) throws Exception;

    //查询交易账户信息
    public queryAcctContext queryTransAcct(queryAcctContext paymentcontext) throws Exception;
}
