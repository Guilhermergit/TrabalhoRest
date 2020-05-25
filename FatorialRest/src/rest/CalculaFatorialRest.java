//localhost:8080/fatorialrest/isfatorial?num=6
package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/isfatorial")
public class CalculaFatorialRest {

@GET
@Produces("text/plain;charset=UTF-8")
public String isfatorial(@QueryParam("num") String numr) {
 
	long num = Long.parseLong(numr);
    long fat = 1;
   
      for(long i = 1;i <= num; i++){
              fat = fat * i;
          }
         
       return Long.toString(fat);

}
}
