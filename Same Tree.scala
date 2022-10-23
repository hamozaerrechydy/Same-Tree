object main{
def main() {
    // enter your arrays 
    val arr1 = Array(1,2,3); 
    val arr2 = Array(1,2,3) ;  
    for( w <- arr1)
    {
      for( x <- arr2)
      {
        if(w == x){
          println("true"); 
        }else{
          println("false"); 
        }
      }
    }
  }
}
