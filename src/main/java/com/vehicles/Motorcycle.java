package com.vehicles;

public class Motorcycle implements VehicleInterface {

    private boolean engineIsRunning;
    private String modelName;
    private Integer productionYear;

    public Motorcycle(String modelName, Integer productionYear) {
        setModelName(modelName);
        setProductionYear(productionYear);
    }

    public String crash(Car car) {
        return "crashed";
    }

    public String startEngine() {
        if (!engineIsRunning) {
            this.engineIsRunning = true;
            return "wrrrr";
        }

        return "already started";
    }

    public String stopEngine() {
        if (engineIsRunning) {
            this.engineIsRunning = false;
            return "stopped";
        }

        return "already stopped";
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getProductionYear() {
        return this.productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public boolean hasABSSystem() {
        return false;
    }

    public void setEngineIsRunning(boolean status) {
        this.engineIsRunning = status;
    }

    public boolean getEngineIsRunning() {
        return this.engineIsRunning;
    }
}
