package State;

import Coin.Coin;
import Item.Item;
import VendingMachine.VendingMachine;
import ItemShelf.ItemShelf;

import java.util.ArrayList;
import java.util.List;

public class SelectionState extends IState {
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
        int selectionCode = 110;
        List<ItemShelf> items = machine.getItemList();

        for(int i = 0; i < items.size(); i++) {
            ItemShelf itemShelf = items.get(i);
            if(itemShelf.getCode() == selectionCode) {
                Item item = itemShelf.getItem();
                System.out.println("Selecting product : "+item.getItemType());
                this.countCoins(machine, item);
                return;
            }
        }
    }
    @Override
    public int processRefund(VendingMachine machine) throws Exception {
        throw new Exception("Invalid state");
    }

    @Override
    public void countCoins(VendingMachine machine, Item item) throws Exception {
          List<Coin> coins = machine.getCoinList();
          int sum = 0;
          for(Coin coin : coins) {
              sum += coin.value;
          }
          if(sum == item.getPrice()) {
              System.out.println("Payment Received!");
              machine.setState(new DispensingState());
          }
          else if(sum > item.getPrice()) {
              System.out.println("Payment Received! And collect balance");
              machine.setState(new DispensingState());
              // process refund
          }
          else {
              System.out.println("Not Enough Money!");
              //process refund
              machine.setCoinList(new ArrayList<>());
              machine.setState(new IdleState());
          }
    }

    @Override
    public void dispenseProduct(VendingMachine machine) throws Exception {
        throw new Exception("Invalid state");
    }
}
