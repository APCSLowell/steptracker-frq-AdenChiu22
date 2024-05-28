import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int minSteps, totalSteps, totalDays, actDays;
 public StepTracker(int a) {
  minSteps = a;
  actDays = 0;
  totalSteps = 0;
  totalDays = 0;
 }
 public int activeDays() {
  return actDays;
 }
 public void addDailySteps(int steps) {
  totalDays++;
  totalSteps += steps;
  if (steps > minSteps) {
   daysA++;
  }
 }
 public double averageSteps() {
  if (totalDays == 0) {
   return 0.0;
  }
  return (double) totalSteps / totalDays;
 }
} 
