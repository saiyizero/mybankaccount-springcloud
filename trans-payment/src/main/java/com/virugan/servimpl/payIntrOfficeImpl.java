package com.virugan.servimpl;

import com.virugan.comtype.paymentContext;
import com.virugan.comtype.queryAcctContext;
import com.virugan.iotype.ap.IoApZhxxhzOption;
import com.virugan.iotype.as.IoAsNbfhzhQuery;
import com.virugan.myUtlis.myBeanUtils;
import com.virugan.service.payIntrOfficeServ;
import com.virugan.tables.hxsysPyHnzzdj;
import com.virugan.webservIfac.ap.JoinAcctWebClient;
import com.virugan.webservIfac.as.InsidAcctWebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class payIntrOfficeImpl implements payIntrOfficeServ {
    @Autowired
    JoinAcctWebClient joinacctwebclient;
    @Autowired
    InsidAcctWebClient insidacctwebclient;

    @Override
    public boolean transSameFaredma(paymentContext paymentcontext) throws Exception {
        return false;
    }

    public boolean transBetweenFaredma(paymentContext paymentcontext) throws Exception {
        return false;
    }

    @Override
    public List queryTransDetails(hxsysPyHnzzdj hxsyspyhnzzdj) throws Exception {
        return null;
    }


    public boolean transByHandwork(paymentContext paymentcontext) throws Exception {
        return false;
    }

    public boolean settleByHandwork(paymentContext paymentcontext) throws Exception {
        return false;
    }

    public queryAcctContext queryTransAcct(queryAcctContext paymentcontext) throws Exception {
        IoApZhxxhzOption ioapzhxxhz = myBeanUtils.initialize(paymentcontext, IoApZhxxhzOption.class);
        IoApZhxxhzOption zhxxhzResult = joinacctwebclient.queryAcctMsgSingle(ioapzhxxhz);
        String mokuaiii = zhxxhzResult.getMokuaiii();

        //将汇总账户信息拷贝到输出结果中
        myBeanUtils.copyByName(zhxxhzResult,paymentcontext);

        if(mokuaiii.equals("AS")){
            IoAsNbfhzhQuery nbfhzhResult = insidacctwebclient
                    .queryAcctMsgSingle(myBeanUtils.initialize(zhxxhzResult, IoAsNbfhzhQuery.class));

            //将内部账户信息拷贝到输出结果中
            myBeanUtils.copyByName(nbfhzhResult,paymentcontext);
        }else if(mokuaiii.equals("DT")){

        }else{

        }
        return paymentcontext;
    }
}
