package com.knoldus

object Driver extends App {
  val findElementObject = new FindElement
  val list = List(1,2,3,4,5,6)
  println(findElementObject.findElementFromEnd(list,2).getOrElse("Invalid"))
}