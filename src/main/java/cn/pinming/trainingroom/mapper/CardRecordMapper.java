package cn.pinming.trainingroom.mapper;

import cn.pinming.trainingroom.model.CardRecord;
import cn.pinming.trainingroom.model.CardRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardRecordMapper {
    int countByExample(CardRecordExample example);

    int deleteByExample(CardRecordExample example);

    int deleteByPrimaryKey(String recordId);

    int insert(CardRecord record);

    int insertSelective(CardRecord record);

    List<CardRecord> selectByExample(CardRecordExample example);

    CardRecord selectByPrimaryKey(String recordId);

    int updateByExampleSelective(@Param("record") CardRecord record, @Param("example") CardRecordExample example);

    int updateByExample(@Param("record") CardRecord record, @Param("example") CardRecordExample example);

    int updateByPrimaryKeySelective(CardRecord record);

    int updateByPrimaryKey(CardRecord record);
}