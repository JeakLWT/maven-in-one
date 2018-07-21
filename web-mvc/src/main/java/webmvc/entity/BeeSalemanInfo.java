package webmvc.entity;

import java.util.Date;

public class BeeSalemanInfo {
    private Long id;

    private String salemanNum;

    private String merchantNum;

    private String parentMerchantNum;

    private String salemanName;

    private String salemanPhone;

    private Integer status;

    private String inviteCode;

    private Date createTime;

    private Date updateTime;

    private Date activeTime;

    private Date resignTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSalemanNum() {
        return salemanNum;
    }

    public void setSalemanNum(String salemanNum) {
        this.salemanNum = salemanNum == null ? null : salemanNum.trim();
    }

    public String getMerchantNum() {
        return merchantNum;
    }

    public void setMerchantNum(String merchantNum) {
        this.merchantNum = merchantNum == null ? null : merchantNum.trim();
    }

    public String getParentMerchantNum() {
        return parentMerchantNum;
    }

    public void setParentMerchantNum(String parentMerchantNum) {
        this.parentMerchantNum = parentMerchantNum == null ? null : parentMerchantNum.trim();
    }

    public String getSalemanName() {
        return salemanName;
    }

    public void setSalemanName(String salemanName) {
        this.salemanName = salemanName == null ? null : salemanName.trim();
    }

    public String getSalemanPhone() {
        return salemanPhone;
    }

    public void setSalemanPhone(String salemanPhone) {
        this.salemanPhone = salemanPhone == null ? null : salemanPhone.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public Date getResignTime() {
        return resignTime;
    }

    public void setResignTime(Date resignTime) {
        this.resignTime = resignTime;
    }
}