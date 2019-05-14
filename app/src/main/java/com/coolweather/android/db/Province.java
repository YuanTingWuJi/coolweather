package com.coolweather.android.db;

import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {
    /**
     * interface fields
     */
    private int id;
    private String provinceName;
    private int provinceCode;

    /**
     * mutator and accessor
     * @return
     */
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
