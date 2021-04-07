import java.util.*;

class PetDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String petName;
        int petAge;
        double petWeight;
        Scanner scanner = new Scanner(System.in);

        ArrayList<PetClass> pets = new ArrayList<>();
        System.out.println("Please input name age and weight of pets separated by ,");
        System.out.println("please enter exactly five pets");
        while (pets.size() < 5) {
            String input = keyboard.nextLine();
            if (input.equals(" ")) {
                break;
            }
            String[] parts = input.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            double weight = Double.valueOf(parts[2]);
            pets.add(new PetClass(name, age, weight));
        }


        //Find and print largest
        double largest = -1;
        for (
                PetClass pet : pets) {
            if (pet.getWeight() > largest) {
                largest = pet.getWeight();
            }
        }
        System.out.println("The largest pet is " + largest + " pounds:");
        double smallest = Integer.MAX_VALUE;
        for (
                PetClass pet : pets) {
            if (pet.getWeight() < smallest) {
                smallest = pet.getWeight();
            }
        }
        System.out.println("The smallest pet is " + smallest + " pounds:");

        int oldest = Integer.MIN_VALUE;
        for (
                PetClass pet : pets) {
            if (pet.getAge() > oldest) {
                oldest = pet.getAge();
            }
        }
        System.out.println("The oldest pet is " + oldest + " years:");
        int youngest = Integer.MAX_VALUE;
        for (
                PetClass pet : pets) {
            if (pet.getAge() < youngest) {
                youngest = pet.getAge();
            }
        }
        System.out.println("The youngest pet is " + youngest + " years:");
        double sum = 0;
        for (
                PetClass pet : pets) {
            sum += pet.getWeight();
        }
        System.out.println("Average weight equals: " + (sum / 5));

        double totalAge = 0;
        for (
                PetClass pet : pets) {
            totalAge += pet.getAge() / (double) 5;
        }
        System.out.println("Average age equals: " + totalAge);
    }

}



/*













        //Average age
        double aveAge = (pet1.getAge()
                + pet2.getAge()
                + pet3.getAge()
                + pet4.getAge()
                + pet5.getAge()) / (double) 5;
        System.out.print("Average age  (years) = " + aveAge);
        // OutputFormat.writeln(aveAge, 1);
        System.out.println();
    }
*/