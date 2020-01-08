package com.virugan.trans;

import com.virugan.io.as7002.as7002es;
import com.virugan.io.as7002.as7002is;
import com.virugan.service.InsidAcctServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 内部账户信息多笔查询
 * **/
@RestController
public class as7002 {

    @Autowired
    InsidAcctServ insideacctserv;

    @RequestMapping("/mybankaccount/as/as7002")
    public List<as7002es> execute(as7002is is) throws Exception {
        return null;
    }
}
