public class ThreeNumbers implements Comparable<ThreeNumbers>{
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public ThreeNumbers(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean compareTo(ThreeNumbers firstObjectWithThreeNumbers){
        if(firstObjectWithThreeNumbers.x == this.x){
            if(firstObjectWithThreeNumbers.y == this.y){
                if(firstObjectWithThreeNumbers.z == this.z){
                    return true;
                }
                else
                    return  false;
            }
            else
                return false;
        }
        else return false;

    }
}
