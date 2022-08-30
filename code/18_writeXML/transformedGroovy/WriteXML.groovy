langs = ['C++' : 'Stroustrup', 'Java' : 'Gosling', 'Lisp' : 'McCarthy', 'Ruby' : 'Matz']

builder = new groovy.xml.MarkupBuilder()

builder.languages {
  langs.each { key, value ->
    language(name:key) { author(value) }
  }
}