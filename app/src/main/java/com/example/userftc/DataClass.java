package com.example.userftc;

public class DataClass {
    private String dataName;
    private String dataDesc;
    private String dataAddress;
    private String dataImage;
    private String dataPhone;
    private String dataMap;
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDataName() {

        return dataName;
    }

    public String getDataDesc() {
        return dataDesc;
    }

    public String getDataAddress() {
        return dataAddress;
    }

    public String getDataImage() {
        return dataImage;
    }

    public String getDataPhone() {
        return dataPhone;
    }

    public String getDataMap() {
        return dataMap;
    }


    public DataClass(String dataName, String dataDesc, String dataAddress, String dataPhone, String dataMap, String dataImage) {
        this.dataName = dataName;
        this.dataDesc = dataDesc;
        this.dataAddress = dataAddress;
        this.dataPhone = dataPhone;
        this.dataMap = dataMap;
        this.dataImage = dataImage;
    }

    public DataClass() {

    }


}
