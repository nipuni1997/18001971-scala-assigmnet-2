import java.io._

object assignment {
  def main(args: Array[String]): Unit = {
    var normal=0
     var ot=0
    var days=0
    var tax=.0
    var salary=.0
    var othours=0
    var takehomeSalary=.0
    normal=150
    ot=75
    days=40
    othours=80
    tax=0.1
    salary= normal*days+ot*othours
    takehomeSalary=salary-(salary*tax)
    println("Take home salary:"+ takehomeSalary)
  }
}


