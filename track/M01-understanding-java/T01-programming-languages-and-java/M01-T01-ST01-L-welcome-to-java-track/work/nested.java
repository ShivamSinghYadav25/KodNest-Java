// to check eligible to watch movie 

public class nested {

    public static void main(String[] args) {
        boolean isTicket = true;
        int age = 50;
// using nested if-else
//         if (isTicket==true) {
//             if (age >= 18) {
//                 System.out.println("Eligible");
//             } else {nested if-else
//                 System.out.println("Not Eligible");
//             }
//         } else {
//             System.out.println("Invalid");
//         }
//     }
// }

// using single condition  .
        if (isTicket == true && age >= 18) {
            System.out.println("eligible");

        } else {
            System.out.println("not eligible");
        }
    }
}
