public enum Direction {
    NORTH ("Polnoc"),
    SOUTH("Poludnie"),
    WEST("Zachod"),
    EAST("Wschod");

 private final String nD;
 private Direction(String nD){
     this.nD = nD;
 }
 public void printND(){
     System.out.println(this.nD);
 }

    public String getnD() {
        return nD;
    }
}