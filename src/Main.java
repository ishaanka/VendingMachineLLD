import VendingMachine.VendingMachine;

import java.util.ArrayList;
import java.util.List;
import Coin.Coin;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello from Vending Machine!");
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getState().pressInsertCoinButton(vendingMachine);
        List<Coin> coinsList = new ArrayList<Coin>();
        coinsList.add(Coin.TenRupee);
        coinsList.add(Coin.TenRupee);
        coinsList.add(Coin.TenRupee);

        vendingMachine.getState().InsertCoins(vendingMachine, coinsList);
        vendingMachine.getState().selectProduct(vendingMachine);
        vendingMachine.getState().dispenseProduct(vendingMachine);
    }
}