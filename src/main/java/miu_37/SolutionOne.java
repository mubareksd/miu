package miu_37;

public class SolutionOne {

	public static int countRepresentations(int numRupees) {
		int count = 0;
		for (int rupee20 = 0; rupee20 <= (numRupees) / 20; rupee20++) {
			for (int rupee10 = 0; rupee10 <= (numRupees - (rupee20 * 20)) / 10; rupee10++) {
				for (int rupee5 = 0; rupee5 <= (numRupees - (rupee10 * 10 + rupee20 * 20)) / 5; rupee5++) {
					for (int rupee2 = 0; rupee2 <= (numRupees - (rupee5 * 5 + rupee10 * 10 + rupee20 * 20))
							/ 2; rupee2++) {
						for (int rupee1 = 0; rupee1 <= (numRupees
								- (rupee2 * 2 + rupee5 * 5 + rupee10 * 10 + rupee20 * 20)); rupee1++) {
							if ((rupee1 + rupee2 * 2 + rupee5 * 5 + rupee10 * 10 + rupee20 * 20) == numRupees)
								count++;
						}
					}
				}
			}
		}
		return count;
	}
}