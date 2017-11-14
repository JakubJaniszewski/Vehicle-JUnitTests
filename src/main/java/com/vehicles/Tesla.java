package com.vehicles;

public class Tesla extends Car {

    private Integer batteryStatus; //in percent

    public Tesla(String modelName, Integer productionYear, boolean hasABS) {
        setModelName(modelName);
        setProductionYear(productionYear);
        setHasABS(hasABS);
        setBatteryStatus(0);
    }

    @Override
    public String startEngine() {
        if (!isEngineRunning() && !batteryStatus.equals(0)) {
            setEngineIsRunning(true);
            return "wrrr";
        } else {
            return "no power";
        }
    }

    public String outrun(VehicleInterface vehicle) {
        return "outrunned";
    }

    public void chargeBattery(Integer minutes) {
        this.batteryStatus += minutes;

        if(batteryStatus > 100) {
            this.batteryStatus = 100;
        }
    }

    public Integer getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(Integer batteryStatus) {
        this.batteryStatus = batteryStatus;
    }
}
