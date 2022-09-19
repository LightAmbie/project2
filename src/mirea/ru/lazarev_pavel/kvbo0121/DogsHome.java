package mirea.ru.lazarev_pavel.kvbo0121;


import java.util.Arrays;
import java.util.Scanner;

public class DogsHome {
    private Dog[] dogs;

    public DogsHome() {
        this.dogs = new Dog[0];
    }

    public Dog[] addDog(Dog dog, Dog[] dogs){

        Dog[] newDogs = new Dog[dogs.length+1];
        for(int i = 0;i<dogs.length;i++){
            newDogs[i] = dogs[i];
        }
        newDogs[dogs.length] = dog;
        return newDogs;


    }

    @Override
    public String toString() {
        return "DogsHome{" +
                "dogs=" + Arrays.toString(dogs) +
                '}';
    }

    public static void main(String[] args) {
        DogsHome home = new DogsHome();

        for(int i=0;i<3;i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(input.nextLine());

            Dog d1 = new Dog(name, age);
            home.dogs = home.addDog(d1, home.dogs);
        }

        for(Dog d : home.dogs){
            System.out.println(d);
        }
    }

}
