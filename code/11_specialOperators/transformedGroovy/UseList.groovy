void printFirstNames(List<Person> people) {
    
  println "There are ${people?.size()?: "no"} people."

  if(!people) return

  println "Their first names are: ${people*.firstName.join(', ')}"
}

def people = []
people << new Person("John", "Smith", 27)
people << new Person("Sara", "Smith", 27)
people << new Person("Bill", "Smith", 7)
people << new Person("Kate", "Smith", 6)
printFirstNames(people)
printFirstNames([])


Person person1  =  new Person()
Person person2  =  new ("John", "Smith", 27)
String displayName = person1.firstName ? person1.firstName : 'Anonymous'   
displayName = person1.firstName ?: 'Anonymous'    

// == is .equals from java
// <=> is compareTo from java space-ship operator

println 0 <=> 2
println 1 <=> 0
println 1 <=> 1