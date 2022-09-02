String msg = """This is an important announcement sent
to all employees on ${new Date()}
there will be a fire alarm test on next Monday at 11AM.
Please be advised that...
"""


println msg.replaceAll("\n", " ")


def presenter ="tucker"
println('string'.class)
println("string presenter".class)
println("string $presenter".class)
println('''string $presenter
'''.class)
println("""string $presenter""".class)

def stringTest = "test"
println stringTest[0..2]
println stringTest[-1..(-1*stringTest.length())]

println("""Multi
line
String""")


println('''Multi
line
String''')