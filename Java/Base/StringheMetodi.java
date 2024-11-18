public class StringheMetodi {

    public static void main(String[] args){
        
        String txt = "ABCDEFG";
        System.out.println("Lenght of txt is: " + txt.length());

        System.out.println(txt.toUpperCase()); //TUTTO MAIUSCOLO
        System.out.println(txt.toLowerCase()); //tutto minuscolo
        System.out.println("Ciao Mondo");

        String txt2 = "Please locate where 'locate' occurs";
        System.out.println(txt2.indexOf("locate")); // settima posizione inizia il primo locate

        String firstName ="John";
        String lastName = "Doe";
        System.out.println(firstName +" " + lastName); //spazio inserito manualmente
        System.out.println(firstName.concat(lastName)); //aggiungere uno spazio dopo John 

        //Special Character
        // \' per fare '
        // \" per fare "
        // \\ per fare \



    }
    
}
