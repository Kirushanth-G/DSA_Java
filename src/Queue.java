public class Queue {
    private int[] arr;
    private int capacity;
    private int end = 0;

    public Queue(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
    }

    public void enqueue(int num_to_insert){
        arr[end + 1] = num_to_insert;
        System.out.println("number: "+num_to_insert+" inserted successfully");
    }

    public int dequeue(){
        int num_removed = arr[0];
        return num_removed;
    }


}
