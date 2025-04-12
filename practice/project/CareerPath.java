import java.util.Scanner;

class CareerPath {
  
    public static void main(String[] args) {
        
        Scanner choose = new Scanner(System.in);
        System.out.println("Congratulations on passing 10th!");
        System.out.println("Choose a path:");
        System.out.println("\n1. Engineering Diploma");
        System.out.println("2. L.I.C Agent");
        System.out.println("3. Defense");
        System.out.println("4. Fine Art / Commercial Art");
        System.out.println("5. Art Teacher Diploma");
        System.out.println("6. ITI");
        System.out.println("7. Railway Ticket/Commerce Clerk Exam");
        System.out.println("8. H.S.C");
        System.out.println("9. Bank/Insurance Exam");
        System.out.println("10. Other Government Exam");
        System.out.println("11. Diploma in Dance/Music");
        System.out.println("12. Diploma in Building Supervisor");
        System.out.println("13. Diploma in Farm Management");
        System.out.println("14. Medical Laboratory Technician");
        System.out.println("15. Various Diploma Courses");
        System.out.println("16. MS-CIT");

        int ssc = choose.nextInt();

        if (ssc == 1) {
            System.out.println("You have selected Engineering Diploma.");
            System.out.println("Choose a path:");
            System.out.println("\na. Government Contractor");
            System.out.println("b. Degree Engineering");
            System.out.println("c. (A.M.I.L)/(I.E.T.E)");
            System.out.println("d. R.T.O Inspector Exam");
            System.out.println("e. Merchant Navy");
            
            char diploma = choose.next().charAt(0);
            
            if (diploma == 'a') {
                System.out.println("Good choice: Government Contractor");
            } else if (diploma == 'b') {
                System.out.println("Good choice: BE Student");
            } else if (diploma == 'c') {
                System.out.println("Good choice: (A.M.I.L)/(I.E.T.E) Student. You can also give MPSC/UPSC Exam.");
            } else if (diploma == 'd') {
                System.out.println("Good choice: R.T.O Inspector");
            } else if (diploma == 'e') {
                System.out.println("Good choice: Merchant Navy");
            } else {
                System.out.println("Invalid input");
            }
        } else if (ssc == 2) {
            System.out.println("Good choice: L.I.C Agent");
        } else if (ssc == 3) {
            System.out.println("Good choice: Join Defense");
            System.out.println("You can join:\n1. Police\n2. Constable\n3. Airmen\n4. Navik\n5. Soldier");
        } else if (ssc == 4) {
            System.out.println("Good choice: Fine Art / Commercial Art");
        } else if (ssc == 5) {
            System.out.println("Good choice: Art Teacher Diploma");
        } else if (ssc == 6) {
            System.out.println("Good choice: ITI Student");
        } else if (ssc == 7) {
            System.out.println("Good choice: Railway Ticket/Commerce Clerk Exam");
        } else if (ssc == 8) {
            System.out.println("Good choice: HSC Student");
            System.out.println("Choose a path:");
            System.out.println("\na. 12th Commerce");
            System.out.println("b. Diploma in Travel and Tourism");
            System.out.println("c. Laboratory Technician");
            System.out.println("d. L.I.C Agent");
            System.out.println("e. Hotel Management");
            System.out.println("f. Science");
            System.out.println("g. Student Pilot Licence/Professional Pilot Licence/Commercial Pilot Licence");
            System.out.println("h. Arts");
            
            char hsc = choose.next().charAt(0);
            
            if (hsc == 'a') {
                System.out.println("You have chosen Commerce");
                System.out.println("Choose a path:");
                System.out.println("\na. C.A Foundation");
                System.out.println("b. B.Com");
                System.out.println("c. B.B.A");
                System.out.println("d. C.S Foundation");
                System.out.println("e. B.C.A");
                System.out.println("f. B.Arch");
                System.out.println("g. D.Ed");
                System.out.println("h. Call Center");
                
                char commerce = choose.next().charAt(0);
                
                if (commerce == 'a') {
                    System.out.println("Good choice: C.A Foundation");
                } else if (commerce == 'b') 
                {
                    System.out.println("Good choice: B.Com Student");
                    System.out.println("Choose a future path:");
                    System.out.println("\n1. MBA\n2. Bank/Insurance\n3. L.L.B\n4. C.A\n5. B.Ed\n6. I.C.W.A\n7. Library Science\n8. C.S\n9. Import Export Diploma\n10. M.C.A\n11. M.C.M\n12. MPSC/UPSE \n13. Computer courses\n14. Indian Military Academy");
                    int bcomPath = choose.nextInt();
                    if (bcomPath == 1) {
                        System.out.println("Good choice! MBA.");
                        System.out.println("your can also become Manager and Bussinessman");
                    } else if (bcomPath == 2) {
                        System.out.println("Good choice! Bank/Insurance sector.");
                    } else if (bcomPath == 3) {
                        System.out.println("Good choice! L.L.B.");
                        System.out.println("you can do L.L.M as well after it ");
                    } else if (bcomPath == 4) {
                        System.out.println("Good choice! C.A.");
                    }
                     else if (bcomPath == 5) {
                        System.out.println("Good choice! B.Ed.");
                        System.out.println("you can do M.Ed after it and become teacher");
                    } 
                     else if (bcomPath == 6) {
                        System.out.println("Good choice! I.C.W.A");
                      
                    } 
                     else if (bcomPath == 7) {
                        System.out.println("Good choice! Library Science");
                      
                    } 
                     else if (bcomPath == 8) {
                        System.out.println("Good choice! C.S");
                       
                    } 
                      
                     else if (bcomPath == 9) {
                        System.out.println("Good choice! import export Diplona");
                       
                    } 
                     else if (bcomPath == 10) {
                        System.out.println("Good choice! M.C.A");
                       
                    } 
                     else if (bcomPath == 11) {
                        System.out.println("Good choice! M.C.M");
                       
                    } 
                     else if (bcomPath == 12) {
                        System.out.println("Good choice! UPSE/MPSC");
                       
                    } 
                     else if (bcomPath == 13) {
                        System.out.println("Good choice! Computer course");
                       
                    } 
                     else if (bcomPath == 14) {
                        System.out.println("Good choice! Indian military Academy");
                       
                    } 
                    
                    else {
                        System.out.println("Invalid input.");
                    }
                } else if (commerce == 'c') {
                    System.out.println("Good choice: B.B.A Student");
                    System.out.println("you can also do M.B.A");

                } 
                else if (commerce == 'd') {
                    System.out.println("Good choice: C.S Foundation");
                }
                else if (commerce == 'e') {
                    System.out.println("Good choice: B.C.A Student");
                } else if (commerce == 'f') {
                    System.out.println("Good choice: B.Arch Student");
                } else if (commerce == 'g') {
                    System.out.println("Good choice: D.Ed Student");
                } else if (commerce == 'h') {
                    System.out.println("Good choice: Call Center");
                } else {
                    System.out.println("Invalid input");
                }
            }
        } else if (ssc == 9) {
            System.out.println("Good choice: Bank/Insurance Exam");
        } else if (ssc == 10) {
            System.out.println("Good choice: Other Government Exam");
        } else {
            System.out.println("Invalid input");
        }
        
        choose.close();
    }
}
