package cn.pinming.trainingroom.mapper;

import cn.pinming.trainingroom.model.TrainingRecordDay;
import cn.pinming.trainingroom.model.TrainingRecordDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainingRecordDayMapper {
    int countByExample(TrainingRecordDayExample example);

    int deleteByExample(TrainingRecordDayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TrainingRecordDay record);

    int insertSelective(TrainingRecordDay record);

    List<TrainingRecordDay> selectByExample(TrainingRecordDayExample example);

    TrainingRecordDay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TrainingRecordDay record, @Param("example") TrainingRecordDayExample example);

    int updateByExample(@Param("record") TrainingRecordDay record, @Param("example") TrainingRecordDayExample example);

    int updateByPrimaryKeySelective(TrainingRecordDay record);

    int updateByPrimaryKey(TrainingRecordDay record);
}