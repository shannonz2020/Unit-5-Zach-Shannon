public class Num implements Comparable{
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
    public String toString() {
        return "" + value;
    }
    public boolean equals(Num someNum){ return this.value == someNum.getValue(); }

    public int compareTo(Object anotherOtherSecondObject){
        Num otherNum = (Num) anotherOtherSecondObject;
        return this.getValue() - otherNum.getValue();
    }
}
