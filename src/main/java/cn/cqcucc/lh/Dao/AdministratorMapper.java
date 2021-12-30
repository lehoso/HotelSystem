package cn.cqcucc.lh.Dao;

import cn.cqcucc.lh.Model.Administrator;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * @author LIHAO
 * @date 2021/12/30
 * @apinote
 */
@Mapper
@Service
public interface AdministratorMapper {

    //增
    int insert(Administrator record);

    int insertSelective(Administrator record);


    //删

    //改
    int updateAdmin(Administrator administrator);

    //查
    Administrator adminconfirm(Administrator record);


}