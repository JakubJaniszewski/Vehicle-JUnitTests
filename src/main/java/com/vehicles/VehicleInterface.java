package com.vehicles;

public interface VehicleInterface {

    String startEngine();
    String stopEngine();

    String getModelName();
    void setModelName(String modelName);
    Integer getProductionYear();
    void setProductionYear(Integer productionYear);

    boolean hasABSSystem();
}