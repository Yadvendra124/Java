public class Stringgs {
   
        public static void main(String[] args) {
            String s1 = "Yadvendra";
            String s2 = "Singh";
            String s3 = "Chouhan";
            String fullName = s1+" "+s2+" "+s3; //adding string
            System.out.println(fullName);
            System.out.println(fullName.length());  //to check length of array
            System.out.println(fullName.charAt(5));//to find character at index
    
            System.out.println(fullName.substring(3, 8));//to find substring
    
            StringBuilder s4 = new StringBuilder(fullName);
             s4.insert(4,"Yad");//to insert the string
    
            String s5 = s4.toString();
            System.out.println( s5);
            s4.setCharAt(4, 'Y');
            System.out.println(s4);
            System.out.println(fullName.toLowerCase());//to change uppercase & lowercase
            System.out.println(fullName.toUpperCase());
            s4.append(" 123");
            System.out.println(s4);
    
        }
    }
    
    

