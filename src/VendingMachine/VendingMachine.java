package VendingMachine;

import Item.Item;
import State.IState;
import ItemShelf.ItemShelf;
import Item.ItemType;
import Coin.Coin;
import State.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    IState state;
    List<ItemShelf> itemList;
    List<Coin> coinList;

    public VendingMachine() {
        this.itemList = new ArrayList<>();
        this.coinList = new ArrayList<Coin>();
        this.setState(new IdleState());
        this.setupItems();
    }

    public void setupItems() {
        for(int i=0;i<30;i++) {
            Item item = null;
            if(i/10 == 0) {
                 item = new Item(i,20, ItemType.LASSI);
            }
            else if(i/10 == 1) {
                item = new Item(i, 10, ItemType.LAYS);
            }
            else {
                item = new Item(i, 30, ItemType.PEPSI);
            }
            ItemShelf shelf = new ItemShelf(item, i, 100+i);
            itemList.add(shelf);
        }
    }

    public List<ItemShelf> getItemList() {
        return itemList;
    }
    public List<Coin> getCoinList() {
        return coinList;
    }
    public void setItemList(List<ItemShelf> itemList) {
        this.itemList = itemList;
    }
    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }
}
