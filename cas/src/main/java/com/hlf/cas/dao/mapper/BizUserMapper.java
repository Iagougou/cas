package com.hlf.cas.dao.mapper;

import com.hlf.cas.common.BizUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author daemon
 * @Date 18/10/12 10:07
 * To change this template use File | Settings | File Templates.
 */
public interface BizUserMapper {


    /**
     * 批量添加业务线管理员
     * @param bizUserList
     * @return
     */
    int batchAddBizUser(@Param("bizUserList") List<BizUser> bizUserList);

    /**
     * 根据业务线Id获取业务线下的管理员
     * @param bizIdList
     * @return
     */
    List<BizUser> getBizUserByBizId(@Param("bizIdList") List<Long> bizIdList);


    /**
     * 删除某条业务线下的某个管理员
     * @param bizUser
     * @return
     */
    int removeBizUser(BizUser bizUser);


    /**
     * 获取某个用户的下的业务线
     * @param userId
     * @return
     */
    List<BizUser> getBizUserByUserId(@Param("userId") String userId);


    int batchDeleteBizUserRelByUserIds(@Param("userIds") List<String> userIds);

    int deleteFakeUser();

}
