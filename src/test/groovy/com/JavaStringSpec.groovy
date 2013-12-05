package com

import spock.lang.*

class JavaStringSpec extends Specification {

  def  javaString = new JavaString()

  def "should error java"(){

     expect: javaString.state() == null
  }
}