package com.xcode.hjycommunity.community.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xcode.hjycommunity.common.core.domain.BaseEntity;

import java.util.Date;

public class HjyCommunityDto extends BaseEntity {


    private static final long serialVersionUID = 1729545002964804405L;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long communityId;
    /**
     * 小区名称
     */
    private String communityName;
    /**
     * 小区编码
     */
    private String communityCode;

    /**
     * 省区划码
     */
    private String communityProvinceCode;
    private String communityProvinceName;

    /**
     * 市区划码
     */
    private String communityCityCode;
    private String communityCityName;
    /**
     * 区县区划码
     */
    private String communityTownCode;
    private String communityTownName;
    /**
     * 详细地址
     */
    private String communityDetailedAddress;
    /**
     * 经度
     */
    private String communityLongitude;
    /**
     * 纬度
     */
    private String communityLatitude;
    /**
     * 物业id
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long deptId;
    /**
     * 排序
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Integer communitySort;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新者
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 备注
     */
    private String remark;


    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityCode() {
        return communityCode;
    }

    public void setCommunityCode(String communityCode) {
        this.communityCode = communityCode;
    }

    public String getCommunityProvinceCode() {
        return communityProvinceCode;
    }

    public void setCommunityProvinceCode(String communityProvinceCode) {
        this.communityProvinceCode = communityProvinceCode;
    }

    public String getCommunityCityCode() {
        return communityCityCode;
    }

    public void setCommunityCityCode(String communityCityCode) {
        this.communityCityCode = communityCityCode;
    }

    public String getCommunityTownCode() {
        return communityTownCode;
    }

    public void setCommunityTownCode(String communityTownCode) {
        this.communityTownCode = communityTownCode;
    }

    public String getCommunityDetailedAddress() {
        return communityDetailedAddress;
    }

    public void setCommunityDetailedAddress(String communityDetailedAddress) {
        this.communityDetailedAddress = communityDetailedAddress;
    }

    public String getCommunityLongitude() {
        return communityLongitude;
    }

    public void setCommunityLongitude(String communityLongitude) {
        this.communityLongitude = communityLongitude;
    }

    public String getCommunityLatitude() {
        return communityLatitude;
    }

    public void setCommunityLatitude(String communityLatitude) {
        this.communityLatitude = communityLatitude;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Integer getCommunitySort() {
        return communitySort;
    }

    public void setCommunitySort(Integer communitySort) {
        this.communitySort = communitySort;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCommunityProvinceName() {
        return communityProvinceName;
    }

    public void setCommunityProvinceName(String communityProvinceName) {
        this.communityProvinceName = communityProvinceName;
    }

    public String getCommunityCityName() {
        return communityCityName;
    }

    public void setCommunityCityName(String communityCityName) {
        this.communityCityName = communityCityName;
    }

    public String getCommunityTownName() {
        return communityTownName;
    }

    public void setCommunityTownName(String communityTownName) {
        this.communityTownName = communityTownName;
    }
}
