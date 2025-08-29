package tutorial_01;

public class Exercise07 {

	public static void main(String[] args) {
/* 
 1 năm có 365 ngày = 8760 giờ = 525,600 phút = 31,536,000 giây
 và dân số hiện tại là 312,032,486, bài toán cần tính trong vòng 5 năm tới
 7 giây/ca sinh thì 1 năm có 4,505,142 ca sinh, 5 năm có 22,525,714 ca sinh
 13 giây/ca chết thì 1 năm có 2,425,846 ca chết, 5 năm có 12,129,230 ca chết
 45 giây/nhập cư thì 1 năm có 700,800 nhập cư, 5 năm có 3,504,000 nhập cư */

/* 
        int currentPopulation = 312032486;
        int secondsPerYear = 365 * 24 * 60 * 60;

        int birthsPerYear = secondsPerYear / 7;
        int deathsPerYear = secondsPerYear / 13;
        int immigrantsPerYear = secondsPerYear / 45;

        for (int year = 1; year <= 5; year++) {
            currentPopulation = currentPopulation + birthsPerYear - deathsPerYear + immigrantsPerYear;
            System.out.println("Dân số sau " + year + " năm là: " + currentPopulation);
        }
    }
 
}
*/

 int currentPopulation = 312032486;
 int birthPerYears = 4505142;
 int deathPerYears = 2425846;
 int immigrantPerYears = 700800;
 int a = birthPerYears - deathPerYears + immigrantPerYears + currentPopulation;
 int b = birthPerYears * 2 - deathPerYears * 2 + immigrantPerYears * 2 + currentPopulation;
 int c = birthPerYears * 3 - deathPerYears * 3 + immigrantPerYears * 3 + currentPopulation;
 int d = birthPerYears * 4 - deathPerYears * 4 + immigrantPerYears * 4 + currentPopulation;
 int e = birthPerYears * 5 - deathPerYears * 5 + immigrantPerYears * 5 + currentPopulation;

System.out.println(" Dan so trong 1 nam toi =" + a);
System.out.println(" Dan so trong 2 nam toi =" + b);
System.out.println(" Dan so trong 3 nam toi =" + c);
System.out.println(" Dan so trong 4 nam toi =" + d);
System.out.println(" Dan so trong 5 nam toi =" + e);
	
	}
}