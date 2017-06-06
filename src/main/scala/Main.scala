/**
  * Created by Administrator on 06/06/2017.
  */
object Main
{
  def main(args:Array[String]) =
  {
    var x = 22
    var y = 20

    var a = 1
    var b = 2
    var c = 3

    println(blackjack(x, y) + " is the highest score.")

    println("The total sum is " + uniqueSum(a,b,c) + ".")

  }

  def blackjack (int1: Int, int2: Int): Int =
  {
    int1 > 0 && int2 > 0 match
    {
      case false => 0
      case true => (int1 > 21 && int2 > 21) match
      {
        case true => 0
        case false => (int1 > 21 && int2 <= 21) match
        {
          case true => int2
          case false => (int2 > 21 && int1 <= 21) match
          {
            case true => int1
            case false => (int1 > int2) match
            {
              case true => int1
              case false => int2
            }
          }
        }
      }
    }
  }

  def uniqueSum(int1: Int, int2: Int, int3: Int): Int =
  {
    int1 == int2 && int2 == int3 match{
      case true => 0
      case false => int1 == int2 match {
        case true => int3
        case false => int2 == int3 match{
          case true => int1
          case false => int1 == int3 match{
            case true => int2
            case false => (int1 + int2 + int3)
          }
        }
      }
    }




  }


}