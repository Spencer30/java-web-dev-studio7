package org.launchcode.studio7;

public abstract class BaseDisc {
    String name;
    String discType;
    String discContent;
    int dataStorage;
    int rpm;

    public BaseDisc(String name, String discType, String discContent, int dataStorage, int rpm){
        this.name = name;
        this.discType = discType;
        this.discContent = discContent;
        this.dataStorage = dataStorage;
        this.rpm = rpm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getDiscContent() {
        return discContent;
    }

    public void setDiscContent(String discContent) {
        this.discContent = discContent;
    }

    public int getDataStorage() {
        return dataStorage;
    }

    public void setDataStorage(int dataStorage) {
        this.dataStorage = dataStorage;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
}
