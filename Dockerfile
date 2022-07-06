FROM openjdk:11
ADD target/CricketPlayerApp-0.0.1-SNAPSHOT.jar CricketPlayerApp
ENTRYPOINT ["java","-jar","/CricketPlayerApp"]
