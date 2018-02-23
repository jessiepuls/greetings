# Greetings

Greetings perspective coworker! We're going to try a little exercise so we can try to work through a problem together.

As a person who is not greeted frequently enough I need a service I can request greetings from at will. 

My requirements are:

1. This should be on the internet. It's important to me that I can be greeted from anywhere. If my battery dies I might need to use a friend's internet connected device be greeted, so it can't be something I need to use this laptop with it's paultry 5 hour battery life to see.

2. I know how to write code, but that's where it stops. I hope to be able to update the code when a greeting becomes boring, and I need more enthusiastic greetings. When I do this it would be great if those changes magically appear on the internet.

You get to assume our CI server will run all the time. For the purposes of this exercise it will run on this laptop. 

You can start a jenkins docker instance with:

```
docker run -d -p 9080:8080 -v `pwd`/jenkins_home:/var/jenkins_home  jenkins/jenkins
```

Once it starts you should be able to access this server at http://localhost:9080/

