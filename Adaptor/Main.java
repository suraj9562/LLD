package Adaptor;

import Adaptor.Adaptee.WeightMachineImpl;
import Adaptor.Adapter.WeightMachineAdapter;
import Adaptor.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter adapter = new WeightMachineAdapterImpl(new WeightMachineImpl());

        System.out.println(adapter.getWeight());
    }
}
