package com.vehicles;

public abstract class Car implements VehicleInterface {

    private String modelName;
    private Integer productionYear;
    private boolean engineIsRunning;
    private boolean hasABS;

    public String startEngine() {
        if (!engineIsRunning) {
            this.engineIsRunning = true;
            return "wrrrr";
        }

        return "already running";
    }

    public String stopEngine() {
        if (engineIsRunning) {
            this.engineIsRunning = false;
            return "stopped";
        }

        return "already stopped";
    }

    public boolean isEngineRunning() {
        return engineIsRunning;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public void setHasABS(boolean hasABS) {
        this.hasABS = hasABS;
    }

    public boolean hasABSSystem() {
        return hasABS;
    }

    public void setEngineIsRunning(boolean engineIsRunning) {
        this.engineIsRunning = engineIsRunning;
    }
}
