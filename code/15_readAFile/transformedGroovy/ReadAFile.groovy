String readFromFile(String filePath) {
  new File(filePath).text
}

println readFromFile('/etc/hosts')