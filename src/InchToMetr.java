/*
Пример для опробования 1.2
Эта программа отображает таблицу преобразования дюймы в метры.
Присвоить её исходноиу файлу название InchToMetr
 */
public class InchToMetr {
    public static void main(String args[]){
        double inch, metr;
        int counter;
        // Первоначально в счетчике строк устанавливается нулевое значение
        counter = 0;
        for (inch = 1; inch <= 144; inch ++){
            metr = inch / 39.37; // преобразование в метры
            System.out.println(inch + " inch is " + metr + " metr.");
            //Приращение счетчика строк происходит на каждом шагецикла,
            //а через каждые десять строк выводится пустая строка.
            counter++;
            if(counter == 12){
                System.out.println();
                counter = 0; // сюросить счетчик строк
            }
        }
    }
}
