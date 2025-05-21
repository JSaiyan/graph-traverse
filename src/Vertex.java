import java.util.ArrayList;
import java.util.List;

public class Vertex<T> 
{
  T data;
  //vertex will be the node itself
  //instead of next left or right this is called neighbors 
  List<Vertex<T>> neighbors;

  public Vertex(T data) 
  {
    this(data, new ArrayList<>());
  }

  public Vertex(T data, List<Vertex<T>> neighbors) 
  {
    this.data = data;
    this.neighbors = neighbors;
  }
}