package com.lucky.enterprisedemo.pojo;

/**
 * Created by lucky on 2017/3/21.
 */

import java.util.Date;

public class SysUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_id
     *
     * @mbggenerated
     */
    private Long sysUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_login_name
     *
     * @mbggenerated
     */
    private String sysUserLoginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_login_password
     *
     * @mbggenerated
     */
    private String sysUserLoginPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_status
     *
     * @mbggenerated
     */
    private String sysUserStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_is_delete
     *
     * @mbggenerated
     */
    private String sysUserIsDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_register_datetime
     *
     * @mbggenerated
     */
    private Date sysUserRegisterDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_register_source
     *
     * @mbggenerated
     */
    private String sysUserRegisterSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_type
     *
     * @mbggenerated
     */
    private String sysUserType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_sex
     *
     * @mbggenerated
     */
    private String sysUserSex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_is_email_active
     *
     * @mbggenerated
     */
    private String sysUserIsEmailActive;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_is_mobile_active
     *
     * @mbggenerated
     */
    private String sysUserIsMobileActive;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_register_type
     *
     * @mbggenerated
     */
    private String sysUserRegisterType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_pay_passwrod
     *
     * @mbggenerated
     */
    private String sysUserPayPasswrod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_icon
     *
     * @mbggenerated
     */
    private String sysUserIcon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_real_name
     *
     * @mbggenerated
     */
    private String sysUserRealName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_email
     *
     * @mbggenerated
     */
    private String sysUserEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_mobile
     *
     * @mbggenerated
     */
    private String sysUserMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_weibo_id
     *
     * @mbggenerated
     */
    private String sysUserWeiboId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sys_user_qq_id
     *
     * @mbggenerated
     */
    private String sysUserQqId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_id
     *
     * @return the value of sys_user.sys_user_id
     *
     * @mbggenerated
     */
    public Long getSysUserId() {
        return sysUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_id
     *
     * @param sysUserId the value for sys_user.sys_user_id
     *
     * @mbggenerated
     */
    public void setSysUserId(Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_login_name
     *
     * @return the value of sys_user.sys_user_login_name
     *
     * @mbggenerated
     */
    public String getSysUserLoginName() {
        return sysUserLoginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_login_name
     *
     * @param sysUserLoginName the value for sys_user.sys_user_login_name
     *
     * @mbggenerated
     */
    public void setSysUserLoginName(String sysUserLoginName) {
        this.sysUserLoginName = sysUserLoginName == null ? null : sysUserLoginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_login_password
     *
     * @return the value of sys_user.sys_user_login_password
     *
     * @mbggenerated
     */
    public String getSysUserLoginPassword() {
        return sysUserLoginPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_login_password
     *
     * @param sysUserLoginPassword the value for sys_user.sys_user_login_password
     *
     * @mbggenerated
     */
    public void setSysUserLoginPassword(String sysUserLoginPassword) {
        this.sysUserLoginPassword = sysUserLoginPassword == null ? null : sysUserLoginPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_status
     *
     * @return the value of sys_user.sys_user_status
     *
     * @mbggenerated
     */
    public String getSysUserStatus() {
        return sysUserStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_status
     *
     * @param sysUserStatus the value for sys_user.sys_user_status
     *
     * @mbggenerated
     */
    public void setSysUserStatus(String sysUserStatus) {
        this.sysUserStatus = sysUserStatus == null ? null : sysUserStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_is_delete
     *
     * @return the value of sys_user.sys_user_is_delete
     *
     * @mbggenerated
     */
    public String getSysUserIsDelete() {
        return sysUserIsDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_is_delete
     *
     * @param sysUserIsDelete the value for sys_user.sys_user_is_delete
     *
     * @mbggenerated
     */
    public void setSysUserIsDelete(String sysUserIsDelete) {
        this.sysUserIsDelete = sysUserIsDelete == null ? null : sysUserIsDelete.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_register_datetime
     *
     * @return the value of sys_user.sys_user_register_datetime
     *
     * @mbggenerated
     */
    public Date getSysUserRegisterDatetime() {
        return sysUserRegisterDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_register_datetime
     *
     * @param sysUserRegisterDatetime the value for sys_user.sys_user_register_datetime
     *
     * @mbggenerated
     */
    public void setSysUserRegisterDatetime(Date sysUserRegisterDatetime) {
        this.sysUserRegisterDatetime = sysUserRegisterDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_register_source
     *
     * @return the value of sys_user.sys_user_register_source
     *
     * @mbggenerated
     */
    public String getSysUserRegisterSource() {
        return sysUserRegisterSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_register_source
     *
     * @param sysUserRegisterSource the value for sys_user.sys_user_register_source
     *
     * @mbggenerated
     */
    public void setSysUserRegisterSource(String sysUserRegisterSource) {
        this.sysUserRegisterSource = sysUserRegisterSource == null ? null : sysUserRegisterSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_type
     *
     * @return the value of sys_user.sys_user_type
     *
     * @mbggenerated
     */
    public String getSysUserType() {
        return sysUserType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_type
     *
     * @param sysUserType the value for sys_user.sys_user_type
     *
     * @mbggenerated
     */
    public void setSysUserType(String sysUserType) {
        this.sysUserType = sysUserType == null ? null : sysUserType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_sex
     *
     * @return the value of sys_user.sys_user_sex
     *
     * @mbggenerated
     */
    public String getSysUserSex() {
        return sysUserSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_sex
     *
     * @param sysUserSex the value for sys_user.sys_user_sex
     *
     * @mbggenerated
     */
    public void setSysUserSex(String sysUserSex) {
        this.sysUserSex = sysUserSex == null ? null : sysUserSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_is_email_active
     *
     * @return the value of sys_user.sys_user_is_email_active
     *
     * @mbggenerated
     */
    public String getSysUserIsEmailActive() {
        return sysUserIsEmailActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_is_email_active
     *
     * @param sysUserIsEmailActive the value for sys_user.sys_user_is_email_active
     *
     * @mbggenerated
     */
    public void setSysUserIsEmailActive(String sysUserIsEmailActive) {
        this.sysUserIsEmailActive = sysUserIsEmailActive == null ? null : sysUserIsEmailActive.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_is_mobile_active
     *
     * @return the value of sys_user.sys_user_is_mobile_active
     *
     * @mbggenerated
     */
    public String getSysUserIsMobileActive() {
        return sysUserIsMobileActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_is_mobile_active
     *
     * @param sysUserIsMobileActive the value for sys_user.sys_user_is_mobile_active
     *
     * @mbggenerated
     */
    public void setSysUserIsMobileActive(String sysUserIsMobileActive) {
        this.sysUserIsMobileActive = sysUserIsMobileActive == null ? null : sysUserIsMobileActive.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_register_type
     *
     * @return the value of sys_user.sys_user_register_type
     *
     * @mbggenerated
     */
    public String getSysUserRegisterType() {
        return sysUserRegisterType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_register_type
     *
     * @param sysUserRegisterType the value for sys_user.sys_user_register_type
     *
     * @mbggenerated
     */
    public void setSysUserRegisterType(String sysUserRegisterType) {
        this.sysUserRegisterType = sysUserRegisterType == null ? null : sysUserRegisterType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_pay_passwrod
     *
     * @return the value of sys_user.sys_user_pay_passwrod
     *
     * @mbggenerated
     */
    public String getSysUserPayPasswrod() {
        return sysUserPayPasswrod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_pay_passwrod
     *
     * @param sysUserPayPasswrod the value for sys_user.sys_user_pay_passwrod
     *
     * @mbggenerated
     */
    public void setSysUserPayPasswrod(String sysUserPayPasswrod) {
        this.sysUserPayPasswrod = sysUserPayPasswrod == null ? null : sysUserPayPasswrod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_icon
     *
     * @return the value of sys_user.sys_user_icon
     *
     * @mbggenerated
     */
    public String getSysUserIcon() {
        return sysUserIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_icon
     *
     * @param sysUserIcon the value for sys_user.sys_user_icon
     *
     * @mbggenerated
     */
    public void setSysUserIcon(String sysUserIcon) {
        this.sysUserIcon = sysUserIcon == null ? null : sysUserIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_real_name
     *
     * @return the value of sys_user.sys_user_real_name
     *
     * @mbggenerated
     */
    public String getSysUserRealName() {
        return sysUserRealName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_real_name
     *
     * @param sysUserRealName the value for sys_user.sys_user_real_name
     *
     * @mbggenerated
     */
    public void setSysUserRealName(String sysUserRealName) {
        this.sysUserRealName = sysUserRealName == null ? null : sysUserRealName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_email
     *
     * @return the value of sys_user.sys_user_email
     *
     * @mbggenerated
     */
    public String getSysUserEmail() {
        return sysUserEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_email
     *
     * @param sysUserEmail the value for sys_user.sys_user_email
     *
     * @mbggenerated
     */
    public void setSysUserEmail(String sysUserEmail) {
        this.sysUserEmail = sysUserEmail == null ? null : sysUserEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_mobile
     *
     * @return the value of sys_user.sys_user_mobile
     *
     * @mbggenerated
     */
    public String getSysUserMobile() {
        return sysUserMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_mobile
     *
     * @param sysUserMobile the value for sys_user.sys_user_mobile
     *
     * @mbggenerated
     */
    public void setSysUserMobile(String sysUserMobile) {
        this.sysUserMobile = sysUserMobile == null ? null : sysUserMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_weibo_id
     *
     * @return the value of sys_user.sys_user_weibo_id
     *
     * @mbggenerated
     */
    public String getSysUserWeiboId() {
        return sysUserWeiboId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_weibo_id
     *
     * @param sysUserWeiboId the value for sys_user.sys_user_weibo_id
     *
     * @mbggenerated
     */
    public void setSysUserWeiboId(String sysUserWeiboId) {
        this.sysUserWeiboId = sysUserWeiboId == null ? null : sysUserWeiboId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sys_user_qq_id
     *
     * @return the value of sys_user.sys_user_qq_id
     *
     * @mbggenerated
     */
    public String getSysUserQqId() {
        return sysUserQqId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sys_user_qq_id
     *
     * @param sysUserQqId the value for sys_user.sys_user_qq_id
     *
     * @mbggenerated
     */
    public void setSysUserQqId(String sysUserQqId) {
        this.sysUserQqId = sysUserQqId == null ? null : sysUserQqId.trim();
    }
}