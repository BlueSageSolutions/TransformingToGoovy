util = new Util()

println(util.totalNumbers([1, 7, 8, 10, 23]) { true })
println(util.totalNumbers([1, 7, 8, 10, 23]) { it % 2 == 0 })
println(util.totalNumbers([1, 7, 8, 10, 23]) { it % 2 != 0 })
println(util.totalNumbers([1, 7, 8, 10, 23]) { it > 8 })
