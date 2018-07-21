package webmvc.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import webmvc.entity.BeeSalemanInfo;
import webmvc.entity.BeeSalemanInfoExample;

public interface BeeSalemanInfoMapper {
    int countByExample(BeeSalemanInfoExample example);

    int deleteByExample(BeeSalemanInfoExample example);

    int insert(BeeSalemanInfo record);

    int insertSelective(BeeSalemanInfo record);

    List<BeeSalemanInfo> selectByExample(BeeSalemanInfoExample example);

    int updateByExampleSelective(@Param("record") BeeSalemanInfo record, @Param("example") BeeSalemanInfoExample example);

    int updateByExample(@Param("record") BeeSalemanInfo record, @Param("example") BeeSalemanInfoExample example);
}