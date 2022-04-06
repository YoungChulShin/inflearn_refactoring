package me.whiteship.refactoring._03_long_function._13_replace_conditional_with_polymorphism;

import java.util.List;

public class StudyPrinterFactory {

  public static StudyPrinter create(
      PrinterMode mode,
      int totalNumberOfElements,
      List<Participant> participantList) {
    switch (mode) {
      case CONSOLE:
        return new ConsolePrinter(totalNumberOfElements, participantList);
      case CVS:
        return new CsvPrinter(totalNumberOfElements, participantList);
      case MARKDOWN:
        return new MarkdownPrinter(totalNumberOfElements, participantList);
      default:
        return new ConsolePrinter(totalNumberOfElements, participantList);
    }
  }
}
