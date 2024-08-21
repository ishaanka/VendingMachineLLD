package State;
import Item.Item;
import VendingMachine.VendingMachine;
import Coin.Coin;

import java.util.List;

public abstract class IState {
    public abstract void pressInsertCoinButton(VendingMachine machine) throws Exception;
    public abstract void InsertCoins(VendingMachine machine, List<Coin> coins) throws Exception;
    public abstract void selectProduct(VendingMachine machine) throws Exception;
    public abstract int processRefund(VendingMachine machine) throws Exception;
    public abstract void countCoins(VendingMachine machine, Item item) throws Exception;
    public abstract void dispenseProduct(VendingMachine machine) throws Exception;
}
