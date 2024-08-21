package ItemShelf;

import Item.Item;

public class ItemShelf {
    Item item;
    int id;
    int code;

    public ItemShelf(Item item, int id, int code) {
        this.item = item;
        this.id = id;
        this.code = code;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
}
