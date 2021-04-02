package ch07;

public class AnimalEx {

	public static void main(String[] args) {
		Animal a1 = new Pig();
		Animal a2 = new Bird();
		Animal a3 = new Fish();
		
		Animal[] aa = {a1, a2, a3};
		for(Animal animal : aa) {
			animal.move();
			System.out.println("x = "+animal.x);
			if(animal instanceof Bird) {
				((Bird)animal).eat();
			}
		}
		/*	for(int i= 0; i<aa.length;i++){
		 * 		aa[i].move();
		 * System.out.println("x = "+aa[i].x);
		 * if(animal instanceof Bird) {
				((Bird)animal).eat();
			}
		 * 	}
		  이 방법도 가능.
		  */
	}

}
