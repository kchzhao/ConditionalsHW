public class Main {
    public static void main(String[] args) {
        //Exercise 1
        System.out.println("Exercise 1");
        int age = 42;
        if(age >= 18){
           System.out.println("поздравляем с совершеннолетием");
        }

        if(age < 18) {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        //Exercise 2
        System.out.println();
        System.out.println("Exercise 2");
        if(age >= 7 && age < 18){
            System.out.println("ребенок ходит в школу");
        }

        if(age >= 18 && age < 24){
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if(age >= 24){
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }

        //Exercise 3
        System.out.println();
        System.out.println("Exercise 3");
        int passengersSitting = 50;
        int passengersStanding = 22;
        int totalNumOfPassengers = passengersSitting + passengersStanding;
        int sittingSpot = 60;
        int standingSpot = 42;
        int capacity = 102;
        int vacantSeat = sittingSpot - passengersSitting;
        int vacantStand = standingSpot - passengersStanding;
        if(totalNumOfPassengers > capacity) {
            System.out.println("The train is full");
        }
        if(totalNumOfPassengers <= capacity){
            System.out.println("There are " + vacantSeat + " available seats");
            System.out.println("There are " + vacantStand + " available standing spots");
        }

        //HW2 Exercise 1
        System.out.println();
        System.out.println("HW2 Exercise 1");
        if(age >= 18){
            System.out.println("поздравляем с совершеннолетием");
        }

        else {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        //HW2 Exercise 2
        System.out.println();
        System.out.println("HW2 Exercise 2");
        if(age >= 7 && age < 18){
            System.out.println("ребенок ходит в школу");
        }

        if(age >= 18 && age < 24){
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        else{
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }

        //HW2 Exercise 3
        System.out.println();
        System.out.println("HW2 Exercise 3");
        if(totalNumOfPassengers > capacity) {
            System.out.println("The train is full");
        }
        else{
            System.out.println("There are " + vacantSeat + " available seats");
            System.out.println("There are " + vacantStand + " available standing spots");
        }

        //HW3 Exercise 1
        System.out.println();
        System.out.println("HW3 Exercise 1");
        boolean goToKinderGarten = age >= 2 && age <= 6;
        boolean goToSchool = age >= 7 && age <= 18;
        boolean goToUniversity = age > 18 && age < 24;
        //boolean goToWork = age > 24;
        if(goToKinderGarten){
            System.out.println("Если возраст человека равен " + age + ", человеку нужно ходить в детский сад");
        }
        else if(goToSchool){
            System.out.println("Если возраст человека равен " + age + ", человеку нужно ходить в школу");
        }
        else if(goToUniversity){
            System.out.println("Если возраст человека равен " + age + ", человеку нужно ходить в университет");
        }
        else{
            System.out.println("Если возраст человека равен " + age + ", человеку нужно ходить на работу");
        }

        //HW3 Exercise 2
        System.out.println();
        System.out.println("HW3 Exercise 2");
        boolean cannotGoOnARide = age < 5;
        boolean canGoOnARideWithAdult = age > 5 && age < 14;


        if(cannotGoOnARide){
            System.out.println("Cannot go on a ride");
        }
        else if(canGoOnARideWithAdult){
            System.out.println("Can go on a ride with an adult");
        }
        else{
            System.out.println("Can go on a ride");
        }

        //HW3 Exercise 3
        System.out.println();
        System.out.println("HW3 Exercise 3");
        int one = 3;
        int two = 0;
        int three = 1;

        if(one > two && one > three){
            System.out.println("Var one is the biggest number it = " + one);
        }
        else if(two > one && two > three ){
            System.out.println("Var two is the biggest number it = " + two);
        }
        else{
            System.out.println("Var three is the biggest number it = " + three);
        }


    }
}