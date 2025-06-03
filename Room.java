// Room.java
public class Room {
    private int roomNumber;
    private int floor;
    private int capacity;

    public Room(int roomNumber, int floor, int capacity) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.capacity = capacity;
    }

    public void printOccupation() {
        System.out.println("Room " + roomNumber + " on Floor " + floor + " with capacity " + capacity);
    }

    @Override
    public String toString() {
        return "Room No: " + roomNumber + ", Floor: " + floor + ", Capacity: " + capacity;
    }
}
