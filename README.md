# Spring-Eureka-Server-Ereka-Client-and-Load-Balancing : Microservices
This project simulates how Eureka Server can be used to manage microservices and also enable load balancing.

Two microservices communicate without knowing each other static Ip

# How to run
Checkout the three apps and run  them as invividual app in the following ports:
 Eureka Server: http://localhost:8761/
 Eureka Discovery: http://localhost:8060/
 Eureka Service()client: http://localhost:8050/
 
 Visis http://localhost:8050/recommendations and you will se the client app  return some movies recommendations.
 Recommendation generation is done using Eureka Discovery app which returns the response consumed by the eureka service.
 
 # Key method to note
 
  @RequestMapping(value = "/recommendations", method = RequestMethod.GET)
    @ResponseBody
    public Movie[] recommendations() {
        Movie[] result = restTemplate.getForObject("http://movie-service/movies", Movie[].class);
        return result;
    }
 
The API call uses the registered app name # movie-service # and not static IP
