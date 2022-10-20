/*
 * A class created based on the assignment
 * to test methods
*/
public class TryingMethods {
  public static void main(String[] args) {
    
  }

  public String dayOfWeek(int day) {
    return switch (day) {
      case 0:
        yield "Monday";
      case 1:
        yield "Tuesday";
      case 2:
        yield "Wednesday";
      case 3:
        yield "Thursday";
      case 4:
        yield "Friday";
      case 5:
        yield "Saturday";
      case 6:
        yield "Sunday";          
      default:
        yield "Please provide a number between 0 and 6";
    };
  }

  public static int sum1To999() {
    int sum = 0;
    int i = 1;

    while (i < 999) {
      sum += i;
      i++;
    }

    return sum;
  }
}