# Detection-of-False-Data-Injection-Attacks-in-Grid-Communication-Systems

ABSTRACT


	The transformation of traditional energy networks to smart grids can assist in revolutionizing the energy industry in terms of reliability, performance and manageability. However, increased connectivity of power grid assets for bidirectional communications presents severe security vulnerabilities. In this letter, we investigate Chi-square detector and cosine similarity matching approaches for attack detection in smart grids where Kalman filter
estimation is used to measure any deviation from actual measurements. The cosine similarity matching approach is found to be robust for detecting false data injection attacks as well as other attacks in the smart grids. Once the attack is detected, system can take preventive action and alarm the manager to take preventative action to limit the risk. Numerical results obtained from simulations corroborate our theoretical analysis.

Wireless Sensor Network (WSN) is often to consist of adhoc devices that have low power, limited memory and computational power. WSN is deployed in hostile environment, due to which attacker can inject false data easily. Due to distributed nature of WSN, adversary can easily inject the bogus data into the network because sensor nodes don’t ensure data integrity and not have strong authentication mechanism. This paper reviews and analyze the performance of some of the existing false data filtering schemes and propose new scheme to identify the false data injected by adversary or compromised node. Proposed schemes shown better and efficiently filtrate the false data in comparison with existing schemes.











CHAPTER 1

INTRODUCTION:


THE smart grids offer a more efficient way of supplying and consuming energy by providing bi-directional energy flow and communications. Increased connectivity in smart grids and bidirectional communications present severe security challenges. According to Ernest Orlando Lawrence Berkeley National Laboratory, power outages cost over $80 billion every year in the U.S. alone. Thus, due to the critical nature of the smart grid services, smart grid systems become a prime target for cyber terrorism. According to a 2014 Washington D.C. based Bipartisan policy center report, more than 150 cyber attacks targeted energy sector in 2013 alone [3] and 79 attacks in 2014. Therefore, transformation of traditional energy networks to smart grids requires integrated end-to-end adaptive cyber defense strategy to safeguard smart grid communications, networks and assets used to operate, monitor, and control power flow and measurements. Recent related studies for smart grid security include a lightweight message authentication method has been used to secure smart grid systems where distributed meters are mutually authenticated using Diffie-Hellman key establishment protocol and hash-based authentication code. In [6], a generalized likelihood ratio detector has been proposed for smart grid security with limited number of meters compromised. Note that the generalized likelihood ratio detector depends on parametric inferences but is not applicable to nonparametric inferences based on function estimation [13]. In [7], smart grid security techniques have been proposed by using supervised learning algorithms. These techniques rely on a training dataset which is used as a reference to detect the attacks in new measurements. 

This approach could be compromised during training phase and/or the newer attacks including false data injection attacks could go undetected. None of these methods consider security techniques for false-data injection attacks in smart grid systems. In this letter, we investigate and compare Chi-square detector and cosine similarity matching for attack detection in smart grids where expected values are estimated using Kalman filter [14], [15] that are used to measure deviation from actual measurements. Note that both approaches are capable of detecting random attacks (e.g., reply of denial-of-communication) whereas the cosine similarity approach is also capable of detecting false data injection attacks in the smart grid. Numerical results obtained from simulations corroborate our theoretical analysis presented in this letter. Throughout this document, the following notation is used. The boldfaced upper-case letter (e.g. ) represents a matrix and bold faced lower-case letter (e.g. ) represents a vector. The letters (e.g. and ) denote scalers. The respectively, denote the inverse and the transpose of a matrix. The is the expected operator.
























CHAPTER 2

Literature Review:

Title: A LIGHTWEIGHT MECHANISM FOR MUTUAL AUTHENTICATION IN SMART GRID
Author: Mohammad Hossein Yaghmaee,Fatemeh Naji Mohades

Description:

Advanced Meter Infrastructure (AMI) is a critical component of smart grid, which, if compromised has serious impacts on the safety of utility and consumers. Message authentication is a serious problem and each message should authenticate and receiver checks that message come from a real sender and has no forgery during the transmission. For achieving this major we design two protocols, in first protocol we initially process with mutual authentication between sender and receiver then in second protocol messages between them are authenticate. Without authentication; an attacker can modify the message, forge a new message, or replay an old message to do the malicious operation. The current solutions for authentication like, traditional public key based digital signatures like RSA have heavy computation and are not suitable for resource constraint devices like smart meter. In this paper, we exploit a mathematical problem called balls and bins algorithm in randomized algorithms topic and Elliptic Curve discrete logarithm problem (ECDLP) for generation and transmission of our parameter.










Title: ANALYSIS OF ELECTRIC GRID SECURITY UNDER TERRORIST THREAT
Author: Javier Salmeron, Ross Baldick

Description:

We describe new analytical techniques to help mitigate the disruptions to electric power grids caused by terrorist attacks. New bilevel mathematical models and algorithms identify critical system components (e.g., transmission lines, generators, transformers) by creating maximally disruptive attack plans for terrorists assumed to have limited offensive resources. We report results for standard reliability test networks to show that the techniques identify critical components with modest computational effort. Keywords: Power flow; Interdiction; Homeland security
























Title: False Data Injection Attacks in Electricity Markets
Author: Yilin Mo ; Sinopoli, B

Description:

We present a potential class of cyber attack, named false data injection attack, against the state estimation in deregulated electricity markets. With the knowledge of the system configuration, we show that such attacks will circumvent the bad data measurement detection equipped in present SCADA systems, and lead to profitable financial misconduct such as virtual bidding the ex-post locational marginal price (LMP). We demonstrate the potential attacks on an IEEE 14-bus system.
















Title: Bad Data Injection Attack and Defense in Electricity Market Using Game Theory Study
Author: Ge Shi ; Zhu Han ; Lingyang Song

Description:

	Applications of cyber technologies improve the quality of monitoring and decision making in smart grid. These cyber technologies are vulnerable to malicious attacks, and compromising them can have serious technical and economical problems. This paper specifies the effect of compromising each measurement on the price of electricity, so that the attacker is able to change the prices in the desired direction (increasing or decreasing). Attacking and defending all measurements are impossible for the attacker and defender, respectively. This situation is modeled as a zero-sum game between the attacker and defender. The game defines the proportion of times that the attacker and defender like to attack and defend different measurements, respectively. From the simulation results based on the PJM 5-Bus test system, we can show the effectiveness and properties of the studied game.
















Title: Revealing Cascading Failure Vulnerability in Power Grids Using Risk-Graph
Author: Jun Yan ; Yan Sun ; Haibo He

Description:

	Security issues related to power grid networks have attracted the attention of researchers in many fields. Recently, a new network model that combines complex network theories with power flow models was proposed. This model, referred to as the extended model, is suitable for investigating vulnerabilities in power grid networks. In this paper, we study cascading failures of power grids under the extended model. Particularly, we discover that attack strategies that select target nodes (TNs) based on load and degree do not yield the strongest attacks. Instead, we propose a novel metric, called the risk graph, and develop novel attack strategies that are much stronger than the load-based and degree-based attack strategies. The proposed approaches and the comparison approaches are tested on IEEE 57 and 118 bus systems and Polish transmission system. The results demonstrate that the proposed approaches can reveal the power grid vulnerability in terms of causing cascading failures more effectively than the comparison approaches.














CHAPTER 3

SYSTEM ANALYSIS

System analysis is a combination process of dissecting the system responsibilities that are based on the problem domain characteristics and user requirements.


3.1 EXISTING SYSTEM

	Smart grid security includes [5]–[12]. In [5], a lightweight message authentication method. This work was supported in part by the U.S. National Science Foundation (NSF) under Grant CNS-1405670. The associate editor coordinating the review of this manuscript and approving it for publication was Prof. Yan Sun. Digital Object Identifier 10.1109/LSP.2015.2421935 has been used to secure smart grid systems where distributed meters are mutually authenticated using Diffie-Hellman key establishment protocol and hash-based authentication code. In [6], a generalized likelihood ratio detector has been proposed for smart grid security with limited number of meters compromised. Note that the generalized likelihood ratio detector depends on parametric inferences but is not applicable to nonparametric inferences based on function estimation [13]. In [7], smart grid security techniques have been proposed by using supervised learning algorithms. These techniques rely on a training dataset which is used as a reference to detect the attacks in new measurements. This approach could be compromised during training phase and/or the newer attacks including false data injection attacks could go undetected. None of these methods consider security techniques for false-data injection attacks in smart grid systems.


DISADVANTAGES

False data injection cannot be detected
That the generalized likelihood ratio detector depends on parametric inferences but is not applicable to nonparametric inferences based on function estimation
It is not applicable for many situations.


3.2 PROPOSED SYSTEM
	This paper investigate and compare Chi-square detector and cosine similarity matching for attack detection in smart grids where expected values are estimated using Kalman filter [14], [15] that are used to measure deviation from actual measurements. Note that both approaches are capable of detecting random attacks (e.g., reply of denial-of-communication) whereas the cosine similarity approach is also capable of detecting false data injection attacks in the smart grid. Numerical results obtained from simulations corroborate our theoretical analysis presented in this letter. Throughout this document, the following notation is used. The boldfaced upper-case letter (e.g. H) represents a matrix and boldfaced lower-case letter (e.g. x) represents a vector. The letters (e.g. N and n) denote scalars. The notations [.]-1and [.]T , respectively, denote the inverse and the transpose of a matrix. The symbol E (.) is the expected operator. 
 
ADVANTAGES

False data injection can directly detected
Once the attack is detected, system can take preventive action and alarm the manager to take preventative action to limit the risk.
Smart meters are well suitable than the normal meters.

 
 
 
 
3.3 SYSTEM CONFIGURATION:-
 
3.3.1 HARDWARE CONFIGURATION:
Processor		            :   Pentium –IV
Speed				:   1.1 GHz
RAM				:   256 MB(min)
Hard Disk			:   20 GB
Key Board			:   Standard Windows Keyboard
Mouse	           			:   Two or Three Button Mouse
Monitor	          		 :   SVGA
 
3.3.2 SOFTWARE CONFIGURATION:
Operating System		:   Windows 95/98/2000/XP/7.
Application Server		:   Tomcat 6.0/7.X.
Front End			:   HTML, Java, Jsp.
Scripts				:   JavaScript.
Server side Script		:   Java Server Pages.
Database			:   Mysql 5.0.
Database Connectivity	:   JDBC.







CHAPTER 4
ARCHITECTURE AND DESCRIPTION


4.1 SYSTEM ARCHITECTURE











4.2 Data Flow Diagram














4.3 USE CASE DIAGRAM











4.4 E-R DIAGRAM















4.5 CLASS DIAGRAM











4.6 SEQUENCE DIAGRAM













4.7 ACTIVITY DIAGRAM






4.8 MODULES
LIST OF MODULES

   4.8.1 Node Registration.
   4.8.2 File Transfer.
   4.8.3 Attacker. 
   4.8.4 IBS.    
   4.8.5 I-Trust Model.  

4.8 MODULE DESCRIPTION:

4.8.1. Node Registration:
This is module mainly designed to provide the authority to a user in order to access the other modules of the project. Here a user can have the accessibility authority after the registration. For the registration have to pay some amount,  because there  u got some credits in an data transactions.

4.8.2. File Transfer:
In this file transfer module mainly designed to transfer data from user to user.  This module can also be used to find the misbehavior detection on data transfer from authorized to user to other user.

4.8.3. False Data Injection:

In this False data module aims to provide a broad understanding and knowledge of network attacking, addressing threats over a range of sophistication levels and detailing various misbehavior detection and other mechanisms that have been pointed here.



4.8.4. IBS:
A digital signature is a mathematical scheme for demonstrating the authenticity of a digital message or documents. A valid digital signature gives a recipient reason to believe that the message was created by a known sender, that the sender cannot deny having sent the message (authentication and non-repudiation), and that the message was not altered in transit Digital signatures are a standard element of most cryptographic protocol suites, and are commonly used for software distribution, financial transactions, and in other cases where it is important to detect forgery or tampering.

4.8.5.  I-Trust Model:
The attacker module having its own I-Trust scheme which is inspired from the inspection Game a game theory model in which an inspector verifies if another party, called inspected, adheres to certain legal rules. In this model, the inspected has a potential interest in violating the rules while the inspector may have to perform the partial verification due to the limited verification resources.














CHAPTER 5
LANGUAGE SPECIFICATIONS:

5.1 Java Technology
Java technology is both a programming language and a platform.
The Java Programming Language
	The Java programming language is a high-level language that can be characterized by all of the following buzzwords: 

Simple
Architecture neutral
Object oriented
Portable
Distributed	
High performance
Interpreted	
Multithreaded
Robust
Dynamic
Secure	

With most programming languages, you either compile or interpret a program so that you can run it on your computer. The Java programming language is unusual in that a program is both compiled and interpreted. With the compiler, first you translate a program into an intermediate language called Java byte codes —the platform-independent codes interpreted by the interpreter on the Java platform. The interpreter parses and runs each Java byte code instruction on the computer. Compilation happens just once; interpretation occurs each time the program is executed. 




The following figure illustrates how this works. 


	
	You can think of Java bytecodes as the machine code instructions for the Java Virtual Machine (Java VM). Every Java interpreter, whether it’s a development tool or a Web browser that can run applets, is an implementation of the Java VM. Java bytecodes help make “write once, run anywhere” possible. You can compile your program into bytecodes on any platform that has a Java compiler. The bytecodes can then be run on any implementation of the Java VM. That means that as long as a computer has a Java VM, the same program written in the Java programming language can run on Windows 2000, a Solaris workstation, or on an iMac. 

5.2 The Java Platform
A platform is the hardware or software environment in which a program runs. We’ve already mentioned some of the most popular platforms like Windows 2000, Linux, Solaris, and MacOS. Most platforms can be described as a combination of the operating system and hardware. The Java platform differs from most other platforms in that it’s a software-only platform that runs on top of other hardware-based platforms. 

The Java platform has two components: 
The Java Virtual Machine (Java VM) 
The Java Application Programming Interface (Java API) 
You’ve already been introduced to the Java VM. It’s the base for the Java platform and is ported onto various hardware-based platforms. 
The Java API is a large collection of ready-made software components that provide many useful capabilities, such as graphical user interface (GUI) widgets. The Java API is grouped into libraries of related classes and interfaces; these libraries are known as packages. The next section, What Can Java Technology Do?, highlights what functionality some of the packages in the Java API provide. 
The following figure depicts a program that’s running on the Java platform. As the figure shows, the Java API and the virtual machine insulate the program from the hardware. 
                                        
Native code is code that after you compile it, the compiled code runs on a specific hardware platform. As a platform-independent environment, the Java platform can be a bit slower than native code. However, smart compilers, well-tuned interpreters, and just-in-time bytecode compilers can bring performance close to that of native code without threatening portability. 

5.3 What Can Java Technology Do? 

The most common types of programs written in the Java programming language are applets 
and applications. If you’ve surfed the Web, you’re probably already familiar with applets. An 
applet is a program that adheres to certain conventions that allow it to run within a 
Java-enabled browser.

However, the Java programming language is not just for writing cute, entertaining applets for the Web. The general-purpose, high-level Java programming language is also a powerful software platform. Using the generous API, you can write many types of programs. 
An application is a standalone program that runs directly on the Java platform. A special kind of application known as a server serves and supports clients on a network. Examples of servers are Web servers, proxy servers, mail servers, and print servers. Another specialized program is a servlet. A servlet can almost be thought of as an applet that runs on the server side. Java Servlets are a popular choice for building interactive web applications, replacing the use of CGI scripts. Servlets are similar to applets in that they are runtime extensions of applications. Instead of working in browsers, though, servlets run within Java Web servers, configuring or tailoring the server. 

How does the API support all these kinds of programs? It does so with packages of software components that provide a wide range of functionality. Every full implementation of the Java platform gives you the following features: 

The essentials: Objects, strings, threads, numbers, input and output, data structures, system properties, date and time, and so on. 
Applets: The set of conventions used by applets. 
Networking: URLs, TCP (Transmission Control Protocol), UDP (User Data gram Protocol) sockets, and IP (Internet Protocol) addresses. 
Internationalization: Help for writing programs that can be localized for users worldwide. Programs can automatically adapt to specific locales and be displayed in the appropriate language. 
Security: Both low level and high level, including electronic signatures, public and private key management, access control, and certificates. 
Software components: Known as JavaBeansTM, can plug into existing component architectures. 
Object serialization: Allows lightweight persistence and communication via Remote Method Invocation (RMI). 
Java Database Connectivity (JDBCTM): Provides uniform access to a wide range of relational databases. 


The Java platform also has APIs for 2D and 3D graphics, accessibility, servers, collaboration,
 telephony, speech, animation, and more. The following figure depicts what is included in the 
Java 2 SDK. 



5.4 How Will Java Technology Change My Life? 

We can’t promise you fame, fortune, or even a job if you learn the Java programming language. Still, it is likely to make your programs better and requires less effort than other languages. We believe that Java technology will help you do the following: 
Get started quickly: Although the Java programming language is a powerful object-oriented language, it’s easy to learn, especially for programmers already familiar with C or C++. 
Write less code: Comparisons of program metrics (class counts, method counts, and so on) suggest that a program written in the Java programming language can be four times smaller than the same program in C++. 
Write better code: The Java programming language encourages good coding practices, and its garbage collection helps you avoid memory leaks. Its object orientation, its JavaBeans component architecture, and its wide-ranging, easily extensible API let you reuse other people’s tested code and introduce fewer bugs. 
Develop programs more quickly: Your development time may be as much as twice as fast versus writing the same program in C++. Why? You write fewer lines of code and it is a simpler programming language than C++. 
Avoid platform dependencies with 100% Pure Java: You can keep your program portable by avoiding the use of libraries written in other languages. The 100% Pure Java TM Product Certification Program has a repository of historical process manuals, white papers, brochures, and similar materials online. 
Write once, run anywhere: Because 100% Pure Java programs are compiled into machine-independent byte codes, they run consistently on any Java platform. 
Distribute software more easily: You can upgrade applets easily from a central server. Applets take advantage of the feature of allowing new classes to be loaded “on the fly,” without recompiling the entire program. 
5.5 ODBC 

Microsoft Open Database Connectivity (ODBC) is a standard programming interface for application developers and database systems providers. Before ODBC became a de facto standard for Windows programs to interface with database systems, programmers had to use proprietary languages for each database they wanted to connect to. Now, ODBC has made the choice of the database system almost irrelevant from a coding perspective, which is as it should be. Application developers have much more important things to worry about than the syntax that is needed to port their program from one database to another when business needs suddenly change. 
Through the ODBC Administrator in Control Panel, you can specify the particular database that is associated with a data source that an ODBC application program is written to use. Think of an ODBC data source as a door with a name on it. Each door will lead you to a particular database. For example, the data source named Sales Figures might be a SQL Server database, whereas the Accounts Payable data source could refer to an Access database. The physical database referred to by a data source can reside anywhere on the LAN. 

The ODBC system files are not installed on your system by Windows 95. Rather, they are installed when you setup a separate database application, such as SQL Server Client or Visual Basic 4.0. When the ODBC icon is installed in Control Panel, it uses a file called ODBCINST.DLL. It is also possible to administer your ODBC data sources through a stand-alone program called ODBCADM.EXE. There is a 16-bit and a 32-bit version of this program and each maintains a separate list of ODBC data Sources. 

From a programming perspective, the beauty of ODBC is that the application can be written to use the same set of function calls to interface with any data source, regardless of the database vendor. The source code of the application doesn’t change whether it talks to Oracle or SQL Server. We only mention these two as an example. There are ODBC drivers available for several dozen popular database systems. Even Excel spreadsheets and plain text files can be turned into data sources. The operating system uses the Registry information written by ODBC Administrator to determine which low-level ODBC drivers are needed to talk to the data source (such as the interface to Oracle or SQL Server). The loading of the ODBC drivers is transparent to the ODBC application program. In a client/server environment, the ODBC API even handles many of the network issues for the application programmer. 

The advantages of this scheme are so numerous that you are probably thinking there must be some catch. The only disadvantage of ODBC is that it isn’t as efficient as talking directly to the native database interface. ODBC has had many detractors make the charge that it is too slow. Microsoft has always claimed that the critical factor in performance is the quality of the driver software that is used. In our humble opinion, this is true. The availability of good ODBC drivers has improved a great deal recently. And anyway, the criticism about performance is somewhat analogous to those who said that compilers would never match the speed of pure assembly language. Maybe not, but the compiler (or ODBC) gives you the opportunity to write cleaner programs, which means you finish sooner. Meanwhile, computers get faster every year.

5.6. JDBC

In an effort to set an independent database standard API for Java, Sun Microsystems developed Java Database Connectivity, or JDBC. JDBC offers a generic SQL database access mechanism that provides a consistent interface to a variety of RDBMS. This consistent interface is achieved through the use of “plug-in” database connectivity modules, or drivers. If a database vendor wishes to have JDBC support, he or she must provide the driver for each platform that the database and Java run on. 

To gain a wider acceptance of JDBC, Sun based JDBC’s framework on ODBC. As you discovered earlier in this chapter, ODBC has widespread support on a variety of platforms. Basing JDBC on ODBC will allow vendors to bring JDBC drivers to market much faster than developing a completely new connectivity solution. 

JDBC was announced in March of 1996. It was released for a 90 day public review that ended June 8, 1996. Because of user input, the final JDBC v1.0 specification was released soon after. 

The remainder of this section will cover enough information about JDBC for you to know what it is about and how to use it effectively. This is by no means a complete overview of JDBC. That would fill an entire book. 
5.6.1 JDBC Goals

Few software packages are designed without goals in mind. JDBC is one that, because of its many goals, drove the development of the API. These goals, in conjunction with early reviewer feedback, have finalized the JDBC class library into a solid framework for building database applications in Java. 

The goals that were set for JDBC are important. They will give you some insight as to why certain classes and functionalities behave the way they do.



 The design goals for JDBC are as follows: 

SQL Level API
       The designers felt that their main goal was to define a SQL interface for Java. Although not the lowest database interface level possible, it is at a low enough level for higher-level tools and APIs to be created. Conversely, it is at a high enough level for application programmers to use it confidently. Attaining this goal allows for future tool vendors to “generate” JDBC code and to hide many of JDBC’s complexities from the end user. 

SQL Conformance
	SQL syntax varies as you move from database vendor to database vendor. In an effort to support a wide variety of vendors, JDBC will allow any query statement to be passed through it to the underlying database driver. This allows the connectivity module to handle non-standard functionality in a manner that is suitable for its users. 

JDBC must be implemental on top of common database interfaces 
    	The JDBC SQL API must “sit” on top of other common SQL level APIs. This goal allows JDBC to use existing ODBC level drivers by the use of a software interface. This interface would translate JDBC calls to ODBC and vice versa. 

Provide a Java interface that is consistent with the rest of the Java system
Because of Java’s acceptance in the user community thus far, the designers feel that they should not stray from the current design of the core Java system. 

Keep it simple
This goal probably appears in all software design goal listings. JDBC is no exception. Sun felt that the design of JDBC should be very simple, allowing for only one method of completing a task per mechanism. Allowing duplicate functionality only serves to confuse the users of the API. 
Use strong, static typing wherever possible
      Strong typing allows for more error checking to be done at compile time; also, less error appear at runtime. 

Keep the common cases simple
      Because more often than not, the usual SQL calls used by the programmer are simple SELECT’s, INSERT’s, DELETE’s and UPDATE’s, these queries should be simple to perform with JDBC. However, more complex SQL statements should also be possible. 
Finally we decided to proceed the implementation using  Java Networking.And for dynamically updating the cache table we go for MS Access database.
     Java is also unusual in that each java program is both compiled and interpreted. with a compile you translate a java program into an intermediate language called java byte codes the platform-independent code instruction is passed and run on the computer.compilation happens just once; interpretation occurs each time the program is executed. the figure illustrates how this works.








you can think of java byte codes as the machine code instructions for the java virtual machine (java vm). every java interpreter, whether it’s a java development tool or a web browser that can run java applets, is an implementation of the java vm. the java vm can also be implemented in hardware.Java byte codes help make “write once, run anywhere” possible. you can compile your java program into byte codes on my platform that has a java compiler. the byte codes can then be run any implementation of the java vm. for example, the same java program can run windows nt, solaris, and macintosh.

 5.7 Netbeans:

	NetBeans is an integrated development environment (IDE) for developing primarily with Java, but also with other languages, in particular PHP, C/C++, and HTML5. It is also an application platform framework for Java desktop applications and and others. The NetBeans IDE is written in Java and can run on Windows, OS X, Linux, Solaris and other platforms supporting a compatible JVM. 

	The NetBeans Platform allows applications to be developed from a set of modular software components called modules. Applications based on the NetBeans Platform (including the NetBeans IDE itself) can be extended by third party developers.[1]

5.7.1 NetBeans Platform Features :
The main reusable features and components comprising the NetBeans Platform are outlined below. 

5.7.2 Module System:
	The modular nature of a NetBeans Platform application gives you the power to meet complex requirements by combining several small, simple, and easily tested modules encapsulating coarsely-grained application features. Powerful versioning support helps give you confidence that your modules will work together, while strict control over the public APIs your modules expose will help you create a more flexible application that's easier to maintain. Since your application can use either standard NetBeans Platform modules or OSGi bundles, you'll be able to integrate third-party modules or develop your own.

5.7.3 Lifecycle Management:
	Just as application servers, such as GlassFish or WebLogic, provide lifecycle services to web applications, the NetBeans runtime container provide lifecycle services to Java desktop applications. Application servers understand how to compose web modules, EJB modules, and related artifacts, into a single web application. 
	In a comparable manner, the NetBeans runtime container understands how to compose NetBeans modules into a single Java desktop application. 
There is no need to write a main method for your application because the NetBeans Platform already contains one. Also, support is provided for persisting user settings across restart of the application, such as, by default, the size and positions of the windows in the application. 

5.7.4. Pluggability, Service Infrastructure, and File System:
	 End users of the application benefit from pluggable applications because these enable them to install modules into their running applications. NetBeans modules can be installed, uninstalled, activated, and deactivated at runtime, thanks to the runtime container. The NetBeans Platform provides an infrastructure for registering and retrieving service implementations, enabling you to minimize direct dependencies between individual modules and enabling a loosely coupled architecture (high cohesion and low coupling). 
	The NetBeans Platform provides a virtual file system, which is a hierarhical registry for storing user settings, comparable to the Windows Registry on Microsoft Windows systems. It also includes a unified API providing stream-oriented access to flat and hierarchical structures, such as disk-based files on local or remote servers, memory-based files, and even XML documents. 

5.7.5 Window System, Standardized UI Toolkit, and Advanced Data-Oriented Components:
	 Most serious applications need more than one window. Coding good interaction between multiple windows is not a trivial task. The NetBeans window system lets you maximize/minimize, dock/undock, and drag-and-drop windows, without you providing any code at all. Swing and JavaFX are the standard UI toolkits on the Java desktop and can be used throughout the NetBeans Platform. Related benefits include the ability to change the look and feel easily via "Look and Feel" support in Swing and CSS integration in JavaFX, as well as the portability of GUI components across all operating systems and the easy incorporation of many free and commercial third-party Swing and JavaFX components. 	

	With the NetBeans Platform you're not constrained by one of the typical pain points in Swing: the JTree model is completely different to the JList model, even though they present the same data. Switching between them means rewriting the model. The NetBeans Nodes API provides a generic model for presenting your data. The NetBeans Explorer & Property Sheet API provides several advanced Swing components for displaying nodes. In addition to a window system, the NetBeans Platform provides many other UI-related components, such as a property sheet, a palette, complex Swing components for presenting data, a Plugin Manager, and an Output window. 

5.7.6 Miscellaneous Features, Documentation, and Tooling Support: 
	The NetBeans IDE, which is the software development kit (SDK) of the NewtBeans Platform, provides many templates and tools, such as the award winning Matisse GUI Builder that enables you to very easily design your application's layout. The NetBeans Platform exposes a rich set of APIs, which are tried, tested, and continually being improved. The community is helpful and diverse, while a vast library of blogs, books, tutorials, and training materials are continually being developed and updated in multiple languages by many different people around the world.

5.7.7 Apache Tomcat:
	Apache Tomcat (or simply Tomcat, formerly also Jakarta Tomcat) is an open source web server and servlet container developed by the Apache Software Foundation (ASF). Tomcat implements the Java Servlet and the JavaServer Pages (JSP) specifications from Oracle Corporation, and provides a "pure Java" HTTP web server environment for Java code to run. 




5.7.8 Component taxonomy: 
	Tomcat's architecture follows the construction of a Matrushka doll from Russia. In other words, it is all about containment where one entity contains another, and that entity in turn contains yet another. In Tomcat, a 'container' is a generic term that refers to any component that can contain another, such as a Server, Service, Engine, Host, or Context. Of these, the Server and Service components are special containers, designated as Top Level Elements as they represent aspects of the running Tomcat instance. All the other Tomcat components are subordinate to these top level elements. The Engine, Host, and Context components are officially termed Containers, and refer to components that process incoming requests and generate an appropriate outgoing response. 

	Nested Components can be thought of as sub-elements that can be nested inside either Top Level Elements or other Containers to configure how they function. Examples of nested components include the Valve, which represents a reusable unit of work; the Pipeline, which represents a chain of Valves strung together; and a Realm which helps set up container-managed security for a particular container. Other nested components include the Loader which is used to enforce the specification guidelines for servlet class loading; the Manager that supports session management for each web application; the Resources component that represents the web application's static resources and a mechanism to access these resources; and the Listener that allows you to insert custom processing at important points in a container's life cycle, such as when a component is being started or stopped. Not all nested components can be nested within every container. A final major component, which falls into its own category, is the Connector. It represents the connection end point that an external client (such as a web browser) can use to connect to the Tomcat container. 
     

5.7.9 Architectural benefits: 

	This architecture has a couple of useful features. It not only makes it easy to manage component life cycles (each component manages the life cycle notifications for its children), but also to dynamically assemble a running Tomcat server instance that is based on the information that has been read from configuration files at startup. In particular, the server.xml file is parsed at startup, and its contents are used to instantiate and configure the defined elements, which are then assembled into a running Tomcat instance. The server.xml file is read only once, and edits to it will not be picked up until Tomcat is restarted. This architecture also eases the configuration burden by allowing child containers to inherit the configuration of their parent containers. For instance, a Realm defines a data store that can be used for authentication and authorization of users who are attempting to access protected resources within a web application. For ease of configuration, a realm that is defined for an engine applies to all its children hosts and contexts. At the same time, a particular child, such as a given context, may override its inherited realm by specifying its own realm to be used in place of its parent's realm. 

5.7.10 Top Level Components: 

	The Server and Service container components exist largely as structural conveniences. A Server represents the running instance of Tomcat and contains one or more Service children, each of which represents a collection of request processing components. 
Server: A Server represents the entire Tomcat instance and is a singleton within a Java Virtual Machine, and is responsible for managing the life cycle of its contained services. The following image depicts the key aspects of the Server component. As shown, a Server instance is configured using the server.xml configuration file. The root element of this file is <Server> and represents the Tomcat instance. Its default implementation is provided using org.apache.catalina.core.StandardServer, but you can specify your own custom implementation through the class Name attribute of the <Server> element. 

           
	
A key aspect of the Server is that it opens a server socket on port 8005 (the default) to listen a shutdown command (by default, this command is the text string SHUTDOWN). When this shutdown command is received, the server gracefully shuts itself down. For security reasons, the connection requesting the shutdown must be initiated from the same machine that is running this instance of Tomcat. A Server also provides an implementation of the Java Naming and Directory Interface (JNDI) service, allowing you to register arbitrary objects (such as data sources) or environment variables, by name. At runtime, individual components (such as servlets) can retrieve this information by looking up the desired object name in the server's JNDI bindings. While a JNDI implementation is not integral to the functioning of a servlet container, it is part of the Java EE specification and is a service that servlets have a right to expect from their application servers or servlet containers. Implementing this service makes for easy portability of web applications across containers. While there is always just one server instance within a JVM, it is entirely possible to have multiple server instances running on a single physical machine, each encased in its own JVM. Doing so insulates web applications that are running on one VM from errors in applications that are running on others, and simplifies maintenance by allowing a JVM to be restarted independently of the others. This is one of the mechanisms used in a shared hosting environment (the other is virtual hosting, which we will see shortly) where you need isolation from other web applications that are running on the same physical server. 

5.7.11 Service: 

	While the Server represents the Tomcat instance itself, a Service represents the set of request processing components within Tomcat. A Server can contain more than one Service, where each service associates a group of Connector components with a single Engine. Requests from clients are received on a connector, which in turn funnels them through into the engine, which is the key request processing component within Tomcat. The image shows connectors for HTTP, HTTPS, and the Apache JServ Protocol (AJP). There is very little reason to modify this element, and the default Service instance is usually sufficient.
          
   
 A hint as to when you might need more than one Service instance can be found in the above image. As shown, a service aggregates connectors, each of which monitors a given IP address and port, and responds in a given protocol. An example use case for having multiple services, therefore, is when you want to partition your services (and their contained engines, hosts, and web applications) by IP address and/or port number. 

	For instance, you might configure your firewall to expose the connectors for one service to an external audience, while restricting your other service to hosting intranet applications that are visible only to internal users. This would ensure that an external user could never access your Intranet application, as that access would be blocked by the firewall. The Service, therefore, is nothing more than a grouping construct. It does not currently add any other value to the proceedings. 

5.7.12 Connectors: 

	A Connector is a service endpoint on which a client connects to the Tomcat container. It serves to insulate the engine from the various communication protocols that are used by clients, such as HTTP, HTTPS, or the Apache JServ Protocol (AJP). Tomcat can be configured to work in two modes—Standalone or in Conjunction with a separate web server. In standalone mode, 
          

Tomcat is configured with HTTP and HTTPS connectors, which make it act like a full-fledged web server by serving up static content when requested, as well as by delegating to the Catalina engine for dynamic content. Out of the box, Tomcat provides three possible implementations of the HTTP/1.1 and HTTPS connectors for this mode of operation. The most common are the standard connectors, known as Coyote which are implemented using standard Java I/O mechanisms. You may also make use of a couple of newer implementations, one which uses the non-blocking NIO features of Java 1.4, and the other which takes advantage of native code that is optimized for a particular operating system through the Apache Portable Runtime (APR). Note that both the Connector and the Engine run in the same JVM. 

	In fact, they run within the same Server instance. In conjunction mode, Tomcat plays a supporting role to a web server, such as Apache httpd or Microsoft's IIS. The client here is the web server, communicating with Tomcat either through an Apache module or an ISAPI DLL. When this module determines that a request must be routed to Tomcat for processing, it will communicate this request to Tomcat using AJP, a binary protocol that is designed to be more efficient than the text based HTTP when communicating between a web server and Tomcat. On the Tomcat side, an AJP connector accepts this communication and translates it into a form that the Catalina engine can process. 
	
         

	In this mode, Tomcat is running in its own JVM as a separate process from the web server. In either mode, the primary attributes of a Connector are the IP address and port on which it will listen for incoming requests, and the protocol that it supports. Another key attribute is the maximum number of request processing threads that can be created to concurrently handle incoming requests. Once all these threads are busy, any incoming request will be ignored until a thread becomes available. By default, a connector listens on all the IP addresses for the given physical machine (its address attribute defaults to 0.0.0.0). However, a connector can be configured to listen on just one of the IP addresses for a machine. This will constrain it to accept connections from only that specified IP address. Any request that is received by any one of a service's connectors is passed on to the service's single engine. This engine, known as Catalina, is responsible for the processing of the request, and the generation of the response. The engine returns the response to the connector, which then transmits it back to the client using the appropriate communication protocol.

5.8 SQL Server 2005

	Microsoft SQL Server is a relational database management system developed by Microsoft. As a database, it is a software product whose primary function is to store and retrieve data as requested by other software applications, be it those on the same computer or those running on another computer across a network (including the Internet). There are at least a dozen different editions of Microsoft SQL Server aimed at different audiences and for different workloads (ranging from small applications that store and retrieve data on the same computer, to millions of users and computers that access huge amounts of data from the Internet at the same time). True to its name, Microsoft SQL Server's primary query languages are T-SQL and ANSI SQL.

5.8.1 SQL Server Architecture Diagram:   

 








	
SQL Server 2005 (formerly codenamed "Yukon") was released in October 2005. It included native support for managing XML data, in addition to relational data.
 For this purpose, it defined an xml data type that could be used either as a data type in database columns or as literals in queries. 

	XML columns can be associated with XSD schemas; XML data being stored is verified against the schema. XML is converted to an internal binary data type before being stored in the database. Specialized indexing methods were made available for XML data. XML data is queried using XQuery; SQL Server 2005 added some extensions to the T-SQL language to allow embedding XQuery queries in T-SQL. In addition, it also defines a new extension to XQuery, called XML DML,  that allows query-based modifications to XML data. SQL Server 2005 also allows a database server to be exposed over web services using Tabular Data Stream (TDS) packets encapsulated within SOAP (protocol) requests. When the data is accessed over web services, results are returned as XML.

	 Common Language Runtime (CLR) integration was introduced with this version, enabling one to write SQL code as Managed Code by the CLR. For relational data, T-SQL has been augmented with error handling features (try/catch) and support for recursive queries with CTEs (Common Table Expressions). SQL Server 2005 has also been enhanced with new indexing algorithms, syntax and better error recovery systems. Data pages are check summed for better error resiliency, and optimistic concurrency support has been added for better performance. Permissions and access control have been made more granular and the query processor handles concurrent execution of queries in a more efficient way. Partitions on tables and indexes are supported natively, so scaling out a database onto a cluster is easier. 

	SQL CLR was introduced with SQL Server 2005 to let it integrate with the .NET Framework. SQL Server 2005 introduced "MARS" (Multiple Active Results Sets), a method of allowing usage of database connections for multiple purposes. SQL Server 2005 introduced DMVs (Dynamic Management Views), which are specialized views and functions that return server state information that can be used to monitor the health of a server instance, diagnose problems, and tune performance. Service Pack 1 (SP1) of SQL Server 2005 introduced Database Mirroring, a high availability option that provides redundancy and failover capabilities at the database level. Failover can be performed manually or can be configured for automatic failover. 

 





CHAPTER 6
SYSTEM STUDY
6.1 FEASIBILITY STUDY
The feasibility of the project is analyzed in this phase and business proposal is put forth with a very general plan for the project and some cost estimates. During system analysis the feasibility study of the proposed system is to be carried out. This is to ensure that the proposed system is not a burden to the company.  For feasibility analysis, some understanding of the major requirements for the system is essential.
Three key considerations involved in the feasibility analysis are	
ECONOMICAL FEASIBILITY
TECHNICAL FEASIBILITY
SOCIAL FEASIBILITY


6.1.1 ECONOMICAL FEASIBILITY         
     
  This study is carried out to check the economic impact that the system will have on the organization. The amount of fund that the company can pour into the research and development of the system is limited. The expenditures must be justified. Thus the developed system as well within the budget and this was achieved because most of the technologies used are freely available. Only the customized products had to be purchased. 

6.1.2 TECHNICAL FEASIBILITY      
             This study is carried out to check the technical feasibility, that is, the technical requirements of the system. Any system developed must not have a high demand on the available technical resources. This will lead to high demands on the available technical resources. This will lead to high demands being placed on the client. The developed system must have a modest requirement, as only minimal or null changes are required for implementing this system.   

6.1.3 SOCIAL FEASIBILITY       

           The aspect of study is to check the level of acceptance of the system by the user. This includes the process of training the user to use the system efficiently. The user must not feel threatened by the system, instead must accept it as a necessity. The level of acceptance by the users solely depends on the methods that are employed to educate the user about the system and to make him familiar with it. His level of confidence must be raised so that he is also able to make some constructive criticism, which is welcomed, as he is the final user of the system.

 6.2 SYSTEM TESTING AND MAINTENANCE

Testing is vital to the success of the system. System testing makes a logical assumption that if all parts of the system are correct, the goal will be successfully achieved. In the testing process we test the actual system in an organization and gather errors from the new system operates in full efficiency as stated. System testing is the stage of implementation, which is aimed to ensuring that the system works accurately and efficiently.
In the testing process we test the actual system in an organization and gather errors from the new system and take initiatives to correct the same. All the front-end and back-end connectivity are tested to be sure that the new system operates in full efficiency as stated. System testing is the stage of implementation, which is aimed at ensuring that the system works accurately and efficiently.
 The main objective of testing is to uncover errors from the system. For the uncovering process we have to give proper input data to the system. So we should have more conscious to give input data. It is important to give correct inputs to efficient testing.
Testing is done for each module. After testing all the modules, the modules are integrated and testing of the final system is done with the test data, specially designed to show that the system will operate successfully in all its aspects conditions. Thus the system testing is a confirmation that all is correct and an opportunity to show the user that the system works. Inadequate testing or non-testing leads to errors that may appear few months later. 
This will create two problems, Time delay between the cause and appearance of the problem. The effect of the system errors on files and records within the system.  The purpose of the system testing is to consider all the likely variations to which it will be suggested and push the system to its limits
The testing process focuses on logical intervals of the software ensuring that all the statements have been tested and on the function intervals (i.e.,) conducting tests to uncover errors and ensure that defined inputs will produce actual results that agree with the required results. Testing has to be done using the two common steps Unit testing and Integration testing. In the project system testing is made as follows:
The procedure level testing is made first. By giving improper inputs, the errors occurred are noted and eliminated. This is the final step in system life cycle. Here we implement the tested error-free system into real-life environment and make necessary changes, which runs in an online fashion. Here system maintenance is done every months or year based on company policies, and is checked for errors like runtime errors, long run errors and other maintenances like table verification and reports.	

 6.2.1 UNIT TESTING
 Unit testing verification efforts on the smallest unit of software design, module. This is known as “Module Testing”. The modules are tested separately. This testing is carried out during programming stage itself. In these testing steps, each module is found to be working satisfactorily as regard to the expected output from the module.

 6.2.2 INTEGRATION TESTING
Integration testing is a systematic technique for constructing tests to uncover error associated within the interface. In the project, all the modules are combined and then the entire programmer is tested as a whole. In the integration-testing step, all the error uncovered is corrected for the next testing steps.    
