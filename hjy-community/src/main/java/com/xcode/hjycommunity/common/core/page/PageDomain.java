package com.xcode.hjycommunity.common.core.page;

public class PageDomain {


    /*
    當前頁面
     */
    private Integer pageNum;

    /*
    每頁顯示紀錄
     */
    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
