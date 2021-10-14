package com.example.mapper;

import com.example.entity.UserRegister;

public interface UserRegisterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_register
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_register
     *
     * @mbggenerated
     */
    int insert(UserRegister record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_register
     *
     * @mbggenerated
     */
    int insertSelective(UserRegister record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_register
     *
     * @mbggenerated
     */
    UserRegister selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_register
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserRegister record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_register
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(UserRegister record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_register
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserRegister record);

    /**
     * 自定义的插入
     * @param record
     * @return
     */
    int insertBy4Element(UserRegister record);

    /**
     * loginName查询
     * @param loginName
     * @return UserRegister
     */
    UserRegister selectByLoginName(String loginName);

    /**
     * mobileNo查询
     * @param mobileNo
     * @return UserRegister
     */
    UserRegister selectByMobileNo(String mobileNo);

    /**
     * loginName 或 mobileNo查询
     * @param loginName
     * @param mobileNo
     * @return UserRegister
     */
    UserRegister selectByUniqueKey(String loginName, String mobileNo);


}