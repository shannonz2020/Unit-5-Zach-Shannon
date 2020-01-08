public class Num {
    private int value;

    //constructors
    public Num(){
        value = 0;

    }
    public Num(int value){
        this.value = value;
    }

    //methods
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    public boolean equals(Num someNum){
        return this.value == someNum.getValue();
    }


}
