package com.lingxiujz.jz.entity.admin;

import java.util.Date;

public class LxAdminUserAuths {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lx_admin_user_auths.id
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lx_admin_user_auths.user_id
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lx_admin_user_auths.identity_type
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    private Integer identityType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lx_admin_user_auths.identifier
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    private String identifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lx_admin_user_auths.credential
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    private String credential;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lx_admin_user_auths.pw_salt
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    private String pwSalt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lx_admin_user_auths.login_count
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    private Long loginCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lx_admin_user_auths.lock_status
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    private Integer lockStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lx_admin_user_auths.last_anth_ip
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    private String lastAnthIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lx_admin_user_auths.last_anth_time
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    private Date lastAnthTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lx_admin_user_auths.create_time
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lx_admin_user_auths.id
     *
     * @return the value of lx_admin_user_auths.id
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lx_admin_user_auths.id
     *
     * @param id the value for lx_admin_user_auths.id
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lx_admin_user_auths.user_id
     *
     * @return the value of lx_admin_user_auths.user_id
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lx_admin_user_auths.user_id
     *
     * @param userId the value for lx_admin_user_auths.user_id
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lx_admin_user_auths.identity_type
     *
     * @return the value of lx_admin_user_auths.identity_type
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public Integer getIdentityType() {
        return identityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lx_admin_user_auths.identity_type
     *
     * @param identityType the value for lx_admin_user_auths.identity_type
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lx_admin_user_auths.identifier
     *
     * @return the value of lx_admin_user_auths.identifier
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lx_admin_user_auths.identifier
     *
     * @param identifier the value for lx_admin_user_auths.identifier
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lx_admin_user_auths.credential
     *
     * @return the value of lx_admin_user_auths.credential
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public String getCredential() {
        return credential;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lx_admin_user_auths.credential
     *
     * @param credential the value for lx_admin_user_auths.credential
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public void setCredential(String credential) {
        this.credential = credential == null ? null : credential.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lx_admin_user_auths.pw_salt
     *
     * @return the value of lx_admin_user_auths.pw_salt
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public String getPwSalt() {
        return pwSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lx_admin_user_auths.pw_salt
     *
     * @param pwSalt the value for lx_admin_user_auths.pw_salt
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public void setPwSalt(String pwSalt) {
        this.pwSalt = pwSalt == null ? null : pwSalt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lx_admin_user_auths.login_count
     *
     * @return the value of lx_admin_user_auths.login_count
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public Long getLoginCount() {
        return loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lx_admin_user_auths.login_count
     *
     * @param loginCount the value for lx_admin_user_auths.login_count
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public void setLoginCount(Long loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lx_admin_user_auths.lock_status
     *
     * @return the value of lx_admin_user_auths.lock_status
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public Integer getLockStatus() {
        return lockStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lx_admin_user_auths.lock_status
     *
     * @param lockStatus the value for lx_admin_user_auths.lock_status
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lx_admin_user_auths.last_anth_ip
     *
     * @return the value of lx_admin_user_auths.last_anth_ip
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public String getLastAnthIp() {
        return lastAnthIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lx_admin_user_auths.last_anth_ip
     *
     * @param lastAnthIp the value for lx_admin_user_auths.last_anth_ip
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public void setLastAnthIp(String lastAnthIp) {
        this.lastAnthIp = lastAnthIp == null ? null : lastAnthIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lx_admin_user_auths.last_anth_time
     *
     * @return the value of lx_admin_user_auths.last_anth_time
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public Date getLastAnthTime() {
        return lastAnthTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lx_admin_user_auths.last_anth_time
     *
     * @param lastAnthTime the value for lx_admin_user_auths.last_anth_time
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public void setLastAnthTime(Date lastAnthTime) {
        this.lastAnthTime = lastAnthTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lx_admin_user_auths.create_time
     *
     * @return the value of lx_admin_user_auths.create_time
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lx_admin_user_auths.create_time
     *
     * @param createTime the value for lx_admin_user_auths.create_time
     *
     * @mbggenerated Tue Apr 16 17:24:27 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}