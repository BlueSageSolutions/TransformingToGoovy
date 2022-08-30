String readFromFile(String filePath) {
  new File(filePath).text
}

println readFromFile(args[0])