package cn.cqcucc.lh.Dao;

import cn.cqcucc.lh.Model.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * @author LIHAO
 * @date 2021/12/30
 * @apinote
 */
@Mapper
@Service
public interface CommentMapper {

    //增

    //新增评论
    int insert(Comment record);

    int insertSelective(Comment record);


    //删

    //改

    //查


}