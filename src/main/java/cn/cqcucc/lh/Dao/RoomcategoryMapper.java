package cn.cqcucc.lh.Dao;

import cn.cqcucc.lh.Model.Roomcategory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author LIHAO
 * @date 2021/12/30
 * @apinote
 */
@Mapper
@Service
public interface RoomcategoryMapper {

    //增
    int insert(Roomcategory record);

    //严格插入,自动去掉空格以及判断非空
    int insertSelective(Roomcategory record);


    //删

    //改

    void updateRoomcategory(Roomcategory roomcategory);

    //查
    //获取房间预留初始化
    ArrayList<Roomcategory> getRoomPreservationInitialize();

    List<HashMap<String, Double>> getTypeAndPrice();

    //获取所有房间类型的Id
    ArrayList<String> getallcategoryid();

    //获取所有房间类型的名字
    ArrayList<String> getAllCategoryName();
}