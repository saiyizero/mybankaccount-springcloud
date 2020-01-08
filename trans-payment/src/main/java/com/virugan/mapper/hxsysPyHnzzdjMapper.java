package com.virugan.mapper;

import com.virugan.component.myPages;
import com.virugan.tables.hxsysPyHnzzdj;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface hxsysPyHnzzdjMapper {
    List<hxsysPyHnzzdj> mySelect(hxsysPyHnzzdj hxsyspyhnzzdj);

    hxsysPyHnzzdj mySelectOne(hxsysPyHnzzdj hxsyspyhnzzdj);

    List<hxsysPyHnzzdj> mySelectPage(@Param("record") hxsysPyHnzzdj hxsyspyhnzzdj, @Param("mypage") myPages mypage);

    int myCount(hxsysPyHnzzdj hxsyspyhnzzdj);

    int myInsert(hxsysPyHnzzdj hxsyspyhnzzdj);

    int myUpdateOne(hxsysPyHnzzdj hxsyspyhnzzdj);

    int myDelete(hxsysPyHnzzdj hxsyspyhnzzdj);

    int myUpdateByExmp(@Param("record") hxsysPyHnzzdj record, @Param("updkey") hxsysPyHnzzdj updkey);
}