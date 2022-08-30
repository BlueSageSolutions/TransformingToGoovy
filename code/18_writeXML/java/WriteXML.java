package com.agiledeveloper;

import java.util.HashMap;

public class WriteXML {
  public static void main(String[] args) {
    HashMap<String, String> langs = new HashMap<String, String>();
    langs.put("C++", "Stroustrup");
    langs.put("Java", "Gosling");
    langs.put("Lisp", "McCarthy");
    langs.put("Ruby", "Matz");

    StringBuilder xml = new StringBuilder();

    xml.append("<languages>");
    for (String key : langs.keySet()) {
      xml.append(String.format("<language name=\"%s\">", key));
      xml.append(String.format("<author>%s</author>", langs.get(key)));
      xml.append("</language>");
    }
    xml.append("</languages>");

    System.out.println(xml.toString());
  }
}