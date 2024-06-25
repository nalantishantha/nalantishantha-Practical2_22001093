object Q3 {
  val normalHourlyRate: Double = 250.0
  val otHourlyRate: Double = 85.0
  val taxRate: Double = 0.12
  val normalHoursWorked: Int = 40
  val otHoursWorked: Int = 30
  
  def grossSalary(nHours: Double, otHours: Double): Double = {
    nHours * normalHourlyRate + otHours * otHourlyRate
  }
  
  def tax(nHours: Double, otHours: Double): Double = {
    grossSalary(nHours, otHours) * taxRate
  }
  
  def calculateSalary(nHours: Double, otHours: Double): Double = {
    grossSalary(nHours, otHours) - tax(nHours, otHours)
  }
  
  def main(args: Array[String]): Unit = {
    println(calculateSalary(normalHoursWorked, otHoursWorked))
  }
}
