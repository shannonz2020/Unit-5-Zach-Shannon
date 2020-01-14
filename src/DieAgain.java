public class DieAgain implements Lockable {
    private int face;

    private int key = 0;
    private boolean isLocked = false;

    public DieAgain(){ face = 1; }

    public void roll(){
        if (!isLocked){
            face = (int) (Math.random() * (6) + 1);
        }
    }
    public String toString() {
        if (!isLocked){
            return "You rolled " + face;
        }else{
            return "This class is locked";
        }
    }

    public void setFace(int face) {
        this.face = face;
    }
    public int getFace() {
        return face;
    }

    //Lockable stuff
    public void setKey(int key){
        if (!isLocked){
            this.key = key;
        }
    }
    public void lock(int key){
        if(key == this.key){
            isLocked = true;
        }else{
            System.out.println("Error: Wrong key");
        }
    }
    public void unlock(int key){
        if(key == this.key){
            isLocked = false;
        }else{
            System.out.println("Error: Wrong key");
        }
    }
    public boolean isLocked(){
        return isLocked;
    }
}
