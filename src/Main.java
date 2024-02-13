public class Main {
    public static void main(String[] args) {
        //Task 1
        int a = 100000;
        byte b = 127;
        short c = - 21000;
        long d = 1000000L;
        float e = 0.0018f;
        double f = 0.123456789;
        System.out.println("Значение переменной 'a' c типом 'int' равно " + a);
        System.out.println("Значение переменной 'b' c типом 'byte' равно " + b);
        System.out.println("Значение переменной 'c' c типом 'short' равно " + c);
        System.out.println("Значение переменной 'd' c типом 'long' равно " + d);
        System.out.println("Значение переменной 'e' c типом 'float' равно " + e);
        System.out.println("Значение переменной 'f' c типом 'double' равно " + f);

        //Task2
        float g = 27.12f;
        long h = 987678965459L;
        float i = 2.768f;
        short j = -159;
        short k = 27897;
        byte l = 67;
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);

        //task 3
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        short totalPaper = 480;
        int totalStudents = firstClass + secondClass + thirdClass; //тут не понял почему java мне сказала, чтоб я поставил переменную инт, если сумма приведенных значений не превышает 127
        System.out.println("Всего учеников в трех классах " + totalStudents + " человек");
        int paperForOne = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperForOne + " листов бумаги");

        //task 4
        byte capacityPerTwoMin = 16;
        int capacityPerMin = capacityPerTwoMin / 2;
        int perTwentyMin = capacityPerMin * 20;
        System.out.println("За 20 минут машина произвела " + perTwentyMin + " штук бутылок");
        int perDay = capacityPerMin * 1440;
        System.out.println("За сутки машина произвела " + perDay + " штук бутылок");
        int perThreeDay = perDay * 3;
        System.out.println("За 3 дня машина произвела " + perThreeDay + " штук бутылок");
        int perMonth = perThreeDay * 10;
        System.out.println("За месяц машина произвела " + perMonth + " штук бутылок");

        //task 5
        byte totalPaint = 120;
        byte brownPaint = 4;
        byte whitePaint = 2;
        int paintForOneClass = whitePaint + brownPaint;
        int totalClasses = totalPaint / paintForOneClass;
        int totalWhitePaint = totalClasses * whitePaint;
        int totalBrownPaint = totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        //task 6
        int bananas = 5;
        int oneBananasWeight = 80;
        int totalBananasWeight = bananas * oneBananasWeight;
        int milkMl = 200;
        int milkWeight = milkMl * 105 / 100; //Честно говоря, не сообразил, как правильно записать это действие, поэтому тут так (Ну как бы не просто посчитал в уме, а тут посчитал в надежде, что зачтете :DDD)
        int IceCream = 2;
        int IceCreamWeight = 100;
        int totalIceCreamWeight = IceCream * IceCreamWeight;
        int eggs = 4;
        int oneEggWeight = 70;
        int totalEggsWeight = eggs * oneEggWeight;
        int totalBreakfastWeight = totalBananasWeight + milkWeight + totalIceCreamWeight + totalEggsWeight;
        System.out.println("Итого завтрак весит " + totalBreakfastWeight + " грамм");
        int grPerKg = 1000;
        float breakfastWeightKg = totalBreakfastWeight / (float)grPerKg;
        System.out.println("А в килограммах будет столько " + breakfastWeightKg);

        //task 7
        int neededWeightKg = 7;
        int neededWeightGr = neededWeightKg * grPerKg;
        int firstWeightLossPerDay = 250;
        int secondWeightLossPerDay = 500;
        int daysIfFirstLoss = neededWeightGr / firstWeightLossPerDay;
        System.out.println("Если будет сбрасывать по 250гр то это займет " + daysIfFirstLoss + " дней");
        int daysIfSecondLoss = neededWeightGr / secondWeightLossPerDay;
        System.out.println("А если будет сбрасывать по 500гр то это займет " + daysIfSecondLoss + " дней");

        //task 8
        int mashaFirstPay = 67760;
        int denisFirstPay = 83690;
        int kristinaFirstPay = 76320;
        int percentagePayIncrease = 10; // процент повышения
        int mashaFinalPay = mashaFirstPay + (mashaFirstPay / percentagePayIncrease); //зп с 10% повышением
        int denisFinalPay = denisFirstPay + (denisFirstPay / percentagePayIncrease);
        int kristinaFinalPay = kristinaFirstPay + (kristinaFirstPay / percentagePayIncrease);
        int monthsPerYear = 12;
        int annualSalaryMasha = mashaFirstPay * monthsPerYear; //считаем годовой оклад до повышения
        int annualSalaryDenis = denisFirstPay * monthsPerYear;
        int annualSalaryKristina = kristinaFirstPay * monthsPerYear;
        int annualSalaryMashaInc = mashaFinalPay * monthsPerYear; //считаем годовой оклад после повышения
        int annualSalaryDenisInc = denisFinalPay * monthsPerYear;
        int annualSalaryKristinaInc = kristinaFinalPay * monthsPerYear;
        int differenceAnnualSalaryMasha = annualSalaryMashaInc - annualSalaryMasha; //вычисляем разницу годовых окладов
        int differenceAnnualSalaryDenis = annualSalaryDenisInc - annualSalaryDenis;
        int differenceAnnualSalaryKristina = annualSalaryKristinaInc - annualSalaryKristina;
        System.out.println("Маша теперь получает " + mashaFinalPay + " рублей. Годовой доход вырос на " + differenceAnnualSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + denisFinalPay + " рублей. Годовой доход вырос на " + differenceAnnualSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristinaFinalPay + " рублей. Годовой доход вырос на " + differenceAnnualSalaryKristina + " рублей");



    }
}