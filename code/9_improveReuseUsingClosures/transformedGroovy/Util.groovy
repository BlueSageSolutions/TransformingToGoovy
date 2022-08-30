class Util {
  int totalNumbers(numbers, selector) {
    int total = 0;
    numbers.each { if(selector(it)) total += it }
    total
  }
}