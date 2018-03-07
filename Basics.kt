val sample1: Byte = 0x3A;
var sample2: Byte = 58;
var heartRate: Int = 85;
var deposits = 135002796.toDouble();
val acceleration = 9.800.toFloat();
var mass= 14.6.toFloat();
var distance = 129.763001.toDouble();
var lost: Boolean = true;
var expensive: Boolean = true;
var choice: Int = 2;
val integral: Char = '∫';
val greeting: String = "Hello";
var name: String = "Karen";

fun main(args: Array<String>) {
  if (sample1 == sample2)
    println("The samples are equal")
  else
    println("The samples are not equal")
    
  if (deposits >= 100000000)
    println("You are exceedingly wealthy.")
  else
    println("Sorry you are so poor.")
    
  var force = mass * acceleration;
  println("force = " + force)
  println("$distance is the distance")

  if(lost && expensive)
    println("I am really sorry! I will get the manager.")
  else if (lost && !expensive)
    println("Here is a coupon for 10% off.")
    
  when(choice) {
    in 1..3 -> println("You chose " + choice + ".")
    else -> println("You made an unknown choice.")
  }
  
  println(integral + " is an integral.")
  
  for (i in 5..10) println("i = $i")
  
  var age = 0;
  while (age < 6) {
    println("age=" + age)
    age++
  }
  
  println("$greeting $name")
}
