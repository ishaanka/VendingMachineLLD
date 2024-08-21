package Coin;

public enum Coin {
    OneRupee(1),
    FiveRupee(5),
    TenRupee(10);

    public final int value;

    Coin(int value) {
        this.value = value;
    }
}
