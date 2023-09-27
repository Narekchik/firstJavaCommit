//public class Praktikum {
//
//    public static void main(String[] args) {
//        sayHello();
//        System.out.println("Твой самый дорогой корм стоил " + maxFeedExpenseCat);
//        System.out.println("Твой самый дорогой корм стоил " + maxFeedExpenseHamster);
//        sayEnjoyMeal();
//    }
//
//    public static double findMaxExpense(double[] expenses) {
//        double[] feedExpensesCat = { 100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4 };
//        double[] feedExpensesHamster = { 70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4 };
//
//        double maxFeedExpenseCat = 0;
//        for (int i = 0; i < feedExpensesCat.length; i++) {
//            if (feedExpensesCat[i] > maxFeedExpenseCat) {
//                maxFeedExpenseCat = feedExpensesCat[i];
//            }
//        }
//        return maxFeedExpenseCat;
//
//        double maxFeedExpenseHamster = 0;
//        for (int i = 0; i < feedExpensesHamster.length; i++) {
//            if (feedExpensesHamster[i] > maxFeedExpenseHamster) {
//                maxFeedExpenseHamster = feedExpensesHamster[i];
//            }
//        }
//        return maxFeedExpenseHamster;
//    }
//    public static void sayHello(String name) {
//        System.out.println("Привет, Пиксель!");
//        System.out.println("Привет, Байт!");
//    }
//
//    public static int findExpensesSum(double[] expenses) {
//        double sumFeedCat = 0;
//        for (int i = 0; i < feedExpensesCat.length; i++) {
//            sumFeedCat = sumFeedCat + feedExpensesCat[i];
//        }
//
//        System.out.println("Всего на корм было потрачено " + sumFeedCat);
//
//        double sumFeedHamster = 0;
//        for (int i = 0; i < feedExpensesHamster.length; i++) {
//            sumFeedHamster = sumFeedHamster + feedExpensesHamster[i];
//        }
//        System.out.println("Всего на корм было потрачено " + sumFeedHamster);
//    }
//
//    public static void sayEnjoyMeal() {
//        System.out.println("Приятного аппетита, Пиксель!");
//        System.out.println("Приятного аппетита, Байт!");
//    }
//
//}
//
//


public class Praktikum {

    public static void main(String[] args) {

        double[] feedExpensesCat = { 100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4 } ;
        double[] feedExpensesHamster = { 70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4 } ;
        sayHello("Пиксель");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesCat));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesCat));
        sayEnjoyMeal("Пиксель");
        sayHello("Байт");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesHamster));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesHamster));
        sayEnjoyMeal("Байт");
    }
    public static void sayHello(String name) {

        System.out.println("Привет, " + name +"!");
    }
    public static double findMaxExpense(double[] expenses) {
        double maxFeedExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxFeedExpense) {
                maxFeedExpense = expenses[i];
            }
        }
        return maxFeedExpense;


    }
    public static double findExpensesSum(double[] expenses) {
        double sumFeed = 0;
        for (int i = 0; i < expenses.length; i++) {
            sumFeed = sumFeed + expenses[i];
        }
        return sumFeed;


    }
    public static void sayEnjoyMeal(String name) {
        System.out.println("Приятного аппетита, " + name);

    }
}