module com.example.gui{
  requires javafx.graphics;
  requires javafx.controls;
  requires com.example.programming;
    
  exports com.example.gui to javafx.graphics;
    
  requires com.example.quote;
  
  uses com.example.quote.Quote;
}