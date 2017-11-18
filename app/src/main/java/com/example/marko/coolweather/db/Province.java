package com.example.marko.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Marko on 2017/11/18.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int ProvinceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        ProvinceCode = provinceCode;
    }

    public int getId() {

        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return ProvinceCode;
    }
}
