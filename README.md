# Greetings

Greetings prospective coworker! We're going to try a little exercise so we can try to work through a problem together.

As a person who is not greeted frequently enough I need a service I can request greetings from at will. I've created a webservice to do this, but I don't know what to do now, and I'd like your help. 

My requirements are: 

1. This should be on the internet. It's important to me that I can be greeted from anywhere. If my battery dies I might need to use a friend's internet connected device be greeted, so it can't be something I need to use this laptop with it's paultry 5 hour battery life to see.

2. I know how to write code, but that's where it stops. I hope to be able to update the code when a greeting becomes boring, and I need more enthusiastic greetings. When I do this it would be great if those changes magically appear on the internet.

You get to assume our CI server will run all the time. For the purposes of this exercise it will run on this laptop. 

You can start a jenkins docker instance with:

```
docker run -d -p 9080:8080 -v `pwd`/jenkins_home:/var/jenkins_home  jenkins/jenkins
```

Once it starts you should be able to access this server at http://localhost:9080/

## Things I'd like you to help me decide:

1. This is bound to be a very popular service. For our initial launch we can probably survive with a simple setup, but how will I guarantee it's reliability as popularity mounts? 

2. When providing my greeting service to the internet at large I'm going to need to be able to ensure we can make frequent updates without incurring downtime. How do you think I should do that?

3. At some point I'm going to want to be able to provide many greetings, and probably track greetings that have been provided. Do you have any favorite technologies? What would you be excited to help me implement next?

3. What should I name it? So far I'm thinking Greetings as a Service (GaaS). Seems kind of on the nose though doesn't it?
