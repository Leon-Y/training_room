package cn.pinming.trainingroom.mapper;

import cn.pinming.trainingroom.model.TrainingRecordMonth;
import cn.pinming.trainingroom.model.TrainingRecordMonthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainingRecordMonthMapper {
    int countByExample(TrainingRecordMonthExample example);

    int deleteByExample(TrainingRecordMonthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TrainingRecordMonth record);

    int insertSelective(TrainingRecordMonth record);

    List<TrainingRecordMonth> selectByExample(TrainingRecordMonthExample example);

    TrainingRecordMonth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TrainingRecordMonth record, @Param("example") TrainingRecordMonthExample example);

    int updateByExample(@Param("record") TrainingRecordMonth record, @Param("example") TrainingRecordMonthExample example);

    int updateByPrimaryKeySelective(TrainingRecordMonth record);

    int updateByPrimaryKey(TrainingRecordMonth record);
}