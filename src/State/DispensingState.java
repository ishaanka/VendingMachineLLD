package State;

import Coin.Coin;
import Item.Item;
import VendingMachine.VendingMachine;

import java.util.List;

public class DispensingState extends IState{
    @Override
    public void pressInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Invalid state");
    }

    @Override
    public void InsertCoins(VendingMachine machine, List<Coin> coins) throws Exception {
        throw new Exception("Invalid state");
    }

    @Override
    public void selectProduct(VendingMachine machine) throws Exception {
        throw new Exception("Invalid state");
    }
    @Override
    public int processRefund(VendingMachine machine) throws Exception {
        throw new Exception("Invalid state");
    }

    @Override
    public void countCoins(VendingMachine machine, Item item) throws Exception {
        throw new Exception("Invalid state");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) throws Exception {
        System.out.println("Dispensing Item");
        machine.setState(new IdleState());
    }
}
