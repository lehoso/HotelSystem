package cn.cqcucc.lh.Dao;

import cn.cqcucc.lh.Model.Question;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * @author LIHAO
 * @date 2021/12/30
 * @apinote
 */
@Mapper
@Service
public interface QuestionMapper {

    //增
    int insert(Question record);

    int insertSelective(Question record);


    //删

    //改

    //查


}