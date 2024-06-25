class Room {

    int roomNo;
    double area;
    String type;
    boolean hasAc;

    public void setData(int roomNo, double area, String type, boolean hasAc) 
    {
        this.roomNo = roomNo;
        this.area = area;
        this.type = type;
        this.hasAc = hasAc;
    }

    public void displayData() 
    {
        System.out.println("Room No: " + roomNo);
        System.out.println("Area: " + area + " sq ft");
        System.out.println("Type: " + type);
        System.out.println("AC Machine: " + (hasAc ? "Yes" : "No"));
    }

    public static void main(String[] args) {
       
        Room room1 = new Room();
        room1.setData(101, 200.0, "2-bed", true);

        Room room2 = new Room();
        room2.setData(102, 200.0, "4-bed", true);

  
        room1.displayData();
        room2.displayData();
    }
}
