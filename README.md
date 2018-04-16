# Greetings

Greetings prospective coworker! We're going to try a little exercise so we can try to work through a problem together.

As a person who is not greeted frequently enough I need a service I can request greetings from at will. I've created a webservice that runs inside of an executable jar to do this, but I'm not sure what to do next. What would you recommend? 

My requirements are: 

1. This should be on the internet. It's important to me that I can be greeted from anywhere. If my battery dies I might need to use a friend's internet connected device be greeted, so it can't be something I need to use this laptop with it's paultry 5 hour battery life to see.

2. I'm confident in my ability to manage this application, but not so confident I know how to manage servers and things like that. I hope to be able to update the code when a greeting becomes boring, and I need more enthusiastic greetings. When I do this it would be great if those changes magically appear on the internet without too many manual steps.

You get to assume our CI server will run all the time. For the purposes of this exercise it will run on this laptop. 

You can start a jenkins docker instance with:

```
docker run -d -p 9080:8080 -v `pwd`/jenkins_home:/var/jenkins_home  jenkins/jenkins
```

Once it starts you should be able to access this server at http://localhost:9080/

## Things I'd like to discuss as we go, or when we're done:

- With Jenkins (and most other CI tools) you can do things like define your job using code that lives within a project's codebase. Why might I prefer that to what we just did? 

- This is bound to be a very popular service. For our initial launch we can probably just throw it onto a server and see what happens, but how could I guarantee it's reliability as popularity mounts? 

- When providing my greeting service to the internet at large I'm going to need to be able to ensure we can make frequent updates without incurring downtime. How do you think I should do that?

- At some point I'm going to want to be able to provide many greetings, and probably track the most popular greetings. Do you have any favorite technologies? What would you be excited to help me implement next?

- What should I name it? So far I'm thinking Greetings as a Service (GaaS). Seems kind of on the nose though doesn't it?
