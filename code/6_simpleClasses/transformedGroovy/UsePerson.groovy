def createPerson() {
  def john = new Person('John', 'Smith', 27)
  println "$john.firstName $john.lastName:$john.age"
}

createPerson()

@Newify(Person)
def createPerson2() {
  def john = Person('John', 'Smith', 27)
  println "$john.firstName $john.lastName:$john.age"
}

createPerson2()