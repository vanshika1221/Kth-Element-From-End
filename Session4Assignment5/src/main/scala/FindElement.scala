package com.knoldus
import scala.util.{Try, Success, Failure}

class FindElement {
  def findElementFromEnd[T](inputList: List[T], elementNumberToFind: Int): Option[T] = {
    // reversing the list and finding the kth element and checking the exception with Try
    val result = Try(inputList.reverse(elementNumberToFind - 1)) match {
      case Success(value) => Some(value)
      case Failure(_) => None
    }
    result
  }
}

