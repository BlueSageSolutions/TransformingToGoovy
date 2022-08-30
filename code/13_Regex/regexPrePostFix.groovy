
//println ("Prefix is groovier and better when I use Postfix" ==~ /^Prefix.*Postfix$/)
//println ("Prefix is groovier and better when I use Postfix" ==~ /^.*Postfix$/)
//println ("Prefix is groovier and better when I use Postfix" ==~ /^Prefix.*$/)

String testHasPrePost = "Prefix*****Postfix"
String testHasPre = "Prefix*****"
String testHasPost = "*****Postfix"
String testNotHasPrePost = "*****"

String prepost = /^Prefix.*Postfix$/
String post = /^.*Postfix$/
String pre =  /^Prefix.*$/

println ''
println testHasPrePost ==~ prepost
println testHasPrePost ==~ pre
println testHasPrePost ==~ post

println ''
println testHasPre ==~ prepost
println testHasPre ==~ pre
println testHasPre ==~ post

println ''
println testHasPost ==~ prepost
println testHasPost ==~ pre
println testHasPost ==~ post

println ''
println testNotHasPrePost ==~ prepost
println testNotHasPrePost ==~ pre
println testNotHasPrePost ==~ post


println ''
def input = testHasPost

switch (input) {
    case ~prepost:
        println "has pre and post"
        break

    case ~pre:
        println "has pre"
        break
        
    case ~post:
        println "has post"
        break

    default:
        println "has none..."
}

