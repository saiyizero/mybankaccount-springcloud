package com.virugan.comtype;

import java.math.BigDecimal;

/**
 * 账户信息查询组件
 * **/
public class queryAcctContext {

    /** 法人代码 **/
    private String farendma;

    /** 客户账号 **/
    private String kehuzhao;

    /** 子账户序号 **/
    private String zhhaoxuh;

    /** 客户账号类型 **/
    private String kehuzhlx;

    /** 系统账号 **/
    private String xtzhangh;

    /** 账户名称 **/
    private String zhanghmc;

    /** 模块 **/
    private String mokuaiii;

    /** 核算代码 **/
    private String hesuandm;

    /** 开户机构 **/
    private String kaihjigo;

    /** 货币代号 **/
    private String huobdaih;

    /** 账户余额 **/
    private BigDecimal zhanghye;

    /** 余额方向 **/
    private String yuefangx;

    /** 客户号 **/
    private String kehuhaoo;

    /** 账户状态 **/
    private String zhanghzt;

    /** 时间戳 **/
    private BigDecimal shijchuo;



    public String getKehuzhlx() {
        return kehuzhlx;
    }

    public void setKehuzhlx(String kehuzhlx) {
        this.kehuzhlx = kehuzhlx == null ? null : kehuzhlx.trim();
    }

    public String getXtzhangh() {
        return xtzhangh;
    }

    public void setXtzhangh(String xtzhangh) {
        this.xtzhangh = xtzhangh == null ? null : xtzhangh.trim();
    }

    public String getMokuaiii() {
        return mokuaiii;
    }

    public void setMokuaiii(String mokuaiii) {
        this.mokuaiii = mokuaiii == null ? null : mokuaiii.trim();
    }

    public String getKaihjigo() {
        return kaihjigo;
    }

    public void setKaihjigo(String kaihjigo) {
        this.kaihjigo = kaihjigo == null ? null : kaihjigo.trim();
    }

    public String getKehuhaoo() {
        return kehuhaoo;
    }

    public void setKehuhaoo(String kehuhaoo) {
        this.kehuhaoo = kehuhaoo == null ? null : kehuhaoo.trim();
    }

    public void setShijchuo(BigDecimal shijchuo) {
        this.shijchuo = shijchuo;
    }

    public String getFarendma() {
        return farendma;
    }

    public void setFarendma(String farendma) {
        this.farendma = farendma == null ? null : farendma.trim();
    }

    public String getKehuzhao() {
        return kehuzhao;
    }

    public void setKehuzhao(String kehuzhao) {
        this.kehuzhao = kehuzhao == null ? null : kehuzhao.trim();
    }

    public String getZhhaoxuh() {
        return zhhaoxuh;
    }

    public void setZhhaoxuh(String zhhaoxuh) {
        this.zhhaoxuh = zhhaoxuh == null ? null : zhhaoxuh.trim();
    }

    public String getZhanghmc() {
        return zhanghmc;
    }

    public void setZhanghmc(String zhanghmc) {
        this.zhanghmc = zhanghmc == null ? null : zhanghmc.trim();
    }

    public String getHesuandm() {
        return hesuandm;
    }

    public void setHesuandm(String hesuandm) {
        this.hesuandm = hesuandm == null ? null : hesuandm.trim();
    }

    public String getHuobdaih() {
        return huobdaih;
    }

    public void setHuobdaih(String huobdaih) {
        this.huobdaih = huobdaih == null ? null : huobdaih.trim();
    }

    public BigDecimal getZhanghye() {
        return zhanghye;
    }

    public void setZhanghye(BigDecimal zhanghye) {
        this.zhanghye = zhanghye;
    }

    public String getYuefangx() {
        return yuefangx;
    }

    public void setYuefangx(String yuefangx) {
        this.yuefangx = yuefangx == null ? null : yuefangx.trim();
    }

    public String getZhanghzt() {
        return zhanghzt;
    }

    public void setZhanghzt(String zhanghzt) {
        this.zhanghzt = zhanghzt == null ? null : zhanghzt.trim();
    }

    public BigDecimal getShijchuo() {
        return shijchuo;
    }
}
