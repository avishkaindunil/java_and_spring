enum Status {
    Running,
    Failed,
    Pending,
    Success
}

public class MoreOnEnums {
    public static void main(String[] args){
        Status st = Status.Running;
        
        if(st == Status.Running){
            System.out.println("All Good");
        } else if (st == Status.Failed) {
            System.out.println("Try Again");
        } else if (st == Status.Pending){
            System.out.println("Please Wait");
        } else {
            System.out.println("Done");
        }
         
        switch(st){
            case Running :
                System.out.println("All Good ");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }
}
