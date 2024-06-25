object Q4 {
  val basePrice: Int = 15
  val baseAttendance: Int = 120
  val fixedCost: Int = 500
  val costPerAttendee: Int = 3

  def attendees(ticketPrice:Int): Int = {
    baseAttendance + ( (basePrice-ticketPrice)/5 * 20)
  }

  def revenue(ticketPrice: Int): Int = {
    attendees(ticketPrice) * ticketPrice
  }

  def cost(ticketPrice: Int): Int = {
    fixedCost + costPerAttendee * attendees(ticketPrice)
  }

  def profit(ticketPrice: Int): Int = {
    revenue(ticketPrice)- cost(ticketPrice)
  }

  def main(args: Array[String]): Unit = {
    print("Enter ticket price : ")
    val ticketPrice = scala.io.StdIn.readInt()
    println(profit(ticketPrice))
  }
}
