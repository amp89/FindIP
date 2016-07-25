#FindIp - an ip address lookup tool
###Purpose
FindIp is an ip lookup tool web application.  It allows the user to sign in, search for IP addresses, and save them with comments.  The data came from IP2Location.com.  I downloaded a large CSV file and wrote a Java program to read and format the data, and then load it into a MySQL database.

###Features
* Multi-level user access (user and admin accounts)
* A sign up feature that requires an confirmation code that is emailed to the user
* Forgotten password feature that emails the user a new password
* Saves - the user can save ip addresses that were searched
* Huge database of ip addresses.

###CurrentState

Currently, the web application is working, but not yet deployed.  There is no front end styling at the moment, however I will be utilizing Bootstrap for a responsive design.  A few things need to be refactored and cleaned up, but it is fully functional, including the confirmation and forgotten password emails.

###Technologies
* Front End
  * HTML
  * CSS (Future)
  * Javascript
  * AngularJS
  * JSP (Java Server Pages)
  * JSTL (JSP Standard Tag Library)
* Back End
  * MySQL Database
  * Java
    * Hibernate / JPA (Java Persistence API for ORM (Object Relational Mapping))
    * Spring MVC, and Spring Rest
      * The main navigation of the site uses Spring MVC.  Most pages have angular apps which make restful calls to a Spring Rest controller.

###Plans
* Front
  * Add Bootstrap, as well as css for responsive styling
  * Double check which things show (ng-show) and make sure uneccesary information isn't being displayed
  * Format some data that is still printed out in JSON
  * Clean up Angular apps to make them more readable
  * Add some functionality:
    * Display public comments on IP address search.
* Back
  * Refactor working code to be more maintainable readable
  * Delete unused methods from controllers and dao
  * Delete unused helper classes
