# nrepl-servlet-context

Provides a ServletContextListener that starts nrepl server in the web application.

## Build

Checkout and run lein uberjar

## Usage

WEB-INF/lib: Place nrepl-servlet-context-0.1.0-standalone.jar

WEB-INF/web.xml: Add the following lines

    <listener>
        <listener-class>org.simplefire.nrepl.StartNReplServletContextListener</listener-class>
    </listener>

    <context-param>
        <param-name>nrepl-port</param-name>
        <param-value>4000</param-value>
    </context-param>

(can change the port number to your need)

Start web-app

To use repl from command line: 

    lein repl :connect 4000

To use repl From emacs use nrepl.el

    M-x nrepl RET hostname RET 4000

## As maven library

run bin/install-file.bat

Add dependency to pom.xml

  <dependencies>
    <dependency>
      <groupId>org.simplefire</groupId>
      <artifactId>nrepl-servlet-context</artifactId>
      <version>0.1.0</version>
    </dependency>
  </dependecies>

## License

Copyright © 2012

Distributed under the Eclipse Public License, the same as Clojure.
