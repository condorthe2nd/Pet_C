/**
 * class for basic pet data
 **/
public class PetClass {
        private String name;
        private int age;
        private double weight;

        public PetClass() {
                name = "No name yet";
                age = 0;
                weight = 0.0;
        }

        public PetClass(String initialName, int initialAge, double initialWeight) {
                name = initialName;
                if ((initialAge < 0) || (initialWeight < 0)) {
                        System.out.println("System error negative weight or age ");
                        System.exit(-1);
                } else {
                        age = initialAge;
                        weight = initialWeight;
                }

        }

        public void setPet(String newName, int newAge, double newWeight) {
                name = newName;
                if ((newAge < 0) || (newWeight < 0)) {
                        System.out.println("System error negative weight or age ");
                        System.exit(-1);
                } else {
                        age = newAge;
                        weight = newWeight;
                }
        }

        public PetClass(String initialName) {
                name = initialName;
                age = 0;
                weight = 0.0;
        }

        public PetClass(int initialAge) {
                name = "No name yet";
                weight = 0.0;
                if (initialAge < 0) {
                        System.out.println("System error negative weight or age ");
                        System.exit(-1);
                } else {
                        age = initialAge;
                }

        }

        public void setAge(int newAge) {
                if (newAge < 0) {
                        System.out.println("System error negative weight or age ");
                        System.exit(-1);
                } else {
                        age = newAge;
                }
        }

        public PetClass(double initialWeight) {
                name = "No name yet";
                age = 0;
                if (initialWeight < 0) {
                        System.out.println("System error negative weight or age ");
                        System.exit(-1);
                } else {
                        weight = initialWeight;
                }
        }

        public void setWeight(double newWeight) {
                name = "No name yet";
                age = 0;
                if (newWeight < 0) {
                        System.out.println("System error negative weight or age ");
                        System.exit(-1);
                } else {
                        weight = newWeight;
                }
        }

        public String getName() {
                return name;
        }

        public int getAge() {
                return age;
        }

        public double getWeight() {
                return weight;
        }

        public void writeOutput() {
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Weight: " + weight);
        }
}
