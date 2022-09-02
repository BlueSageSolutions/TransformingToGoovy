File folder = new File("/");
File[] listOfFiles = folder.listFiles();
for (int i = 0; i < listOfFiles.length; i++) {
    System.out.println(listOfFiles[i].getName());
}