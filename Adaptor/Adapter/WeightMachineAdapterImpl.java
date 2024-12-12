package Adaptor.Adapter;

import Adaptor.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeight() {
        return weightMachine.calculateWeight() * 0.45;
    }
}
