package com.wistaria.model;


import lombok.Data;

import java.util.Date;

/**
 * 垃圾分类
 */
@Data
public class JunkTypesModel {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 类别 1湿垃圾-- 2干垃圾-- 3可回收垃圾-- 4有害垃圾
     * 对应的垃圾类别表的主键ID
     */
    private String category;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 修改人
     */
    private String updater;

    /**
     * 创建时间
     */
    private Date cTime;

    /**
     * 修改时间
     */
    private Date uTime;
}