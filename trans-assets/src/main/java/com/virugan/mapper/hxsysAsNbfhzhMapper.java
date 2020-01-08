package com.virugan.mapper;

import com.virugan.component.myPages;
import com.virugan.tables.hxsysAsNbfhzh;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface hxsysAsNbfhzhMapper {
    List<hxsysAsNbfhzh> mySelect(hxsysAsNbfhzh hxsysasnbfhzh);

    hxsysAsNbfhzh mySelectOne(hxsysAsNbfhzh hxsysasnbfhzh);

    List<hxsysAsNbfhzh> mySelectPage(@Param("record") hxsysAsNbfhzh hxsysasnbfhzh, @Param("mypage") myPages mypage);

    int myCount(hxsysAsNbfhzh hxsysasnbfhzh);

    int myInsert(hxsysAsNbfhzh hxsysasnbfhzh);

    int myUpdateOne(hxsysAsNbfhzh hxsysasnbfhzh);

    int myDelete(hxsysAsNbfhzh hxsysasnbfhzh);

    int myUpdateByExmp(@Param("record") hxsysAsNbfhzh record, @Param("updkey") hxsysAsNbfhzh updkey);
}