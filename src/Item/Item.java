package Item;

public class Item {
    int price;
    int id;
    ItemType itemType;

    public Item(int id, int price, ItemType itemType) {
        this.id = id;
        this.price = price;
        this.itemType = itemType;
    }

    public int getPrice() {
        return this.price;
    }

    public ItemType getItemType() {
        return this.itemType;
    }
}
