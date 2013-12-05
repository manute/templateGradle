package com

import spock.lang.*

class GroovyStringSpec extends Specification {

  def  groovyString = new GroovyString()
  def "should error groovy"(){

     expect: groovyString.state() == null
  }
}