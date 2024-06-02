public class Main {
    public static void main(String[] args) {
        int number1 =3;
        int number2 =5;
        int number3 =8;
        int number4 =10;
        int result = calc(number1, number2, number3, number4);

        System.out.println("The average is: " + result);

        int result2 = fruits("banana", "apple","pear");
        System.out.println("sum is " + result2);

    }
    public static int calc(int number1, int number2, int number3, int number4){
        int sum = number1 + number2 + number3 + number4;
        int average = sum / 4;
        return average;

    }


    public static int fruits(String fruit1, String fruit2, String fruit3){
        int sum = fruit1.length()+fruit2.length()+fruit3.length();
        return sum;
    }

}


//1.დაწერე მეთოდი, რომელსაც გადაეცემა 4
//რიცხვი და აბრუნებს ამ 4 რიცხვის
//საშუალოს
//2/დაწერე მეთოდი, რომელსაც გადაეცემა 3
//სტრინგი და აბრუნებს ამსტრინგების
//სიგრძეების ჯამს

