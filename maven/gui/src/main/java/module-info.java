module com.example.programming {
  requires com.example.quote;
  
  provides com.example.quote.Quote
    with com.example.programming.ProgrammingQuotes;
}