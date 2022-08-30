groceries = ["Milk", "Sugar"]
groceries << "Bread"

println "Last item in the list: ${groceries[-1]}"

println("List of items:");
groceries.eachWithIndex { e, i ->
  println "$i\t$e"
}

println("Sorted items");
groceries.clone().sort().each { println it }

print("The items are: ");
println groceries.join(', ')
println groceries*.toUpperCase().join(', ')


//collect

def list = [1,2,3]
println("double ${list.collect{it *2}}")

//inject

def value = [1, 2, 3].inject('counting: ') { str, item -> str + item }
println  value == "counting: 123"
 
value = [1, 2, 3].inject(0) { count, item -> count + item }
assert value == 6

//times
def someIntValueInYourProgam = 5
someIntValueInYourProgam.times{
    println it
}

//join
def listString = "Banana Pinaple Apple Mango"
def listlist= ["Banana", "Pinaple", "Apple", "Mango"]
println listString.split(" ").join(", ")
println listlist.join(",_")