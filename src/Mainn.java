/*
* В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
* Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов
* с номерами от 000001 до 999999. «Счастливым» считается билетик у которого
* сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например,
* в билетах с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир
* обладателю каждого счастливого билета и теперь раздумывает, как много
* сувениров потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
* */
import java.util.ArrayList;

public class Mainn {

    public static void main(String [ ] args){
        ArrayList<Integer> numbersInt = new ArrayList<>();
        for(int i=0;i<999999;i++){
            numbersInt.add(i);
        }


        ArrayList<String> numbers = new ArrayList<>();
        String z1="0";
        String z2="00";
        String z3="000";
        String z4="0000";
        String z5="00000";
        for(int i=0;i<numbersInt.size();i++){
            switch (String.valueOf(numbersInt.get(i)).length()){
                case 1:
                    numbers.add(z5+String.valueOf(numbersInt.get(i)));
                    break;
                case 2:
                    numbers.add(z4+String.valueOf(numbersInt.get(i)));
                    break;
                case 3:
                    numbers.add(z3+String.valueOf(numbersInt.get(i)));
                    break;
                case 4:
                    numbers.add(z2+String.valueOf(numbersInt.get(i)));
                    break;
                case 5:
                    numbers.add(z1+String.valueOf(numbersInt.get(i)));
                    break;
                case 6:
                    numbers.add(String.valueOf(numbersInt.get(i)));
                    break;
            }
        }




        ///////////////////////////////////////////

        int counter = 0;

        for(int i=0;i<numbers.size();i++){
            int a1=Integer.valueOf(numbers.get(i).substring(0,1));
            int a2=Integer.valueOf(numbers.get(i).substring(1,2));
            int a3=Integer.valueOf(numbers.get(i).substring(2,3));
            int b1=Integer.valueOf(numbers.get(i).substring(3,4));
            int b2=Integer.valueOf(numbers.get(i).substring(4,5));
            int b3=Integer.valueOf(numbers.get(i).substring(5,6));


            if(a1+a2+a3==b1+b2+b3){
                counter++;
                System.out.print("Number found: "+numbers.get(i)+"\n");
            }
        }

        System.out.println("\n"+"......................");
        System.out.println("\n"+"Total found: "+counter);


    }//main

}


/*
*  int b=0;
        //С помощью простого цикла и деления по модулю получим значения всех совпадений. Увеличиваем "счетчик" каждый раз, когда сумма первых 3 чисел равна сумме второй тройки. Так как минимальное такое число может быть только после 1000, начинаем цикл с нее
        for(int i=1001;i<1000000;i++){
            int i1=i/100000%10,
                i2=i/10000%10,
                i3=i/1000%10,
                i4=i/100%10,
                i5=i/10%10,
                i6=i%10;
            if((i1+i2+i3)==(i4+i5+i6)){
                b++;
            }
        }
        System.out.println(b);
* */