enum Status {
    Running,
    Failed,
    Pending,
    Success
}

public class Enum {
    public static void main(String[] args){
        Status st = Status.Running;
        System.out.println(st);
        System.out.println(st.ordinal()); // Can get the index of the selected enum 

        Status[] stOne = Status.values();
        System.out.println(stOne[0]);

        for(Status stat : stOne){ // Print all the values in the Status Enum
            System.out.println(stat + " " + stat.ordinal());
        }
    }
}
