public class carrotCountPerMonth {
    public static void main(String[] args) {
        int carrotCount = 0; // Переменная для подсчёта общего количества морковок
        int carrotPerDay = 3; // Ежедневный рацион теперь три морковки
        int carrotReserve = 23; // Новая переменная! она отражает, что у вас уже есть 23 морковки

        // цикл на месяц
        for (int day = 1; day <= 31; day = day + 1) {
            carrotCount = carrotCount + carrotPerDay; // Вычисляем рацион
        }

        // Вычитаем из общего рациона число морковок, которые есть в запасе
        System.out.println("Нужно докупить моркови:" + (carrotCount - carrotReserve));
    }
}