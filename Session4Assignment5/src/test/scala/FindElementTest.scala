package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class FindElementTest extends AnyFunSuite {
  val findElementObject = new FindElement
  test("To find kth element from end in Int List") {
    val list = List(1, 2, 3, 4, 5, 6)
    val result = 5
    assert(findElementObject.findElementFromEnd(list, 2).getOrElse("Invalid") === result)
  }
  test("To find  kth element from end in String List") {
    val list = List("My", "Name", "is", "Vanshika")
    val result = "Name"
    assert(findElementObject.findElementFromEnd(list, 3).getOrElse("Invalid") === result)
  }
  test("To find element from end more than length of List") {
    val list = List(1, 2, 3, 4, 5, 6)
    val result = "Invalid"
    assert(findElementObject.findElementFromEnd(list, 13).getOrElse("Invalid") === result)
  }
  test("To find element from empty List") {
    val list = List()
    val result = "Invalid"
    assert(findElementObject.findElementFromEnd(list, 3).getOrElse("Invalid") === result)
  }
}
