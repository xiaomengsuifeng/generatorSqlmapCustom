package com.lingxiujz.jz.dao.admin;

import com.lingxiujz.jz.entity.admin.LxAdminUserInfo;
import com.lingxiujz.jz.entity.admin.LxAdminUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LxAdminUserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lx_admin_user_info
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    int countByExample(LxAdminUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lx_admin_user_info
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    int deleteByExample(LxAdminUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lx_admin_user_info
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lx_admin_user_info
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    int insert(LxAdminUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lx_admin_user_info
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    int insertSelective(LxAdminUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lx_admin_user_info
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    List<LxAdminUserInfo> selectByExample(LxAdminUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lx_admin_user_info
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    LxAdminUserInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lx_admin_user_info
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    int updateByExampleSelective(@Param("record") LxAdminUserInfo record, @Param("example") LxAdminUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lx_admin_user_info
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    int updateByExample(@Param("record") LxAdminUserInfo record, @Param("example") LxAdminUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lx_admin_user_info
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    int updateByPrimaryKeySelective(LxAdminUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lx_admin_user_info
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    int updateByPrimaryKey(LxAdminUserInfo record);
}