import java.io._

object ticket {
  def main(args: Array[String]): Unit = {
   var attendees=.0
    var revenue=.0
    var cost=.0
    var profit=.0

    print("Enter ticket price:")
    val ticketPrice = readInt()
attendees=120 + (15-ticketPrice)/5*20
    revenue=attendees*ticketPrice
    cost=500+3*attendees
    profit=revenue-cost
    println("Profit :" + profit)


  }

}
