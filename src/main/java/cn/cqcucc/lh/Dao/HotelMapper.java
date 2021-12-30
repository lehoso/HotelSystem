package cn.cqcucc.lh.Dao;

import cn.cqcucc.lh.Model.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * @author LIHAO
 * @date 2021/12/30
 * @apinote
 */
@Mapper
@Service
public interface HotelMapper {

    //增
    int insert(Hotel record);

    int insertSelective(Hotel record);

    //改

    //修改酒店信息
    int changeinfo(Hotel hotel);

    //查

    //获取酒店信息
    Hotel getHotelinfo();

}