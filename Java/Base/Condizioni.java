public class Condizioni {
    public static void main(String[] args){
        
        int x = 20;
        int y = 18;

        if ( x > y) {
            System.out.println("x is grater than y");
        } else if ( x == y){
            System.out.println("x is equal to y");
        } else {
            System.out.println("x is not grater or equal than y");
        }

        //scorciatoia

        // variabile = (condizione) ? expressionTrue:expressionFalse; //sconsigliata -> non compresibile a tutti
        int time = 20;
        String result = (time<18) ? "good day" : "good evening";
        System.out.println(result);

        //switch (expression){
        //case x:
        // code block
        // break;
        //case y:
        // code block
        // break;
        //default:
        //}

        int day = 4;
        switch(day){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default: // break e default facoltative (default è come un else)
                System.out.println("Sunday");
        }


    }
    
}
