# nrepl-servlet-context

Use: starts nrepl server in web application for dev.

## build

```
lein jar
```

## gradle spring boot add to libs dir

build.gradle:

```
dependencies {
  implementation "org.clojure:clojure:1.8.0"
  implementation "nrepl:nrepl:0.6.0"
  implementation files('libs/nrepl-servlet-context-0.1.1.jar')
}
```

## start server

```kotlin
@SpringBootApplication
class AnApplication {
    @Bean
    fun repl(): javax.servlet.ServletContextListener {
	return org.simplefire.NReplServletContextListener()
    }
}
```

## terminal connect

To use repl from command line: 

    lein repl :connect 5000
    
## emacs connect

To use repl From emacs use [https://github.com/cemerick/nrepl.el](https://github.com/cemerick/nrepl.el) 

```
    M-x cider RET hostname RET 5000
```

```emacs-lisp
(cider-connect-clj '(:host "localhost" :port 5000))
```

## start server in web app

WEB-INF/lib: Place nrepl-servlet-context-0.1.0-standalone.jar

WEB-INF/web.xml: Add the following lines

    <listener>
        <listener-class>org.simplefire.NReplServletContextListener</listener-class>
    </listener>

    <context-param>
        <param-name>nrepl-port</param-name>
        <param-value>5000</param-value>
    </context-param>
