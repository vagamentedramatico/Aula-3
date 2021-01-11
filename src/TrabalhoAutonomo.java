import java.util.Scanner;

public class TrabalhoAutonomo {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

///////////////////////////////////////

// 10
    System.out.println("Input 1st number");
    int N1 = in.nextInt();

    System.out.println("Input 2nd number");
    int N2 = in.nextInt();

    System.out.println("Input 3rd number");
    int N3 = in.nextInt();

    if (N1 >= N2)
        if (N2 >= N3)
            System.out.println(N1 + ">" + N2 + ">" + N3);

    if (N1 >= N3)
        if (N3 >= N2)
            System.out.println(N1 + ">" + N3 + ">" + N2);

    if (N2 >= N1)
        if (N1 >= N3)
            System.out.println(N2 + ">" + N1 + ">" + N3);

    if (N2 >= N3)
        if (N3 >= N1)
            System.out.println(N2 + ">" + N3 + ">" + N1);

    if (N3 >= N2)
        if (N2 >= N1)
            System.out.println(N3 + ">" + N2 + ">" + N1);

    if (N3 >= N1)
        if (N1 >= N2)
            System.out.println(N3 + ">" + N1 + ">" + N2);
// 9
    System.out.println("Please insert your month of birth (M or MM)");
    int bMM = in.nextInt();

    System.out.println("Plase insert your day of birth (D or DD)");
    int bDD = in.nextInt();

    if (bMM == 1)
        if (bDD >= 1)
            if (bDD <= 19)
                System.out.println("Capricorn");

    if (bMM == 1)
        if (bDD >= 20)
            if (bDD <= 31)
                System.out.println("Aquarius");

    if (bMM == 2)
        if (bDD >= 1)
            if (bDD <= 18)
                System.out.println("Aquarius");

    if (bMM == 2)
        if (bDD >= 19)
            if (bDD <= 29)
                System.out.println("Pisces");

    if (bMM == 3)
        if (bDD >= 1)
            if (bDD <= 20)
                System.out.println("Pisces");

    if (bMM == 3)
        if (bDD >= 21)
            if (bDD <= 31)
                System.out.println("Aries");

    if (bMM == 4)
        if (bDD >= 1)
            if (bDD <= 19)
                System.out.println("Aries");

    if (bMM == 4)
        if (bDD >= 20)
            if (bDD <= 30)
                System.out.println("Taurus");

    if (bMM == 5)
        if (bDD >= 1)
            if (bDD <= 20)
                System.out.println("Taurus");

    if (bMM == 5)
        if (bDD >= 21)
            if (bDD <= 31)
                System.out.println("Gemini");

    if (bMM == 6)
        if (bDD >= 1)
            if (bDD <= 20)
                System.out.println("Gemini");

    if (bMM == 6)
        if (bDD >= 21)
            if (bDD <= 30)
                System.out.println("Cancer");

    if (bMM == 7)
        if (bDD >= 1)
            if (bDD <= 22)
                System.out.println("Cancer");

    if (bMM == 7)
        if (bDD >= 23)
            if (bDD <= 31)
                System.out.println("Leo");

    if (bMM == 8)
        if (bDD >= 1)
            if (bDD <= 22)
                System.out.println("Leo");

    if (bMM == 8)
        if (bDD >= 23)
            if (bDD <= 31)
                System.out.println("Virgo");

    if (bMM == 9)
        if (bDD >= 1)
            if (bDD <= 22)
                System.out.println("Virgo");

    if (bMM == 9)
        if (bDD >= 23)
            if (bDD <= 30)
                System.out.println("Libra");

    if (bMM == 10)
        if (bDD >= 1)
            if (bDD <= 22)
                System.out.println("Libra");

    if (bMM == 10)
        if (bDD >= 23)
            if (bDD <= 31)
                System.out.println("Scorpio");

    if (bMM == 11)
        if (bDD >= 1)
            if (bDD <= 21)
                System.out.println("Scorpio");

    if (bMM == 11)
        if (bDD >= 22)
            if (bDD <= 30)
                System.out.println("Sagittarius");

    if (bMM == 12)
        if (bDD >= 1)
            if (bDD <= 21)
                System.out.println("Sagittarius");

    if (bMM == 12)
        if (bDD >= 22)
            if (bDD <= 31)
                System.out.println("Capricorn");

            else
                System.out.println("N/A");
// 8
    System.out.println("Please insert the month's number.");
    int month = in.nextInt();

    switch (month) {
        case (1) -> System.out.println("Janeiro");
        case (2) -> System.out.println("Fevereiro");
        case (3) -> System.out.println("Março");
        case (4) -> System.out.println("Abril");
        case (5) -> System.out.println("Maio");
        case (6) -> System.out.println("Junho");
        case (7) -> System.out.println("Julho");
        case (8) -> System.out.println("Agosto");
        case (9) -> System.out.println("Setembro");
        case (10) -> System.out.println("Outubro");
        case (11) -> System.out.println("Novembro");
        case (12) -> System.out.println("Dezembro");
        default -> System.out.println("DOES NOT COMPUTE");
    }
// 7
    System.out.println("Insert score.");
    int score = in.nextInt();

    if (score > 100)
        System.out.println("Invalid score");

    if (score <= 100)
        if (score >= 90)
            System.out.println("Excelent");

    if (score < 90)
        if (score >= 80)
            System.out.println("Very good");

    if (score < 80)
        if (score >= 70)
            System.out.println("Good");

    if (score < 70)
        if (score >= 50)
            System.out.println("Bad");

    if (score < 50)
        if (score >= 30)
            System.out.println("Very bad");

    if (score < 30)
        if (score >= 0)
            System.out.println("I can't even.");

        else
            System.out.println("Invlaid score");

// 6
    System.out.println("What vehicle do you use?");
    String vehicle = in.next();

    switch (vehicle) {
        case ("car"):
            System.out.println("Your vehicle has 4 wheels.");
            break;
        case ("moto"):
            System.out.println("Your vehicle has 2 wheels.");
            break;
        case ("bicycle"):
            System.out.println("Your vehicle has 2 wheels.");
            break;
        case ("tricycle"):
            System.out.println("Your vehicle has 3 wheels.");
            break;
        case ("truck"):
            System.out.println("Your vehicle has infinity wheels.");
    }
// 5
    in.nextLine();
    System.out.println("Please type your first name.");
    String name = in.nextLine();
    System.out.println("Your name is " + name + ".");
// 4
    System.out.println("Please insert a positive number.");
    int positiveNumber = in.nextInt();

    if (positiveNumber >= 0)
        System.out.println("True.");

    else
        System.out.println("False");
// 3
    System.out.println("Please insert an even number.");
    int evenNumber = in.nextInt();

    if (evenNumber % 2 == 0)
        System.out.println("True.");

    else
        System.out.println("False.");
// 2
    System.out.println("Please insert your first number.");
    int firstNumber = in.nextInt();

    System.out.println("Please insert your second number.");
    int secondNumber = in.nextInt();

    if (secondNumber == 0)
        System.out.println("0");

    else
        System.out.println(firstNumber / secondNumber);
// 1
    System.out.println("In which year were you born?");
    int birthYear = in.nextInt();
    int currentAge = 2020 - birthYear;
    System.out.println("You are currently " + currentAge + " years old.");
    }
}
