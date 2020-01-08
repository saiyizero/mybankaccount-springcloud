package com.virugan.mapper;

import com.virugan.component.myPages;
import com.virugan.tables.hxsysAsNbzhmx;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface hxsysAsNbzhmxMapper {
    List<hxsysAsNbzhmx> mySelect(hxsysAsNbzhmx hxsysasnbzhmx);

    hxsysAsNbzhmx mySelectOne(hxsysAsNbzhmx hxsysasnbzhmx);

    List<hxsysAsNbzhmx> mySelectPage(@Param("record") hxsysAsNbzhmx hxsysasnbzhmx, @Param("mypage") myPages mypage);

    int myCount(hxsysAsNbzhmx hxsysasnbzhmx);

    int myInsert(hxsysAsNbzhmx hxsysasnbzhmx);

    int myUpdateOne(hxsysAsNbzhmx hxsysasnbzhmx);

    int myDelete(hxsysAsNbzhmx hxsysasnbzhmx);

    int myUpdateByExmp(@Param("record") hxsysAsNbzhmx record, @Param("updkey") hxsysAsNbzhmx updkey);
}